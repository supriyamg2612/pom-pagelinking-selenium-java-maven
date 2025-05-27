package com.supriya.jbk.authentication;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	

	WebDriver driver = null;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//h3")  // 4 elements
	List<WebElement> courses;
	
	@FindBy(xpath = "//a[text()='LOGOUT']")
	WebElement logOut;
	
	
	
	public LoginPage logOut() {
		logOut.click();
		return new LoginPage(driver);
		
	}
	
	
	
	
public ArrayList<String> verifyCourses() {
		
		
		ArrayList<String> actualCourses = new ArrayList<String>();
		
		for(WebElement course : courses) {
			 String text = course.getText();
			 actualCourses.add(text);
			
			 
			
		}
		return actualCourses;
	}
		
	
	

}
