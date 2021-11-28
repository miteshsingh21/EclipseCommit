package com.jbk;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.AdduserClass;
import com.pages.LoginPage;

public class AddNewUser {
	WebDriver driver;
		AdduserClass adu = null;
	LoginPage lp = null;
	@BeforeMethod
	public  void Setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/index.html");
		adu = new AdduserClass(driver);
		lp = new LoginPage(driver);
		
	}
	@Test
	public void VerfiyUserCreated() throws Exception  {
	
		lp.Login("kiran@gmail.com", "123456");
		adu.AddUservalue();
		Select State =new Select(driver.findElement(By.xpath("//Select")));
		State.selectByVisibleText("Maharashtra");
		
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	

}
