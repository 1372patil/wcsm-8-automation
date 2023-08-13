package testngpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodExecution {
  @Test
  public void method1() {
	  long threadid = Thread.currentThread().getId();
	  Reporter.log(threadid +":is the thred of the method1", true);
	  Reporter.log("method1()",true);
	  }
  @Test
  public void method2() {
	  long threadid1 = Thread.currentThread().getId();
	  Reporter.log(threadid1 +":is the thread of method2", true);
	  Reporter.log("method2",true);
	  
  }
}