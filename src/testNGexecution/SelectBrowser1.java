package testNGexecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser1 {
	static WebDriver driver;

	@Test
	@Parameters({ "browser", "url","Vusername","Vpassword" })

	public void Methods1(String browserValue, String url, String Vusername, String Vpassword) {
		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
			driver.findElement(By.name("username")).sendKeys(Vusername);
			driver.findElement(By.name("pwd")).sendKeys(Vpassword);

			driver.findElement(By.id("loginButton")).click();

		}
		else
		{
			System.out.println("invalid browser");
		}
	}
}
