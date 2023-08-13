package readExceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validlogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-88a36ia/login.do");

		// read the valid username from actitimetestdata excel sheet

		FileInputStream fis = new FileInputStream("./data/Actitimetestdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreds");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String validusername = cell.getStringCellValue();
		
		//read the valid password from actitimetestdata excel sheet
		
		 FileInputStream fis1 = new FileInputStream("./data/Actitimetestdata.xlsx");
		 Workbook wb1 = WorkbookFactory.create(fis1);
		 Sheet sheet1 = wb1.getSheet("validcreds");
		 Row row1 = sheet1.getRow(1);
		 Cell cell1 = row1.getCell(1);
		 String validpassword = cell1.getStringCellValue();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.name("username")).sendKeys(validusername);
		 Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys(validpassword);
		 Thread.sleep(2000);
		 driver.findElement(By.id("loginButton")).click();
		 
		 Thread.sleep(4000);
		 
		 
		 
		 
		 
		 
		 
		 

		// TODO Auto-generated method stub

	}

}
