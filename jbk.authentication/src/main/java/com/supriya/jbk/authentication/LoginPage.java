package com.supriya.jbk.authentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver =null;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement loginButton;
	
	@FindBy (xpath ="//div[2]/a")
	WebElement registerPageLink;
	
	
	public DashboardPage validLogin() {
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginButton.click();
		return new  DashboardPage(driver);
	}
	
	
	public void loginToApplication(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginButton.click();
		
	}
	
	public RegisterationPage navigateToRegisterPage() {
		registerPageLink.click();
		return new RegisterationPage(driver);
	}
	

}
