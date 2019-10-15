package junit;

import org.testng.annotations.Test;

public class NewTest1
{
	 @Test
	  public void f() {
	  }
	  @Test(dependsOnMethods="f1")
	  public void f12() {
	  }
	  @Test
	  public void f2() {
	  }
}
