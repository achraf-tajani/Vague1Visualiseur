package fr.polemploi.suivi.migration.monitor;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.scheduling.support.TaskUtils;
import org.springframework.stereotype.Component;

import fr.polemploi.suivi.migration.monitor.event.FolderChangeEvent;

@Component
@Configuration
public class PEFileSystemListener {

	private static final Logger logger = LoggerFactory.getLogger(PEFileSystemListener.class);

	private final ApplicationEventPublisher eventPublisher;

	PEFileSystemListener(ApplicationEventPublisher eventPublisher) {
		this.eventPublisher = eventPublisher;
	}

	@Bean
	ApplicationEventMulticaster applicationEventMulticaster() {
		SimpleApplicationEventMulticaster eventMulticaster = new SimpleApplicationEventMulticaster();
		eventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
		eventMulticaster.setErrorHandler(TaskUtils.LOG_AND_SUPPRESS_ERROR_HANDLER);
		return eventMulticaster;
	}

	@SuppressWarnings("unchecked")
	public void start(String folderName) {
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
		singleThreadExecutor.execute(() -> {
			try {
				PEFileSystemListener.logger.info("Folder watch service started");

				WatchService watchService = FileSystems.getDefault().newWatchService();
				Path folder = Paths.get(folderName);
				folder.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
						StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);

				WatchKey key;
				while ((key = watchService.take()) != null) {
					for (WatchEvent<?> event : key.pollEvents()) {
						WatchEvent.Kind<?> kind = event.kind();

						if (kind == StandardWatchEventKinds.OVERFLOW) {
							continue;
						}

						WatchEvent<Path> pathEvent = (WatchEvent<Path>) event;
						Path path = folder.resolve(pathEvent.context());

						PEFileSystemListener.logger.info("Folder change event is published: {}", pathEvent);
						this.eventPublisher.publishEvent(new FolderChangeEvent(this, pathEvent, path));
					}

					boolean valid = key.reset();
					if (!valid) {
						break;
					}
				}

				watchService.close();
				PEFileSystemListener.logger.info("Folder watch service finished");
			} catch (Exception e) {
				PEFileSystemListener.logger.error("Folder watch service failed", e);
			}
		});
	}
}
