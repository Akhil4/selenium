package com.ActionDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;

public class modifyBrowser {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.google.com/");
  }
  @BeforeTest
  public void start() throws InterruptedException {
	  
	  FirefoxProfile profile=new FirefoxProfile();
	  profile.setPreference("general.useragent.override", "iphone");
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium Advance\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	  
	  driver=new FirefoxDriver(profile);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
