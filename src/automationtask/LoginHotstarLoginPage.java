package automationtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginHotstarLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-88a36ia/login.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath(""));
		// TODO Auto-generated method stub

	}

}
