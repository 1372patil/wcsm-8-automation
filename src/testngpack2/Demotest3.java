package testngpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demotest3 {
  @Test
  public void g() {
	  Reporter.log("g method from democlass3",true);
  }
  @Test
  public void h() {
	  Reporter.log("h method from democlass3", true);
  }
  @Test
  public void i() {
	  Reporter.log("i method from democlass3",true);
  }
}
