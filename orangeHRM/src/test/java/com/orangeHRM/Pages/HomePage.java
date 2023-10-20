package com.orangeHRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.baseClass.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	
	@FindBy(xpath = "//span[text()='My Info']") WebElement eleMyInfo;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickMyInfo() {
		eleMyInfo.click();
	}

}
