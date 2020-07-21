package executionEngine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
			
		driver.get("http://store.demoqa.com/");
		driver.findElement(By.className("account_icon")).click();
		driver.findElement(By.id("log")).sendKeys("testuser_3");
		driver.findElement(By.id("pwd")).sendKeys("Test@123");
        driver.findElement(By.id("login")).click();
        driver.quit();
	}

}
