package tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @echo 2013-11-11 创建mysql数据库表，分库分表sql。 客服系统IVR外呼表
 */
public class creatMysqlTable {

	public static void main(String[] args) throws IOException {
		String fileName = "D:" + File.separator + "t_tenpay_appeal_IVR.sql";
		File f = new File(fileName);
		OutputStream out = new FileOutputStream(f);
		String db="";
		String tb="";
		String str1 = "";
		String str2 ="";
		
		String sql="";
		
		for(int i=2013;i<=2023;i++){
			db="db_apeal_IVR_"+i;
			str1 = "drop database if exists "+db+";\n"
					+ "/*==============================================================*/\n"
					+ "/* Database: "+db+"                               */\n"
					+ "/*==============================================================*/\n"
					+ "create database "+db+";";
			sql+=str1;
			for(int j=1;j<=12;j++){
				if(j<10)
					tb="t_tenpay_appeal_IVR_0"+j;
				else
				tb="t_tenpay_appeal_IVR_"+j;
				
				 str2 = "use "+db+";\n"
						+ "SET FOREIGN_KEY_CHECKS=0;\n"
						+ "DROP TABLE IF EXISTS `"+tb+"`;\n"
						+ "-- ----------------------------\n"
						+ "-- Table structure for `"+tb+"`\n"
						+ "-- ----------------------------\n"
						+ "CREATE TABLE `"+tb+"` (\n"
						+ "`FAppealID` varchar(64) NOT NULL default '',\n"
						+ "`FAppealType` int(11) NOT NULL default '0',\n"
						+ "`Fuin` varchar(65) NOT NULL default '',\n"
						+ "`Fuid` varchar(65) NOT NULL default '',\n"
						+ "`Fmobile` varchar(20) NOT NULL default '',\n"
						+ "`Ftruename` varchar(80) default '',\n"
						+ "`FAutoAppeal` int(2) NOT NULL default '0',\n" //1:高分单
						+ "`FAppealTime` datetime NOT NULL default '1970-01-01 00:00:00',\n"
						+ "`FAppealMoney` bigint(20) default '0',\n"
						+ "`Fstate` int(11) NOT NULL default '0',\n"
						+ "`FPickTime` datetime NOT NULL default '1977-01-01 00:00:00',\n"
						+ "`FModifyTime` datetime NOT NULL default '1977-01-01 00:00:00',\n"
						+ "`FCallNum` int(11) NOT NULL default '0',\n"
						+ "`FLastCallTime` datetime default '1977-01-01 00:00:00',\n"
						+ "`FCallResult` int(11) default '0',\n"
						+ "`FCallMemo` varchar(100) default '',\n"
						+ "`FintStandby1` int(11) NOT NULL default '0',\n"
						+ "`FintStandby2` int(11) NOT NULL default '0',\n"
						+ "`FstrStandby1` varchar(100) NOT NULL default '',\n"
						+ "`FstrStandby2` varchar(100) NOT NULL default '',\n"
						+ "PRIMARY KEY  (`FAppealID`),\n"
						+ "KEY `I_appealtime_IVR` (`FAppealTime`)\n"
						+ ") ENGINE=InnoDB DEFAULT CHARSET=latin1;\n";
				sql+=str2;
				sql+="\n\n";
			}
			sql+="\n\n";
		}
		byte[] b = sql.getBytes();
		out.write(b);
		out.close();

	}

}
