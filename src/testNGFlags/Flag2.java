package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	//Method or Annotation is Enable or Disabled
  @Test(enabled = true,description = "login perform")
  public void method1() {
	  Reporter.log("login perform!!!",true);
  }
  @Test(enabled = true,description = "logout method")
  public void method2() {
	  Reporter.log("logout performd!!!",true);
  }
}
