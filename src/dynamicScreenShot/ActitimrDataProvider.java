package dynamicScreenShot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//it is use to dataprovider testActitime login in invalid credentials multi time in single shot 

public class ActitimrDataProvider {
	static WebDriver driver;
  @BeforeTest
  public void property() {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
  }
  @BeforeMethod
  public void setUp() {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-88a36ia/login.do");
  }
  @DataProvider(name="testActitime")
  public Object[] [] dataprovider(){
	  Object [] [] dataprovider=new Object[5] [2];
	  
	  dataprovider[0] [0]="Admi&n";
	  dataprovider[0] [1]="manag&er";
	  
	  dataprovider[1] [0]="Admin123";
	  dataprovider[1] [1]="manager123";
	  
	  dataprovider[2] [0]="Ad@min";
	  dataprovider[2] [1]="mana@ger";
	  
	  dataprovider[3] [0]="Ad_min";
	  dataprovider[3] [1]="mana_ger";
	  
	  dataprovider[4] [0]="manager";
	  dataprovider[4] [1]="Admin";
	  
	  return dataprovider;
  }
  @Test(dataProvider="testActitime")
  public void loginInvalid(String usn,String pass) throws InterruptedException {
	  driver.findElement(By.name("username")).sendKeys(usn);
	  Thread.sleep(3000);
	 
	  driver.findElement(By.name("pwd")).sendKeys(pass);
	  driver.findElement(By.id("loginButton")).click();
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.name("username")).clear();
	  
	  driver.quit();
  }
}
