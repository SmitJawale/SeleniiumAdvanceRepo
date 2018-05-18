package org.SeleniumAdvance;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviders {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  System.out.println(n +" "+s);
  }

  @DataProvider()
  public String[][] dp() {
    return new String[][] {
      new String[] { "123", "Super" },
      new String[] { "235", "Man" },
    };
  }
}
