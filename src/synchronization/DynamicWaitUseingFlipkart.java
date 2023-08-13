package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWaitUseingFlipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
	
		driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']")).sendKeys("7448068142");
		
		driver.findElement(By.xpath("//button[contains(text(),'Request OTP')]")).click();
		
		// TODO Auto-generated method stub

	}

}
