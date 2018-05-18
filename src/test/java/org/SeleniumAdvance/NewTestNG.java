package org.SeleniumAdvance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestNG {
  @Test
  public void f() {
	  System.out.println("in test method");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("in before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("in after test");
  }

}
