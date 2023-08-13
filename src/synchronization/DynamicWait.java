package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.instagram.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.findElement(By.name("username")).sendKeys("rushikesh");
	    driver.findElement(By.name("password")).sendKeys("gawande@1234");
	    driver.findElement(By.xpath("//div[text()='Log in']")).click();
	    
	    
		// TODO Auto-generated method stub

	}

}
