package Assignment;

import java.time.Duration;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimetestCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-88a36ia/login.do");
		String LoginContext = driver.getTitle();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		if (wait.until(ExpectedConditions.titleContains("actiTIME - Login")))
		{
			System.out.println("login page match !!!,test case passed!!");
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.cssSelector("a[id='loginButton']")).click();	
		}
		else
		{
			System.out.println("login page is not match!!!");
		}
		if (wait.until(ExpectedConditions.titleContains("- Enter Time-Track")))
		{
			System.out.println("home page is match !!!, test is passed");
		}
		else
		{
			System.out.println("home page is not found !!!, test case is fail");
			
		}
		// TODO Auto-generated method stub

	}

}
