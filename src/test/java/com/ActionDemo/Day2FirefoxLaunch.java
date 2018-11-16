package com.ActionDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;

public class Day2FirefoxLaunch {
	WebDriver driver;
	
  @Test
  public void launchFirefox() {

  }
  @BeforeTest
  public void beforeTest() {
  
	  // below command is for lauinching chrome extensions by using ChromeOptions Class
	//  ChromeOptions chrome=new ChromeOptions();
	  // for launching  Chrome browser with all the pluginjs we have
	//  chrome.addExtensions(new File("C:\\Selenium Advance\\Extensions\\KatalonChrome.crx"));
	  
	  // for launching automation code in mozilla firefox
	  FirefoxProfile profile=new FirefoxProfile();
	  profile.addExtension(new File("C:\\Selenium Advance\\Extensions\\katalon.xpi"));
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium Advance\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	  
	  
	  // code for calling other file having extensions or own created file
	  ProfilesIni firefoxp=new ProfilesIni();
	  FirefoxProfile newfp=firefoxp.getProfile("Selenium3PlusProfile");
	  
	  
	  driver=new FirefoxDriver(newfp);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
  }
  
  

  @AfterTest
  public void afterTest() {
		//  driver.quit();
  }

}
