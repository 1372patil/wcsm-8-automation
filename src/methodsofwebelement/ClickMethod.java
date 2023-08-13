package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-88a36ia/login.do;jsessionid=28iree582osqy");
		WebElement usernameTB = driver.findElement(By.name("username"));
		usernameTB.sendKeys("admin");
		WebElement passwordTB = driver.findElement(By.name("pwd"));
		passwordTB.sendKeys("manager");
		WebElement ButtonB = driver.findElement(By.id("loginButton"));
		ButtonB.click();
		
		// TODO Auto-generated method stub

	}

}
