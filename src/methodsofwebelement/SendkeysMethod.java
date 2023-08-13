package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-88a36ia/login.do;jsessionid=28iree582osqy");
		WebElement UsernameTB = driver.findElement(By.name("username"));
		UsernameTB.sendKeys("Admin");
		WebElement PasswordTB = driver.findElement(By.name("pwd"));
		PasswordTB.sendKeys("manager");
		WebElement Clickbutton = driver.findElement(By.id("loginButton"));
		Clickbutton.click();
		// TODO Auto-generated method stub

	}

}
