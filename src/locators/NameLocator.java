package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions  co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys("12334455779900");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.id("captcha")).sendKeys("rshggsd");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='btn btn-success btn-logging']")).click();
		// TODO Auto-generated method stub

	}

}
