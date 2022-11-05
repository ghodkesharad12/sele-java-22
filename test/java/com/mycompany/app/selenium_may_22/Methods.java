package com.mycompany.app.selenium_may_22;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Methods
 
{
	 public WebDriver driver;
  @Test
  public void cheqtitle() {
	  String Expectedtitle="Utkarshaa Academy";
	  String ActualTitle= driver.getTitle();
	  Assert.assertEquals(ActualTitle, Expectedtitle);
  }
	  
	 
  
		  @Test (priority = 1)
		  public void clickonjob() {
			  
			  WebElement QAenginiar = driver.findElement(By.xpath("//a[text()='QA Engineer']"));
			  QAenginiar.click();
		  }
	  
	

   @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\GS\\eclipse-workspace\\May_2022\\Binary\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://utkarshaaacademy.com/");
   }	
	  
  

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
