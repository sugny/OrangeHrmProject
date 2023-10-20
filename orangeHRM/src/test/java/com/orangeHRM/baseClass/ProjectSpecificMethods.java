package com.orangeHRM.baseClass;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.orangeHRM.Utils.PropertyFileReader;

public class ProjectSpecificMethods extends SeleniumBase {
	
	PropertyFileReader prop = new PropertyFileReader();
	String browserName;
	String url;
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		browserName = prop.getValues("browserName");
		url = prop.getValues("url");
		driver = startApp(browserName, url);
		// node = test.createNode(testCaseName);
	}

	@AfterMethod
	public void afterMethod() {
		//driver.close();
	}

}
