package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement UsernameTB = driver.findElement(By.name("username"));
		UsernameTB.sendKeys("admin");
		Thread.sleep(2000);
		UsernameTB.clear();
		WebElement passwordTB = driver.findElement(By.name("password"));
		passwordTB.sendKeys("admin@123");
		Thread.sleep(2000);
		passwordTB.clear();
	    
		// TODO Auto-generated method stub

	}

}
