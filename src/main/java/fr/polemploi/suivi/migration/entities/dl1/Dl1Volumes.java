package fr.polemploi.suivi.migration.entities.dl1;

import java.util.Objects;

import fr.polemploi.suivi.migration.entities.alert.Alert;

/**
 * POJO contenant les volumes de données dans les base oracle et le volume
 * attendu depuis les logs.
 *
 * @author jbourrea
 *
 */
public class Dl1Volumes extends Alert {

	private Integer volumeOracle;

	private Integer volumeLog;

	private boolean isVague1;

	public Dl1Volumes() {
		super();
		this.volumeOracle = 0;
		this.volumeLog = 0;
		this.isVague1 = false;
	}

	public Integer getVolumeOracle() {
		return this.volumeOracle;
	}

	public void setVolumeOracle(Integer volumeOracle) {
		this.volumeOracle = volumeOracle;
	}

	public Integer getVolumeLog() {
		return this.volumeLog;
	}

	public void setVolumeLog(Integer volumeLog) {
		this.volumeLog = volumeLog;
	}

	public boolean getIsVague1() {
		return this.isVague1;
	}

	public void setVague1(boolean isVague1) {
		this.isVague1 = isVague1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.isVague1, this.volumeLog, this.volumeOracle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Dl1Volumes other)) {
			return false;
		}
		return this.isVague1 == other.isVague1 && Objects.equals(this.volumeLog, other.volumeLog)
				&& Objects.equals(this.volumeOracle, other.volumeOracle);
	}

	@Override
	public String toString() {
		return "Dl1Volumes [volumeOracle=" + this.volumeOracle + ", volumeLog=" + this.volumeLog + ", isVague1="
				+ this.isVague1 + "]";
	}

}
