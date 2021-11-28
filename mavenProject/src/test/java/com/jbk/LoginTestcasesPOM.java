package com.jbk;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class LoginTestcasesPOM {
	
	WebDriver driver;
	LoginPage lp = null;
	
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/pages/examples/logout.html");
		lp = new LoginPage(driver);
		
	}
	@Test
	public void loginTest() {
	lp.Login("kiran@gmail.com", "123456");
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");		
		
	}
	
	@Test
	public void loginTest1() {
	//lp.Login("kiran@gmail.com", "123456");
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");		
		
	}
	
		
		

		
		
		
		
		
	
	
		
	
	
	
	
	
	
	
	
	
}