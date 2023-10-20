package com.orangeHRM.TestCases;

import org.testng.annotations.Test;
import com.orangeHRM.Pages.LoginPage;
import com.orangeHRM.baseClass.ProjectSpecificMethods;

public class TC01_LoginPage extends ProjectSpecificMethods {

	@Test
	public void test() {
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLogin();
	}

}
