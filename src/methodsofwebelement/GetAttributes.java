package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributes {

	public static void main(String[] args) {
		System.setProperty("weddriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/downloads/");
		WebElement value = driver.findElement(By.xpath("//p[.='Below is where you can find the latest releases of all the Selenium components.']"));
		String ss = value.getAttribute("class");
		System.out.println(ss);
		
		// TODO Auto-generated method stub

	}

}
