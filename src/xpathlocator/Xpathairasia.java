package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathairasia {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airasia.co.in/home");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='basic-url']")).sendKeys("mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Chhatrapati Shivaji International Airport')]")).click();
		// TODO Auto-generated method stub

	}

}
