package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelectorLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569657%7Cb%7Cfacabook%7C&placement=&creative=589460569657&keyword=facabook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221112%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-2682656478%26loc_physical_ms%3D9301536%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIoNOjjdaK_gIVBZVLBR00Hg2UEAAYASAAEgJi1vD_BwE");
        driver.findElement(By.name("firstname")).sendKeys("rushikesh");
        driver.findElement(By.name("lastname")).sendKeys("gawande");
        driver.findElement(By.id("u_0_g_9i")).sendKeys("7448068142");
        driver.findElement(By.name("reg_passwd__")).sendKeys("12345678@123");
        
       		// TODO Auto-generated method stub

	}

}
