package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
	@Test
	public void login() {
		
	  Reporter.log("it is the login method",true);
  }
}
