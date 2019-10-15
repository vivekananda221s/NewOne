package junit;

import org.testng.annotations.Test;

public class NewTest2
{
	 @Test
	  public void f() {
	  }
	  @Test(dependsOnMethods="f")
	  public void f1() {
	  }
	  @Test
	  public void f2() {
	  }
}
