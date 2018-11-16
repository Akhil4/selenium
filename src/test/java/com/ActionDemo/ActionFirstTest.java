package com.ActionDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ActionFirstTest {
	WebDriver driver;
	
  @Test(enabled=false)
  public void testMouse() {
	  driver.get("https://www.homeshop18.com/");
	 Actions act=new Actions(driver);
	 WebElement digital2=driver.findElement(By.xpath("//*[title()='Later']"));
	 act.moveToElement(digital2).click();
	 WebElement digital1=driver.findElement(By.xpath("//*[title()='Close']"));
	 act.moveToElement(digital1).click();
	 WebElement digital=driver.findElement(By.xpath("//a[text()='Digital']"));
	 act.moveToElement(digital).perform();	 
  }
  
  @Test(enabled=false)
  public void rightClick() throws InterruptedException{
	  driver.get("https://www.google.com/");
	  Actions act=new Actions(driver);
	  WebElement digital=driver.findElement(By.xpath("//div[@id='SIvCob']/a[1]"));
	  act.keyDown(Keys.CONTROL).click(digital).build().perform();
	  
  }
	
  @Test(enabled=true)
  public void clickSelectOption() throws InterruptedIOException
  {
	  driver.get("https://medialize.github.io/jQuery-contextMenu/demo.html");
	  Actions act=new Actions(driver);
	  WebElement rtclickbutton=driver.findElement(By.xpath("//span[text()='right click me']"));
	  act.contextClick(rtclickbutton).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
  
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
