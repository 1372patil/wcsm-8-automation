package windowbasepopup;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoitHandleWindowBasePopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-88a36ia/login.do;jsessionid=28iree582osqy");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		// home page
		// click on setting
		driver.findElement(By.xpath("//div[text()='Settings']//following-sibling::img")).click();
		Thread.sleep(2000);
		// click on color and Logo button
		driver.findElement(By.xpath("//a[contains(.,'Logo &')]")).click();

		// Click on radio button
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
		Thread.sleep(2000);
		// click on chose file button
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		Thread.sleep(2000);
		// create object for option class
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		// use the method for double click
		act.doubleClick(target).perform();

		Thread.sleep(2000);

		File file = new File("./autoit/rushi1.exe");
		Thread.sleep(4000);
		String absolutepath = file.getAbsolutePath();
		Runtime.getRuntime().exec(absolutepath);
		Thread.sleep(3000);
		//close the browser

		// TODO Auto-generated method stub

	}

}
