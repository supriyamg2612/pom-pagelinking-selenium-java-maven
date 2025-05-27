package com.supriya.jbk.authentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterationPage {

	
	WebDriver driver =null;

	public RegisterationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="name")
	WebElement username;
	
	@FindBy(id="mobile")
	WebElement mobilenumber;
	
	@FindBy(id="email")
	WebElement emailId;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy (xpath = "//button")
	WebElement signUpButton;
	
	@FindBy(xpath= "//a[text()='I already have a membership']")
	WebElement alreaydMembership;
	
	
	public void navigateToLoginPage() {
		alreaydMembership.click();
	}
	
	public void registerationToApplication(String uname, String mobno, String email, String pass) {
		
		username.sendKeys(uname);
		mobilenumber.sendKeys(mobno);
		emailId.sendKeys(email);
		password.sendKeys(pass);
		signUpButton.click();
		
	}
}
