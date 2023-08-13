package keyWordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		//create the object basetest for open the browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		// create the object for flib it is use to read the invalid data from excelsheet
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH, "invalidcreds");
		
		for (int i=1;i<=rc;i++)
		{
			String invalidusername = flib.readExcelData(EXCEL_PATH,"invalidcreds",i, 0);
			
		    String invalidpassword = flib.readExcelData(EXCEL_PATH,"invalidcreds",i, 1);
		    
		    driver.findElement(By.name("username")).sendKeys(invalidusername);
		    Thread.sleep(2000);
		    driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
		    Thread.sleep(2000);
		    driver.findElement(By.id("loginButton")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.name("username")).clear();
		}
		bt.closeBrowser();
	}
}