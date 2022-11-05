package com.mycompany.app.selenium_may_22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class partest {
	
	
  @Test
  @Parameters ({"userid","password"}) 
 	
 	public void insta_login(String userid , String password){
	
 	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\GS\\eclipse-workspace\\May_2022\\Binary\\chromedriver.exe");
 	  
          WebDriver driver=new ChromeDriver();
 	  driver.get("https://www.instagram.com/");
 	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 	  WebElement button = driver.findElement(By.xpath("//input[@name='username']"));
 	   button.sendKeys(userid);
 	   
 	   WebElement input = driver.findElement(By.xpath("//input[@name='password']"));
 	  input.sendKeys(password);
 	}
 }
	


