package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdduserClass {

	@FindBy(xpath = "//span[contains(text(),'Users')]")//span[contains(text(),'Users')]
	WebElement Users;
	@FindBy(xpath = "//button")
	WebElement AddUser;
	
	@FindBy(id = "username") 
	WebElement username;
	@FindBy(id = "mobile")
	WebElement mobile;
	@FindBy(id = "email")
	WebElement email;
	@FindBy(id = "course")
	WebElement course;
	@FindBy(id = "Male")
	WebElement RadioBtn;
	@FindBy(xpath="//Select")
	WebElement State;
	
	@FindBy(id = "password")
	WebElement password;
	@FindBy(xpath= "/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input")
	WebElement FriendMobile;
	@FindBy(id = "submit")
	WebElement submitBtn;
	
	public AdduserClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void AddUservalue() {
		Users.click();
		AddUser.click();
		username.sendKeys("Mitesh");
		mobile.sendKeys("1234567890");
		email.sendKeys("Mitesh@gmail.com");
		course.sendKeys("selenium");
		RadioBtn.click();
		//State.sendKeys("Maharashtra");
		
		password.sendKeys("123456");
		FriendMobile.sendKeys("9146111531");
		submitBtn.click();
	}
	

}
