package com.ActionDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ThirdExample {
	WebDriver driver;
	
  @Test(enabled=true)
  public void testMouse() {
	  driver.get("http://jqueryui.com/dialog/");
	  driver.switchTo().frame(0);
	//  WebElement element1=driver.findElement(By.xpath("//*[@class='demo-frame']"));
	//  	driver.switchTo().frame(element1);
	  WebElement element=driver.findElement(By.xpath("//*[contains(@class, 'ui-button-icon ui-icon ui-icon-closethick')]"));
	  
	  element.click();
	  driver.switchTo().defaultContent();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Advance\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
		//  driver.quit();
  }

}
