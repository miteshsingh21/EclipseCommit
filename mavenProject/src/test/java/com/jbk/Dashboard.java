package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dashboard {
	WebDriver driver;
	  @BeforeMethod
	  public void setup() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("file:///D:/Offline%20Website/index.html");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		  driver.findElement(By.id("password")).sendKeys("123456");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
	  }
	 /* @AfterMethod
	  public void teardown() {
		  
		  driver.close();
		  
	  }*/
	  @Test
	  public void Test01() {
		  String ActTitle = driver.getTitle();
		  System.out.println(ActTitle);
		  String ExpTitle = "JavaByKiran | Dashboard";
		  Assert.assertEquals(ActTitle, ExpTitle);
	  }
	  
	
	
	
	

}
