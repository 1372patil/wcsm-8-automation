package methodsOfWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Findelementmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("qspider");
	    Thread.sleep(2000);
	    List<WebElement> qspider1 = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		for(int i=1;i<qspider1.size();i++)
		{
			String qspider = qspider1.get(i).getText();
			System.out.println(qspider);
			Thread.sleep(2000);
		}
		
		
		// TODO Auto-generated method stub

	}

}
