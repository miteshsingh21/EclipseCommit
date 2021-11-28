package com.jbk;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
	/*@Test
  public void f() {
	  System.out.println("Smaple test cases");
  }*/
  
  @BeforeMethod
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("file:///D:/Offline%20Website/index.html");
	  driver.manage().window().maximize();
	  
  }
  @Test
  public void Test01() {
	 String ActTitle =  driver.getTitle();
	 System.out.println(ActTitle);
	 String ExpTitle = "JavaByKiran | Log in";
	 Assert.assertEquals(ActTitle, ExpTitle);
	 
	 
  }
  @Test
  public void Test02() {
  String ActTitle = driver.findElement(By.xpath("//a[contains(text(),'Register a new membership')]")).getText();
	System.out.println(ActTitle);  
	String ExpTitle = "Register a new membership";
	Assert.assertEquals(ActTitle, ExpTitle);
  }
  

 /* @AfterMethod
  public void teardown() {
	  driver.close();
  }*/
	  
	  
  
  
  
  
}
