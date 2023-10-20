package com.orangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.baseClass.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	
	@FindBy(name = "username") WebElement eleUsername;
	@FindBy(name = "password") WebElement elePassword;
	@FindBy(xpath = "//button['Login']") WebElement eleLogin;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage enterUsername() {
		eleUsername.sendKeys("Admin");
		return this;
	}
	
	public LoginPage enterPassword() {
		elePassword.sendKeys("admin123");
		return this;
	}

	public HomePage clickLogin() {
		eleLogin.click();
		return new HomePage();
	}
}
