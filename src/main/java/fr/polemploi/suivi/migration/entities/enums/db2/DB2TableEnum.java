package fr.polemploi.suivi.migration.entities.enums.db2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Enumération des tables de la base DL1.
 *
 * @author jbourrea
 *
 */
public enum DB2TableEnum {

	P2702AD("P2702A", "D"),
	PT399AD("PT399A", "D"),
	P2801AP("P2801A", "P"),
	P0101AS("P0101A", "S"),
	P2801BS("P2801B", "S"),
	P0101BU("P0101B", "U"),
	P3301BU("P3301B", "U"),
	P2801AD("P2801A", "D"),
	P0101AP("P0101A", "P"),
	P2801BP("P2801B", "P"),
	P0101BS("P0101B", "S"),
	P3301BS("P3301B", "S"),
	P0101CU("P0101C", "U"),
	P3301CU("P3301C", "U"),
	P0101AD("P0101A", "D"),
	P2801BD("P2801B", "D"),
	P0101BP("P0101B", "P"),
	P3301BP("P3301B", "P"),
	P0101CS("P0101C", "S"),
	P3301CS("P3301C", "S"),
	P0101DU("P0101D", "U"),
	P3302AU("P3302A", "U"),
	P0101BD("P0101B", "D"),
	P3301BD("P3301B", "D"),
	P0101CP("P0101C", "P"),
	P3301CP("P3301C", "P"),
	P0101DS("P0101D", "S"),
	P3302AS("P3302A", "S"),
	P0101FU("P0101F", "U"),
	P3361BU("P3361B", "U"),
	P0101CD("P0101C", "D"),
	P3301CD("P3301C", "D"),
	P0101DP("P0101D", "P"),
	P3302AP("P3302A", "P"),
	P0101FS("P0101F", "S"),
	P3361BS("P3361B", "S"),
	P0101NU("P0101N", "U"),
	P3361CU("P3361C", "U"),
	P0101DD("P0101D", "D"),
	P3302AD("P3302A", "D"),
	P0101FP("P0101F", "P"),
	P3361BP("P3361B", "P"),
	P0101NS("P0101N", "S"),
	P3361CS("P3361C", "S"),
	P0101SU("P0101S", "U"),
	P7001AU("P7001A", "U"),
	P0101FD("P0101F", "D"),
	P3361BD("P3361B", "D"),
	P0101NP("P0101N", "P"),
	P3361CP("P3361C", "P"),
	P0101SS("P0101S", "S"),
	P7001AS("P7001A", "S"),
	P0105AU("P0105A", "U"),
	P7101AU("P7101A", "U"),
	P0101ND("P0101N", "D"),
	P3361CD("P3361C", "D"),
	P0101SP("P0101S", "P"),
	P7001AP("P7001A", "P"),
	P0105AS("P0105A", "S"),
	P7101AS("P7101A", "S"),
	P0141AU("P0141A", "U"),
	P7101BU("P7101B", "U"),
	P0101SD("P0101S", "D"),
	P7001AD("P7001A", "D"),
	P0105AP("P0105A", "P"),
	P7101AP("P7101A", "P"),
	P0141AS("P0141A", "S"),
	P7101BS("P7101B", "S"),
	P0141BU("P0141B", "U"),
	P9001NU("P9001N", "U"),
	P0105AD("P0105A", "D"),
	P7101AD("P7101A", "D"),
	P0141AP("P0141A", "P"),
	P7101BP("P7101B", "P"),
	P0141BS("P0141B", "S"),
	P9001NS("P9001N", "S"),
	P0141DU("P0141D", "U"),
	PD2A01U("PD2A01", "U"),
	P0141AD("P0141A", "D"),
	P7101BD("P7101B", "D"),
	P0141BP("P0141B", "P"),
	P9001NP("P9001N", "P"),
	P0141DS("P0141D", "S"),
	PD2A01S("PD2A01", "S"),
	P0151CU("P0151C", "U"),
	PD2A02U("PD2A02", "U"),
	P0141BD("P0141B", "D"),
	P9001ND("P9001N", "D"),
	P0141DP("P0141D", "P"),
	PD2A01P("PD2A01", "P"),
	P0151CS("P0151C", "S"),
	PD2A02S("PD2A02", "S"),
	P0151EU("P0151E", "U"),
	PD2A03U("PD2A03", "U"),
	P0141DD("P0141D", "D"),
	PD2A01D("PD2A01", "D"),
	P0151CP("P0151C", "P"),
	PD2A02P("PD2A02", "P"),
	P0151ES("P0151E", "S"),
	PD2A03S("PD2A03", "S"),
	P0151FU("P0151F", "U"),
	PD2G04U("PD2G04", "U"),
	P0151CD("P0151C", "D"),
	PD2A02D("PD2A02", "D"),
	P0151EP("P0151E", "P"),
	PD2A03P("PD2A03", "P"),
	P0151FS("P0151F", "S"),
	PD2G04S("PD2G04", "S"),
	P0151GU("P0151G", "U"),
	PD2I2FU("PD2I2F", "U"),
	P0151ED("P0151E", "D"),
	PD2A03D("PD2A03", "D"),
	P0151FP("P0151F", "P"),
	PD2G04P("PD2G04", "P"),
	P0151GS("P0151G", "S"),
	PD2I2FS("PD2I2F", "S"),
	P0151JU("P0151J", "U"),
	PD2I2LU("PD2I2L", "U"),
	P0151FD("P0151F", "D"),
	PD2G04D("PD2G04", "D"),
	P0151GP("P0151G", "P"),
	PD2I2FP("PD2I2F", "P"),
	P0151JS("P0151J", "S"),
	PD2I2LS("PD2I2L", "S"),
	P0151RU("P0151R", "U"),
	PD2I2PU("PD2I2P", "U"),
	P0151GD("P0151G", "D"),
	PD2I2FD("PD2I2F", "D"),
	P0151JP("P0151J", "P"),
	PD2I2LP("PD2I2L", "P"),
	P0151RS("P0151R", "S"),
	PD2I2PS("PD2I2P", "S"),
	P0151SU("P0151S", "U"),
	PD2I2SU("PD2I2S", "U"),
	P0151JD("P0151J", "D"),
	PD2I2LD("PD2I2L", "D"),
	P0151RP("P0151R", "P"),
	PD2I2PP("PD2I2P", "P"),
	P0151SS("P0151S", "S"),
	PD2I2SS("PD2I2S", "S"),
	P0161AU("P0161A", "U"),
	PD2M11U("PD2M11", "U"),
	P0151RD("P0151R", "D"),
	PD2I2PD("PD2I2P", "D"),
	P0151SP("P0151S", "P"),
	PD2I2SP("PD2I2S", "P"),
	P0161AS("P0161A", "S"),
	PD2M11S("PD2M11", "S"),
	P0161BU("P0161B", "U"),
	PD2M12U("PD2M12", "U"),
	P0151SD("P0151S", "D"),
	PD2I2SD("PD2I2S", "D"),
	P0161AP("P0161A", "P"),
	PD2M11P("PD2M11", "P"),
	P0161BS("P0161B", "S"),
	PD2M12S("PD2M12", "S"),
	P0161CU("P0161C", "U"),
	PD2M21U("PD2M21", "U"),
	P0161AD("P0161A", "D"),
	PD2M11D("PD2M11", "D"),
	P0161BP("P0161B", "P"),
	PD2M12P("PD2M12", "P"),
	P0161CS("P0161C", "S"),
	PD2M21S("PD2M21", "S"),
	P0161DU("P0161D", "U"),
	PD2M22U("PD2M22", "U"),
	P0161BD("P0161B", "D"),
	PD2M12D("PD2M12", "D"),
	P0161CP("P0161C", "P"),
	PD2M21P("PD2M21", "P"),
	P0161DS("P0161D", "S"),
	PD2M22S("PD2M22", "S"),
	P0161FU("P0161F", "U"),
	PD2M32U("PD2M32", "U"),
	P0161CD("P0161C", "D"),
	PD2M21D("PD2M21", "D"),
	P0161DP("P0161D", "P"),
	PD2M22P("PD2M22", "P"),
	P0161FS("P0161F", "S"),
	PD2M32S("PD2M32", "S"),
	P0161SU("P0161S", "U"),
	PD2M6AU("PD2M6A", "U"),
	P0161DD("P0161D", "D"),
	PD2M22D("PD2M22", "D"),
	P0161FP("P0161F", "P"),
	PD2M32P("PD2M32", "P"),
	P0161SS("P0161S", "S"),
	PD2M6AS("PD2M6A", "S"),
	P0165AU("P0165A", "U"),
	PD2M6BU("PD2M6B", "U"),
	P0161FD("P0161F", "D"),
	PD2M32D("PD2M32", "D"),
	P0161SP("P0161S", "P"),
	PD2M6AP("PD2M6A", "P"),
	P0165AS("P0165A", "S"),
	PD2M6BS("PD2M6B", "S"),
	P0171CU("P0171C", "U"),
	PD2S01U("PD2S01", "U"),
	P0161SD("P0161S", "D"),
	PD2M6AD("PD2M6A", "D"),
	P0165AP("P0165A", "P"),
	PD2M6BP("PD2M6B", "P"),
	P0171CS("P0171C", "S"),
	PD2S01S("PD2S01", "S"),
	P0171SU("P0171S", "U"),
	PD2S02U("PD2S02", "U"),
	P0165AD("P0165A", "D"),
	PD2M6BD("PD2M6B", "D"),
	P0171CP("P0171C", "P"),
	PD2S01P("PD2S01", "P"),
	P0171SS("P0171S", "S"),
	PD2S02S("PD2S02", "S"),
	P0172SU("P0172S", "U"),
	PD2S04U("PD2S04", "U"),
	P0171CD("P0171C", "D"),
	PD2S01D("PD2S01", "D"),
	P0171SP("P0171S", "P"),
	PD2S02P("PD2S02", "P"),
	P0172SS("P0172S", "S"),
	PD2S04S("PD2S04", "S"),
	P0404HU("P0404H", "U"),
	PD2S07U("PD2S07", "U"),
	P0171SD("P0171S", "D"),
	PD2S02D("PD2S02", "D"),
	P0172SP("P0172S", "P"),
	PD2S04P("PD2S04", "P"),
	P0404HS("P0404H", "S"),
	PD2S07S("PD2S07", "S"),
	P0404IU("P0404I", "U"),
	PD2S9AU("PD2S9A", "U"),
	P0172SD("P0172S", "D"),
	PD2S04D("PD2S04", "D"),
	P0404HP("P0404H", "P"),
	PD2S07P("PD2S07", "P"),
	P0404IS("P0404I", "S"),
	PD2S9AS("PD2S9A", "S"),
	P0404NU("P0404N", "U"),
	PD2U5AU("PD2U5A", "U"),
	P0404HD("P0404H", "D"),
	PD2S07D("PD2S07", "D"),
	P0404IP("P0404I", "P"),
	PD2S9AP("PD2S9A", "P"),
	P0404NS("P0404N", "S"),
	PD2U5AS("PD2U5A", "S"),
	P0404PU("P0404P", "U"),
	PD2U5BU("PD2U5B", "U"),
	P0404ID("P0404I", "D"),
	PD2S9AD("PD2S9A", "D"),
	P0404NP("P0404N", "P"),
	PD2U5AP("PD2U5A", "P"),
	P0404PS("P0404P", "S"),
	PD2U5BS("PD2U5B", "S"),
	P0404RU("P0404R", "U"),
	PD2U5DU("PD2U5D", "U"),
	P0404ND("P0404N", "D"),
	PD2U5AD("PD2U5A", "D"),
	P0404PP("P0404P", "P"),
	PD2U5BP("PD2U5B", "P"),
	P0404RS("P0404R", "S"),
	PD2U5DS("PD2U5D", "S"),
	P0404UU("P0404U", "U"),
	PD2U5FU("PD2U5F", "U"),
	P0404PD("P0404P", "D"),
	PD2U5BD("PD2U5B", "D"),
	P0404RP("P0404R", "P"),
	PD2U5DP("PD2U5D", "P"),
	P0404US("P0404U", "S"),
	PD2U5FS("PD2U5F", "S"),
	P0404VU("P0404V", "U"),
	PT3701U("PT3701", "U"),
	P0404RD("P0404R", "D"),
	PD2U5DD("PD2U5D", "D"),
	P0404UP("P0404U", "P"),
	PD2U5FP("PD2U5F", "P"),
	P0404VS("P0404V", "S"),
	PT3701S("PT3701", "S"),
	P0404XU("P0404X", "U"),
	PT3702U("PT3702", "U"),
	P0404UD("P0404U", "D"),
	PD2U5FD("PD2U5F", "D"),
	P0404VP("P0404V", "P"),
	PT3701P("PT3701", "P"),
	P0404XS("P0404X", "S"),
	PT3702S("PT3702", "S"),
	P0404YU("P0404Y", "U"),
	PT3703U("PT3703", "U"),
	P0404VD("P0404V", "D"),
	PT3701D("PT3701", "D"),
	P0404XP("P0404X", "P"),
	PT3702P("PT3702", "P"),
	P0404YS("P0404Y", "S"),
	PT3703S("PT3703", "S"),
	P1140AU("P1140A", "U"),
	PT3704U("PT3704", "U"),
	P0404XD("P0404X", "D"),
	PT3702D("PT3702", "D"),
	P0404YP("P0404Y", "P"),
	PT3703P("PT3703", "P"),
	P1140AS("P1140A", "S"),
	PT3704S("PT3704", "S"),
	P1150AU("P1150A", "U"),
	PT3705U("PT3705", "U"),
	P0404YD("P0404Y", "D"),
	PT3703D("PT3703", "D"),
	P1140AP("P1140A", "P"),
	PT3704P("PT3704", "P"),
	P1150AS("P1150A", "S"),
	PT3705S("PT3705", "S"),
	P1299BU("P1299B", "U"),
	PT3707U("PT3707", "U"),
	P1140AD("P1140A", "D"),
	PT3704D("PT3704", "D"),
	P1150AP("P1150A", "P"),
	PT3705P("PT3705", "P"),
	P1299BS("P1299B", "S"),
	PT3707S("PT3707", "S"),
	P1299CU("P1299C", "U"),
	PT3711U("PT3711", "U"),
	P1150AD("P1150A", "D"),
	PT3705D("PT3705", "D"),
	P1299BP("P1299B", "P"),
	PT3707P("PT3707", "P"),
	P1299CS("P1299C", "S"),
	PT3711S("PT3711", "S"),
	P1299DU("P1299D", "U"),
	PT3712U("PT3712", "U"),
	P1299BD("P1299B", "D"),
	PT3707D("PT3707", "D"),
	P1299CP("P1299C", "P"),
	PT3711P("PT3711", "P"),
	P1299DS("P1299D", "S"),
	PT3712S("PT3712", "S"),
	P1299EU("P1299E", "U"),
	PT3714U("PT3714", "U"),
	P1299CD("P1299C", "D"),
	PT3711D("PT3711", "D"),
	P1299DP("P1299D", "P"),
	PT3712P("PT3712", "P"),
	P1299ES("P1299E", "S"),
	PT3714S("PT3714", "S"),
	P2701AU("P2701A", "U"),
	PT3715U("PT3715", "U"),
	P1299DD("P1299D", "D"),
	PT3712D("PT3712", "D"),
	P1299EP("P1299E", "P"),
	PT3714P("PT3714", "P"),
	P2701AS("P2701A", "S"),
	PT3715S("PT3715", "S"),
	P2702AU("P2702A", "U"),
	PT399AU("PT399A", "U"),
	P1299ED("P1299E", "D"),
	PT3714D("PT3714", "D"),
	P2701AP("P2701A", "P"),
	PT3715P("PT3715", "P"),
	P2702AS("P2702A", "S"),
	PT399AS("PT399A", "S"),
	P2801AU("P2801A", "U"),
	P2701AD("P2701A", "D"),
	PT3715D("PT3715", "D"),
	P2702AP("P2702A", "P"),
	PT399AP("PT399A", "P"),
	P2801AS("P2801A", "S"),
	P0101AU("P0101A", "U"),
	P2801BU("P2801B", "U"),
	PD2M31P("PD2M31", "P"),
	PD2M31D("PD2M31", "D"),
	PD2M31U("PD2M31", "U"),
	PD2M31S("PD2M31", "S");

	// TODO JBOU PD2M31 4 PDUS en doublon ?

	private String tableName;

	private String branchName;

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	private DB2TableEnum(String tableName, String branchName) {
		this.tableName = tableName;
		this.branchName = branchName;
	}

	public static List<DB2TableEnum> getDB2Tables() {
		Map<String, DB2TableEnum> results = new HashMap<>();

		for (DB2TableEnum table : DB2TableEnum.values()) {
			results.put(table.getTableName(), table);
		}

		return new ArrayList<DB2TableEnum>(results.values());

	}

}
