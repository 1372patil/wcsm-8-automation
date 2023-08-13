package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathirctcLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chromedriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class^='b']")).click();
		// TODO Auto-generated method stub

	}

}
