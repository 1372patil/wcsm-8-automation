package testNGAnnotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void f() {
	  Reporter.log("test Annotation", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("beforemethod Annotation", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("aftermethod Annotation", true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("beforeclass Annotation", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("afterclass Annotation", true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("beforetest Annotation", true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("aftertest Annotation", true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("beforesuite Annotation", true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("aftersuite Annotation", true);
	   
  }
  @Test
  public void testmethod() {
	  Reporter.log("test Annotation2", true);
  }

}
