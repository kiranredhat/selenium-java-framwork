package com.orangehrm.common;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class TestListner implements IInvokedMethodListener {

	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		WebDriverFactory.getdr().quit();
		
	}

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		try 
		{
		if (arg0.isTestMethod())
		{
//	Normal Chrome Browser
//			System.setProperty("webdriver.chrome.driver" ,"F:\\Selenium\\Browser\\chromedriver.exe");
//			WebDriverFactory.setdr(new ChromeDriver());
//			WebDriverFactory.getdr().get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
//			WebDriverFactory.getdr().manage().window().maximize();	
			
			
				
//	Grid Login
//			Create Server Command:
//			java -jar selenium-server-standalone-3.141.59.jar -role hub
			
//			Client to Server Command: 
//			java -Dwebdriver.chrome.driver=C:\Selenium\Browser\chromedriver.
//					exe -jar selenium-server-standalone-3.141.59.jar -role node -hub http://192.168.
//					0.103:4444/grid/register -browser browserName=chrome,version=72
			
			
//				DesiredCapabilities DC = new DesiredCapabilities();
//					 DC.setBrowserName("chrome");
//					 DC.setVersion("72");
//					 WebDriverFactory.setdr(new RemoteWebDriver(new URL ("http:192.168.0.104:4444/wd/hub"),DC));
//					 WebDriverFactory.getdr().get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login"); // Navigate to
																			
			
			
			
//	Android Login with appium
//					 DesiredCapabilities DC = new DesiredCapabilities();
//					 DC.setBrowserName("chrome");
//					 DC.setVersion("72");
//					
//						DC.setCapability("platformName", "Android");
//						DC.setCapability("devieName", "Android");
//						DC.setCapability("appPackage", "com.android.chrome");
//						DC.setCapability("appAcivity", "com.google.android.apps.chrome.Main");
//					
//						WebDriverFactory.setdr(new RemoteWebDriver(new URL ("http://192.168.0.104:4444/wd/hub"),DC));

					 
					 
					 WebDriverFactory.getdr().manage().window().maximize();
		}
		
	}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
}

}


