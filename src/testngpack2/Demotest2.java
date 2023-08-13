package testngpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demotest2 {
  @Test
  public void e() {
	  Reporter.log("e mehod from demo test2", true);
  }
  @Test
  public void f() {
	  Reporter.log("f method from demo test2", true);
  }
  @Test
  public void f1() {
	  Reporter.log("f1 method from demo test2",true);
  }
}
