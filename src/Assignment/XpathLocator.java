package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		driver.findElement(By.name("userLoginId")).sendKeys("rspatil");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).click();
		
		// TODO Auto-generated method stub

	}

}
