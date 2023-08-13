package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssselectorSaucedemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id^='user']")).sendKeys("rushikesh");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder$='ord']")).sendKeys("pass@11223");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type*='it']")).click();
		
		// TODO Auto-generated method stub

	}

}
