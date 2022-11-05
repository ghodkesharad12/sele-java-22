package com.mycompany.app.selenium_may_22;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ToolsQa {
 
	
	      WebDriver driver ;
	      @Test
	      public void f() {
	  	   String baseUrl = "https://www.toolsqa.com/";
	  	   
	  	   driver = new ChromeDriver();
	  	   driver.get(baseUrl);
	  	   String testTitle = "Free QA Automation Tools For Everyone";
	  	   String originalTitle = driver.getTitle();
	  	   Assert.assertEquals(originalTitle, testTitle);
	     }
	  	
	     @BeforeMethod
	      public void beforeMethod() {
	    	 System.setProperty("webdrive.chrome.driver", "C:\\Users\\GS\\eclipse-workspace\\May_2022\\Binary\\chromedriver.exe");
	    	 driver=new ChromeDriver();
	  	
	      }
	  	
	      @AfterMethod
	       public void afterMethod() {
	  	 driver.close();
	      }
	  }
	  
  

