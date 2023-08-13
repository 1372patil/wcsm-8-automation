package readExceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.opentelemetry.sdk.metrics.data.Data;

public class ReadMultipleExceldata {
	
	//read the data from ipl sheet

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//read multiple data by using for loop
		FileInputStream fis2 = new FileInputStream("./data/Test.xlsx");//provide the path of excel file
		Workbook wb2 = WorkbookFactory.create(fis2);//make the file is ready to read
		Sheet sheet = wb2.getSheet("IPL");//get into the sheet
	    int rc = sheet.getLastRowNum();//get last row of the sheet
	    
	    for (int i=1; i<=rc; i++)
	    {
	      FileInputStream fis = new FileInputStream("./data/Test.Xlsx");//provide the path of of excel sheet
	      Workbook wb = WorkbookFactory.create(fis);// make the file is ready to read
	     
	      Sheet sheet2 = wb.getSheet("IPL");//get into the sheet 
	      Row row = sheet2.getRow(i);//get into the desired row
	      Cell cell = row.getCell(1);//get into desired cell column
	      String data = cell.getStringCellValue();//get the value of cell and column
	      Thread.sleep(2000);
	      System.out.println(data);   // print all column data   
	    }
	    
	    
	    
	    
	    
	    
	    
		// TODO Auto-generated method stub

	}

}
