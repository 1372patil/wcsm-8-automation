package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void remoMethod() {
	  Reporter.log("hello testNG", true);
  }
}
