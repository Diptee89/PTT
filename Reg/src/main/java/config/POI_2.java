package config;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.WebDriver;

	import pages.Air_Carrier;

	@SuppressWarnings("unused")
	public class POI_2 {

		public static WebDriver driver;
		public static Workbook wb;
		public static Sheet sh;
		public static Row row;
		public static Cell cell;
		
		public static String strURL;
		public static String strLoginID;
		public static String strPassword;
		public static String strActivatePort;
		public static String strOrginPort;
		public static String strLastPortCall;
		public static String strNextPortCall;
		public static String strVesselName;
		public static String strStoragetype;
		public static String strManifest;
		public static String strTxtport;
		public static String strdescription;
		public static String strddlGrossWeightUOM;
		public static String strBOlQuantity;
		public static String strUnitQtyLanded;
		public static String strtxtPortofLanding;
		public static String strHscode1;
//		public static String strCargoClass;
		public static String strtxtCountryOfOrigin;
		public static String strCargoType;
		public static String strtxtQantityUOM;
		public static String strtxtDesc;
		public static String strConsignee;
		public static String strShpartyname;
		public static String strStextAddress1;
		public static String strcountry;
		public static String strSNMtxtState;
		public static String strSNMtxtCity;
//		public static String
//		public static String
//		public static String
//		public static String
//		public static String
//		public static String
//		public static String
//		public static String
		
		
		
		
	//	
//		public static String strPostalcode1;
		
		
		public POI_2() throws IOException {
			String filePath = "D:\\Selenium_code\\Cargo_Air_Mode\\src\\config\\Export.xlsx";

			File f = new File(filePath);
			FileInputStream is = new FileInputStream(f);
			wb = new XSSFWorkbook(is);
			sh = wb.getSheet("LoginId");

			strURL = sh.getRow(1).getCell(2).getStringCellValue();
			strLoginID = sh.getRow(2).getCell(2).getStringCellValue();
			strPassword = sh.getRow(3).getCell(2).getStringCellValue();
			strActivatePort = sh.getRow(4).getCell(2).getStringCellValue();
			strOrginPort = sh.getRow(5).getCell(2).getStringCellValue();
			strLastPortCall = sh.getRow(6).getCell(2).getStringCellValue();
			strNextPortCall = sh.getRow(7).getCell(2).getStringCellValue();
			strVesselName = sh.getRow(8).getCell(2).getStringCellValue();
	        strStoragetype = sh.getRow(9).getCell(2).getStringCellValue();
	        strManifest = sh.getRow(10).getCell(2).getStringCellValue();
	        strTxtport = sh.getRow(11).getCell(2).getStringCellValue();
	        strdescription = sh.getRow(12).getCell(2).getStringCellValue();
	        strddlGrossWeightUOM = sh.getRow(13).getCell(2).getStringCellValue();
	        strBOlQuantity = sh.getRow(14).getCell(2).getStringCellValue();
	        strUnitQtyLanded = sh.getRow(15).getCell(2).getStringCellValue();
	        strtxtPortofLanding = sh.getRow(16).getCell(2).getStringCellValue();
	        strHscode1 = sh.getRow(17).getCell(2).getStringCellValue();
//	        strCargoClass = sh.getRow(18).getCell(2).getStringCellValue();
	        strtxtCountryOfOrigin = sh.getRow(18).getCell(2).getStringCellValue();
	        strCargoType = sh.getRow(19).getCell(2).getStringCellValue();
	        strtxtQantityUOM = sh.getRow(20).getCell(2).getStringCellValue();
	        strtxtDesc = sh.getRow(21).getCell(2).getStringCellValue();
	        strConsignee = sh.getRow(22).getCell(2).getStringCellValue();
	        strShpartyname = sh.getRow(23).getCell(2).getStringCellValue();
	        strStextAddress1 = sh.getRow(24).getCell(2).getStringCellValue();
	        strcountry = sh.getRow(25).getCell(2).getStringCellValue();
	        strSNMtxtState = sh.getRow(26).getCell(2).getStringCellValue();
	        strSNMtxtCity = sh.getRow(27).getCell(2).getStringCellValue();
//	        strcountry = sh.getRow(24).getCell(2).getStringCellValue();
//	        strcountry = sh.getRow(24).getCell(2).getStringCellValue();
//	        strcountry = sh.getRow(24).getCell(2).getStringCellValue();
//	        strcountry = sh.getRow(24).getCell(2).getStringCellValue();
//	        strcountry = sh.getRow(24).getCell(2).getStringCellValue();
//	        strcountry = sh.getRow(24).getCell(2).getStringCellValue();
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
			is.close();
		}	
		
}
