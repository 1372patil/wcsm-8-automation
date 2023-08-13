package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	//it is use to manage the 
  @Test(description = "login method")
  public void loginMethod() {
	  Reporter.log("login perform,", true);
  }
  @Test(description = "createuser method",dependsOnMethods = "loginMethod")
  public void createUser() {
	  Reporter.log("user create!!!,", true);
  }
  @Test(description = "logout method",dependsOnMethods = "createUser")
  public void logoutMethod() {
	  Reporter.log("logout perform!!!", true);
  }
}
