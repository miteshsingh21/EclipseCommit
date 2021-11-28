package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookUser {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.candere.com/jewellery.html?utm_source=KJOfficial&utm_medium=KJWebsite");
		
	}

	@Test
	public void Test01() {
		Actions act = new Actions(driver);
		//WebElement toElement = driver.findElement(By.xpath("//div[@class='selected-flag']"));
		WebElement fromElement = driver.findElement(By.xpath("//div[@class='top_icon_item user_login_w']"));
		WebElement toElement = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
		act.moveToElement(fromElement).pause(2000).click(toElement).build().perform();
		
        
	}

}
