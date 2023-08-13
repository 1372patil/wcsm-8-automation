package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tagname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("Rushikesh");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("gawande");
		
		Thread.sleep(2000);
		driver.findElement(By.tagName("div")).click();
		

	}

}
