package dataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase extends Flib {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://desktop-88a36ia/login.do");
        
        //to read the of excel file we create a object from Flib
        
        Flib flib = new Flib();
        
        int rc = flib.rowCount("./data/Actitimetestdata.xlsx","invalidcreds");
        
        for (int i=1;i<=rc;i++)
        {
        	String invalidusername = flib.readExcelData("./data/Actitimetestdata.xlsx","invalidcreds", i, 0);
        	String invalidpassword = flib.readExcelData("./data/Actitimetestdata.xlsx","invalidcreds", i, 1);
        	
        	driver.findElement(By.name("username")).sendKeys(invalidusername);
        	driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
        	
        	driver.findElement(By.id("loginButton")).click();
        	Thread.sleep(2000);
        	
        	driver.findElement(By.name("username")).clear();
        	
        	
        }
		
		
	}

}
