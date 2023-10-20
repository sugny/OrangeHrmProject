package com.orangeHRM.baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.safari.SafariDriver;

public class SeleniumBase {

	public WebDriver driver;

	public WebDriver startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(options);
			} else if (browser.equalsIgnoreCase("edge"))
				driver = new EdgeDriver();
			else if (browser.equalsIgnoreCase("fireFox"))
				driver = new FirefoxDriver();
			if (browser.equalsIgnoreCase("safari"))
				driver = new SafariDriver();
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		} catch (Exception e) {
			// reportStep("The Browser Could not be Launched. Hence Failed", "fail");
			throw new RuntimeException();
		}
		return driver;
	}

	/*
	 * public WebDriver startApp(String url) { return startApp("chrome", url); }
	 */

}
