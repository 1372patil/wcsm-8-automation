package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Rushikesh");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("gawande");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
		// TODO Auto-generated method stub

	}

}
