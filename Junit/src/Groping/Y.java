package Groping;

import org.testng.annotations.Test;

public class Y
{
  @Test(groups="xx",dependsOnMethods="zz")
  public void dd() {
  }
  @Test
  public void ee() {
  }
  @Test
  public void ff() {
  }
}
