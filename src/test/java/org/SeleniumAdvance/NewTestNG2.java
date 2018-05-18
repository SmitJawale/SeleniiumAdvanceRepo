package org.SeleniumAdvance;

import org.testng.annotations.Test;

public class NewTestNG2 {
  @Test
  public void f() {
	  System.out.println("In test 2");
	  
	  try {
		  int a=10,b=0;
		  a=a/b;
	  }catch(Exception e) {
		  throw e;
	  }
  }
}
