package com.mycompany.app.selenium_may_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupTesting {
	public WebDriver driver;
	
  @Test (priority = 1,groups = {"sanity","regression"})
  public void Launchbrowser() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\GS\\eclipse-workspace\\May_2022\\Binary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://utkarshaaacademy.com/");
	  driver.manage().window().maximize();
	  
  }
  
  @Test (priority = 1,groups = "regression")
  public void chqtital() {
	  
	  String ExpectedTitle= "utkarshaaacademy";
	  String ActualTitle=(driver.getTitle());
  }
  
  @Test (priority = 2,groups = "regression")
  public void clickjob() {
	  WebElement clickjob=driver.findElement(By.xpath("//a[text()='QA Engineer']"));
	  clickjob.click();
	  System.out.println(driver.getCurrentUrl());
  }
}
