package com.mycompany.app.selenium_may_22;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationTest {
  @Test
  public void f() {
	  
	  System.out.println("first testng class");
	  
  }
  @BeforeClass
  public void beforeclass()
  {
	  System.out.println("Before class starts execute after before test method");
  }

  @AfterClass
  public void afterclass() {
	  System.out.println("After class execution done before after test method");
  }

  @BeforeTest
  public void beforetest() {
	  
	  System.out.println("Before test starts execute after before suit mathod");
	  
  }

  @AfterTest
  public void aftertest() {
	  
	  System.out.println("After test execution done before after suit method");
  }

  @BeforeSuite
  public void beforesuite() {
	  System.out.println("Before suite strats execute beforesuite method");
  }

  @AfterSuite
  public void aftersuite() {
	  System.out.println("After suite execution done then execute beforesuite method"); 
	  
  }

 

}
