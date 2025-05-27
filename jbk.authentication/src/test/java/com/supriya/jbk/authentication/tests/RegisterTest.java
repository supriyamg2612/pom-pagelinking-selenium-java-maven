package com.supriya.jbk.authentication.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.supriya.jbk.authentication.DashboardPage;
import com.supriya.jbk.authentication.LoginPage;
import com.supriya.jbk.authentication.RegisterationPage;

public class RegisterTest {
	
	WebDriver driver ;
	LoginPage lp ;
	RegisterationPage rp;
    
	@BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("file:///Users/supriya/Desktop/Selenium%20Software/Offline%20Website/index.html");
        lp = new LoginPage(driver);
    }
	 @Test
	    public void registerToApplicationTest() {
	        rp = lp.navigateToRegisterPage();  // updated return type
	        rp.registerationToApplication("abc", "9787889988", "abc@gmail.com", "abc@123");

	        Assert.assertEquals(driver.switchTo().alert().getText(), "User registered successfully.");
	        driver.switchTo().alert().accept();
	        driver.navigate().refresh();
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }

}
