package com.mycompany.app.selenium_may_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firsttest {
  @Test
  public void f1() 
  {
	  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\GS\\eclipse-workspace\\May_2022\\Binary\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://kite.zerodha.com/");
		  
	  
  }
  @Test
  public void chrome(){
	  
  
  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\GS\\eclipse-workspace\\May_2022\\Binary\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  
  }
}
