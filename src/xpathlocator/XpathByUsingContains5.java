package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByUsingContains5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shine.com/registration/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_name')]")).sendKeys("rushikeshpatil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_email')]")).sendKeys("rpatilgawande1998@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_cell_phone')]")).sendKeys("7448068142");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_password')]")).sendKeys("Pass@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'')]")).click();
		
		
		// TODO Auto-generated method stub

	}

}
