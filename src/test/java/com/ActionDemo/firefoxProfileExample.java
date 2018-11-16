package com.ActionDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class firefoxProfileExample {
	
	WebDriver driver;

  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  
	  ChromeOptions chrome=new ChromeOptions();
	  chrome.addExtensions(new File("C:\\Selenium Advance\\Extensions\\KatalonChrome.crx"));
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Advance\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver(chrome);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
		//  driver.quit();

  }

}
