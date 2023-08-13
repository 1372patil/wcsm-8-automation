package keyWordDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest extends Flib implements IAutoConstant {
	
	static WebDriver driver;
	
	public void openBrowser() throws IOException {
		Flib flib = new Flib();
		String browservalue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");
		
		if (browservalue.equals("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if (browservalue.equals("edge")) {
			System.setProperty(EDGE_KEY, EDGE_PATH);
		    driver=new EdgeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get(url);
		}
		else {
			System.out.println("invalid browser!!!!");
		}
	}
	public void closeBrowser() {
		driver.quit();
	}
}
