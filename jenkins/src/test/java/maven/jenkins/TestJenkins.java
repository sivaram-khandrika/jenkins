package maven.jenkins;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestJenkins {
  @Test
  public void f() {
	  System.out.println("Hello.. welcome to f()");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Hello.. welcome to beforeMethod()");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Hello.. welcome to afterMethod()");
  }

}
