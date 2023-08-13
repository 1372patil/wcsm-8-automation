package dataDrivenPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	// it is to generic reusable method
	// all the method are non static

	public String readExcelData(String excelpath, String sheetname, int rowcount, int cellcount)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;	
	}

	public int rowCount(String excelpath, String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis2 = new FileInputStream(excelpath);
		Workbook wb2 = WorkbookFactory.create(fis2);
		Sheet sheet = wb2.getSheet(sheetname);
		int rc = sheet.getLastRowNum();
		return rc;
	}

	public void writeExcelData(String excelpath, String exceldata, String sheetname, int rowcount, int cellcount,
			String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis1 = new FileInputStream(exceldata);
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sheet = wb1.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(excelpath);
		wb1.write(fos);

		// TODO Auto-generated method stub
	}

}