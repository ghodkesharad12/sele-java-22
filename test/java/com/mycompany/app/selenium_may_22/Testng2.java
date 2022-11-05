package com.mycompany.app.selenium_may_22;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng2
{
	public WebDriver  driver;
	@Test
	public void s() {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\GS\\eclipse-workspace\\selenium_may_22\\Binary\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://utkarshaaacademy.com/");
		
	}
	@Test
	public void second() {
		String ExpectedTitle="Utkarshaa Academy";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
		
	}

