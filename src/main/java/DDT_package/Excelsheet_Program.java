package DDT_package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Excelsheet_Program {
	
	public static String emailorphone;
	public static String pwd;
	public static String wemailorphone;
	public static String wpwd;
	
	public static void excelsheet_data_fetching() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\dipal\\eclipse-workspace\\Project1_Automation\\ExcelFiles\\amz_login.xlsx");
		Workbook w1= WorkbookFactory.create(f1);
		Sheet s1=(Sheet) w1.getSheet("login");	
	emailorphone=NumberToTextConverter.toText(w1.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
	
	Row r2= s1.getRow(1);
	Cell c2=r2.getCell(1);
	pwd=c2.getStringCellValue();
	
	}
	public static void excelsheet_invaliddata_fetching() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\dipal\\eclipse-workspace\\Project1_Automation\\ExcelFiles\\amz_login.xlsx");
		Workbook w1= WorkbookFactory.create(f1);
		Sheet s1=(Sheet) w1.getSheet("login");	
	wemailorphone=NumberToTextConverter.toText(w1.getSheet("login").getRow(2).getCell(0).getNumericCellValue());
	
	Row r2= s1.getRow(2);
	Cell c2=r2.getCell(1);
	wpwd=c2.getStringCellValue(); 
	
	
	}

}

