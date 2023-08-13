package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='PUMA White-PUMA White-Pearl Pink-Light Mint']")).click();
		
		// TODO Auto-generated method stub

	}

}
