package com.mycompany.app.selenium_may_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter{
	public WebDriver driver;
 @Test
 //@Parameters ({"userid","password"})
	
	public void insta_login(String userid , String password){
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\GS\\eclipse-workspace\\May_2022\\Binary\\chromedriver.exe");
	  
        driver=new ChromeDriver();
        //driver.get("https://www.instagram.com/");
	  
	//  WebElement button = driver.findElement(By.xpath("//input[@name='username']"));
	 //  button.sendKeys("userid");
	   
	   WebElement input = driver.findElement(By.xpath("//input[@name='password']"));
	   input.sendKeys("password");
	}
}

