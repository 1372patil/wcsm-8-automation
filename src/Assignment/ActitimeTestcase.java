package Assignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTestcase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-88a36ia/login.do");
		
		if (driver.getTitle().equals("actiTIME - Login"))
		{
			System.out.println("login page match !!!,test case passed!!");
			
		}
		else
		{
			System.out.println("login page is not match!!!");
		}
		if (driver.getTitle().equals("actiTIME - Enter Time-Track"))
				{
			        System.out.println("home page tilte is match!!!");
				}
		else
		{
			System.out.println("home page is not match");
		}
		//
		
		
		// TODO Auto-generated method stub

	}

}
