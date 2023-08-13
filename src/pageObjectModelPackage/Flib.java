package pageObjectModelPackage;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	
		
		//this method it is used to read excel data
		
		public String readExcelData(String excelpath,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException {
		  FileInputStream fis = new FileInputStream(excelpath);
		  Workbook wb = WorkbookFactory.create(fis);
		  Sheet sheet = wb.getSheet(sheetname);
		  Row row = sheet.getRow(rowcount);
		  Cell cell = row.getCell(cellcount);
		  String data = cell.getStringCellValue();
		  return data;
		}
		//generalize the row count
		public int rowCount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream(excelpath);
		    Workbook wb = WorkbookFactory.create(fis);
		    Sheet sheet = wb.getSheet(sheetname);
		    int rc = sheet.getLastRowNum();
		    return rc;
		}
		
		//this method are used to write the exceldata
		public void writeExcelData(String excelpath,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException {
			
			FileInputStream fis = new FileInputStream(excelpath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetname);
			Row row = sheet.getRow(rowcount);
			Cell cell = row.createCell(cellcount);
			
			FileOutputStream fos = new FileOutputStream(excelpath);
			wb.write(fos);
		}
		//this method is used tto readpropertydata
		public String readPropertyData(String excelpath,String key) throws EncryptedDocumentException, IOException {
			
			FileInputStream fis = new FileInputStream(excelpath);
			Properties prop = new Properties();
			prop.load(fis);
		    String data = prop.getProperty(key);
		    return data;
			
		}
		//this method are used to generalize the Cell Count
		public short cellCount(String excelpath,String sheetname,int rowcount) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream(excelpath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetname);
			Row row = sheet.getRow(rowcount);
            short cc = row.getLastCellNum();
            return cc;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}