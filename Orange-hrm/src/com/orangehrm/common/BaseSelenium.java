package com.orangehrm.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseSelenium {
	@BeforeMethod
	public void beforEachMethodExecution(){
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Browser\\chromedriver.exe");
		WebDriverFactory.DR=new ChromeDriver();      // Launch browser
		WebDriverFactory.DR.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login"); // Navigate to URL
		WebDriverFactory.DR.manage().window().maximize();
	
	}
	@AfterMethod
	public void afterEachMethodExecution(){
		WebDriverFactory.DR.quit();
	}

}

