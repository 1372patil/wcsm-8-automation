package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	//to describe the method
	
  @Test(description = "This method perform login!!!")
  public void f() {
	  Reporter.log("Method 1 Login!!",true);
  }
}
