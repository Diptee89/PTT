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
public class POI {

	public static WebDriver driver;
	public static Workbook wb;
	public static Sheet sh;
	public static Row row;
	public static Cell cell;
	
	public static String strURL;
	public static String strLoginID;
	public static String strPassword;
	public static String strNationality;
	public static String strCname;
	public static String strcarrierOwner;
	public static String strRemerks;
	public static String strOrginNo;
	public static String strDestinationPort;
//	public static String strCity;
//	public static String strState;
//	public static String strPostalCode;
//	public static String strUsername;
//	public static String strCountry1;
//	public static String strState1;
//	public static String strCity1;
//	public static String strPostalcode1;
//	public static String strUsername1;
//	public static String strCountry12;
//	public static String strState12;
//	public static String strCity13;
//	public static String strPostalcode131;
//	public static String ;
	
	
	
	
	
	
	
	
//	jlmadmin1@lackmail.ru
//	public static String strPostalcode1;
	
	
	public POI() throws IOException {
		String filePath = "D:\\Selenium_code\\Cargo_Air_Mode\\src\\config\\Orgnatation.xlsx";

		File f = new File(filePath);
		FileInputStream is = new FileInputStream(f);
		wb = new XSSFWorkbook(is);
		sh = wb.getSheet("LoginId");

		strURL = sh.getRow(1).getCell(2).getStringCellValue();
		strLoginID = sh.getRow(2).getCell(2).getStringCellValue();
		strPassword = sh.getRow(3).getCell(2).getStringCellValue();
		strNationality = sh.getRow(4).getCell(2).getStringCellValue();
		strCname = sh.getRow(5).getCell(2).getStringCellValue();
		strcarrierOwner = sh.getRow(6).getCell(2).getStringCellValue();
		strRemerks = sh.getRow(7).getCell(2).getStringCellValue();
        strOrginNo = sh.getRow(8).getCell(2).getStringCellValue();
        strDestinationPort = sh.getRow(9).getCell(2).getStringCellValue();
//        strUsername = sh.getRow(11).getCell(2).getStringCellValue();
//        strCountry1 = sh.getRow(12).getCell(2).getStringCellValue();
//        strState1 = sh.getRow(13).getCell(2).getStringCellValue();
//        strCity1 = sh.getRow(14).getCell(2).getStringCellValue();
//        strPostalcode1 = sh.getRow(15).getCell(2).getStringCellValue();
//        strUsername1 = sh.getRow(16).getCell(2).getStringCellValue();
//        strCountry12 = sh.getRow(17).getCell(2).getStringCellValue();
//        strState12 = sh.getRow(18).getCell(2).getStringCellValue();
//        strCity13 = sh.getRow(19).getCell(2).getStringCellValue();
//         strPostalcode131 = sh.getRow(20).getCell(2).getStringCellValue();
        
        
		is.close();
	}	
	
}
