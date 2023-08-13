package automationtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://aiflyingreturns.b2clogin.com/aiflyingreturns.onmicrosoft.com/oauth2/v2.0/authorize?client_id=ac5c8be3-c829-4db6-8eb7-aa4a37c61cbc&redirect_uri=https://api-loyalty.airindia.in/v1/security/authorization/openidconnect/authorize/delegated-token&response_type=code&state=OFNqbUVOM1Nka3VwNHpqajgzQ1JrUXVlai1Kc29NflBiaHQzMzFKVzdickNR_en-GB_false_&nonce=OFNqbUVOM1Nka3VwNHpqajgzQ1JrUXVlai1Kc29NflBiaHQzMzFKVzdickNR&scope=openid%20offline_access%20profile%20phone%20email&p=B2C_1A_SIGNUP_SIGNIN&prompt=login&display=page&code_challenge_method=S256&code_challenge=AGrgyZsNp8T33y41VRNW58b3wiTi8aJvditq43l__VM&ui_locales=en-GB");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("rushikesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("patil12345");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='next']")).click();
		
		
		// TODO Auto-generated method stub

	}

}
