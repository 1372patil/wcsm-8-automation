package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//store all the webelement on login page
	
	//declared with @Find By annotation
	
	@FindBy(name="username") private WebElement UserNameTB;
	@FindBy(name="pwd") private WebElement PassWordTB;
	@FindBy(id="loginButton") private WebElement loginbutton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepLoggedInCheckBox;
	@FindBy(linkText = "Actimind Inc.") private WebElement actiMindLink;
	
	//initalization
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	
	
	public WebElement getUserNameTB() {
		return UserNameTB;
	}


	public WebElement getPassWordTB() {
		return PassWordTB;
	}


	public WebElement getLoginbutton() {
		return loginbutton;
	}


	public WebElement getKeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;
	}


	public WebElement getActiMindLink() {
		return actiMindLink;
	}


	
	
	// oprational Methods
    public void validLogin(String validUsername,String validPassword)
    {
   	 UserNameTB.sendKeys(validUsername);
   	 PassWordTB.sendKeys(validPassword);
   	 loginbutton.click();
    }
    
    public void inValidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
    {
   	 UserNameTB.sendKeys(invalidUsername);
   	 PassWordTB.sendKeys(invalidPassword);
   	 loginbutton.click();
   	 Thread.sleep(2000);
   	 UserNameTB.clear();
    }

}
	
	