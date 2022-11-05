package com.mycompany.app.selenium_may_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testA1 {
  @Test (groups = "sanity")
  public void chrome()
  {
	 
	  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\GS\\eclipse-workspace\\May_2022\\Binary\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://kite.zerodha.com/");
		  
	  }

	/*  @Test
	  public void edge()
	  {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\GS\\eclipse-workspace\\May_2022\\Binary\\msedgedriver.exe");
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://facebook.com");
	  }*/

	  @Test
	  public void firefox()
	  
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\GS\\eclipse-workspace\\May_2022\\Binary\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://facebook.com");
	  }
  }

