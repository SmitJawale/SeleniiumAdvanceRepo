package Sutility;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.SeleniumAdvance.PgObj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginTestMe {
	private WebDriver driver;
	int rown = 0;
	int coln = 2;

	@Test(dataProvider = "TestData")
	  public void test1(String uname, String pass) throws Exception {
		 // try {
		  //ExcelUtility.setExcel("Sheet1","C:\\Users\\A06438_P5.Training\\Documents\\Driver\\TestData.xlsx");
		  
		  driver.findElement(By.id("userName")).clear();
		  driver.findElement(By.id("userName")).sendKeys(uname);
		  driver.findElement(By.cssSelector("#password")).clear();
		  driver.findElement(By.cssSelector("#password")).sendKeys(pass);
		  driver.findElement(By.name("Login")).click();
		  //Assert.assertEquals(driver.getTitle(),"Home");
		  //org.testng.Assert.assertEquals(driver.getTitle(), "Home");
		  //org.testng.Assert.assertEquals(driver.getTitle().contains("Home"), "Home");
		  
		  //String title = driver.getTitle();
		  //assertEquals(title.contains("Home"));
		  		  
		  /*driver.navigate().back();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  ExcelUtility.setExcelCell(rown, coln, "Pass");
		  }catch(AssertionError e) {
			  ExcelUtility.setExcelCell(rown, coln, "Fail");  
			  System.out.println("in fail");
		  }
		  //finally {
			  rown++;
			  driver.navigate().to("http://localhost:8083/TestMeApp/login.htm");
		  }*/
	  }
	  @Test(priority = 2)
	  public void select_category() {
		  WebElement category = driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[2]/a/span"));
				  
		  Actions act = new Actions(driver);
		  act.moveToElement(category).click().build().perform();
		  
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
		  
		  WebElement electronics = driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[2]/ul/li[1]/a/span"));
		  //act.moveToElement(electronics).click().build().perform();
		  Actions act2 = new Actions(driver);
		  act2.moveToElement(electronics).click().build().perform();
		  
		  WebElement headfons = driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[2]/ul/li[1]/ul/li[1]/a/span"));
		  Actions act3 = new Actions(driver);
		  act3.moveToElement(headfons).click().build().perform();
		  
		  Assert.assertEquals(driver.getTitle(), "Search");
	  }
	  
	  @Test(priority = 3)
	  public void select_product() {
		  WebElement product = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
		  
		  Actions act2 = new Actions(driver);
		  act2.moveToElement(product).click().build().perform();
		  		  
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\A06438_P5.Training\\Documents\\Driver\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://localhost:8083/TestMeApp/login.htm");
		  PageFactory.initElements(driver,PgObj.class);
		  
		  
	  }
	  
	  @DataProvider(name="TestData")
	  public String[][] login_data() throws Exception{
		  ExcelUtility.setExcel("Sheet1", "C:\\Users\\A06438_P5.Training\\Documents\\Driver\\TestData.xlsx");
		  String[][] tabledata = ExcelUtility.getExcelTable();
		  return tabledata;
	  }

}