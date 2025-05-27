package com.supriya.jbk.authentication.tests;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.supriya.jbk.authentication.DashboardPage;
import com.supriya.jbk.authentication.LoginPage;

public class DashboardTest {

	WebDriver driver;
    LoginPage lp;
    DashboardPage dp;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("file:///Users/supriya/Desktop/Selenium%20Software/Offline%20Website/index.html");
        lp = new LoginPage(driver);
    }

    @Test
    public void DashboardPageTest() {
		
		
		
		dp= lp.validLogin();
		
		ArrayList<String> expectedCourses =new ArrayList<String>() ;
		expectedCourses.add("Selenium");
		expectedCourses.add("Java / J2EE");
		expectedCourses.add("Python");
		expectedCourses.add("Php");
		
			ArrayList<String> actualCourses  = dp.verifyCourses();
		Assert.assertEquals(actualCourses, expectedCourses);
		
	}
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}