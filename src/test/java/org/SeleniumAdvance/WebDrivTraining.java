package org.SeleniumAdvance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class WebDrivTraining {
	
	private WebDriver driver;
	
  @Test
  public void test1() {
	  
	  PgObj.uname.sendKeys("Spider");
	  PgObj.upass.sendKeys("Man");
	  PgObj.ulog.click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\A06438_P5.Training\\Documents\\Driver\\geckodriver-v0.20.1-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://newtours.demoaut.com/");
	  PageFactory.initElements(driver,PgObj.class);
  }

  @AfterTest
  public void afterTest() {
  }

}
