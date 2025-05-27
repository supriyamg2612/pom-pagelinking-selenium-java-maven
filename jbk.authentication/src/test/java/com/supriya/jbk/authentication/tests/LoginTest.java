package com.supriya.jbk.authentication.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.supriya.jbk.authentication.LoginPage;



public class LoginTest {
	
	 WebDriver driver;
	    LoginPage lp;
	    
	    @BeforeClass
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("file:///Users/supriya/Desktop/Selenium%20Software/Offline%20Website/index.html");
	        lp = new LoginPage(driver);
	    }
	    
	    @Test
	    public void loginToApplicationTest() {
	        lp.loginToApplication("kiran@gmail.com","123456");
	        Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	    }
	    
	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }

}
