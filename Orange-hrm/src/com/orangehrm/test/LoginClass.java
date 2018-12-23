package com.orangehrm.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.common.WebDriverFactory;
import com.orangehrm.pages.LoginPage;

public class LoginClass extends BaseSelenium {
    
	@Test 
    public void verifyAdminLoginVerify() {
	
	//	WebElement username=DR.findElement(By.id("txtUsername"));
		//username.sendKeys("kiran");
		//WebElement password=DR.findElement(By.id("txtPassword"));
		//password.sendKeys("kiran");
		//WebElement login=DR.findElement(By.id-("btnLogin"));
		//login.click();
    	LoginPage LP=new LoginPage();
    	LP.loginTest();
		WebElement welcomelink=WebDriverFactory.DR.findElement(By.id("welcome"));
		Assert.assertEquals(welcomelink.getText(), "Welcome Admin");
	}
	/*@Test public void verifyEssLoginVerify() {
	
		WebElement username=DR.findElement(By.id("txtUsername"));
		username.sendKeys("kiran");
		WebElement password=DR.findElement(By.id("txtPassword"));
		password.sendKeys("kiran");
		WebElement login=DR.findElement(By.id("btnLogin"));
		login.click();
		WebElement welcomelink=DR.findElement(By.id("welcome"));
		Assert.assertEquals(welcomelink.getText(), "Welcome Admin");
}
	@Test public void verifymaxuserAdmin() {
		WebElement username=DR.findElement(By.id("txtUsername"));
		username.sendKeys("kiran");
		WebElement password=DR.findElement(By.id("txtPassword"));
		password.sendKeys("kiran");
		WebElement login=DR.findElement(By.id("btnLogin"));
		login.click();
		WebElement welcomelink=DR.findElement(By.id("welcome"));
		Assert.assertEquals(welcomelink.getText(), "Welcome Admin");
}
	
	@Test(enabled=false) public void verifymaxEssUser() {

		WebElement username=DR.findElement(By.id("txtUsername"));
		username.sendKeys("kiran");
		WebElement password=DR.findElement(By.id("txtPassword"));
		password.sendKeys("kiran");
		WebElement login=DR.findElement(By.id("btnLogin"));
		login.click();
		WebElement welcomelink=DR.findElement(By.id("welcome"));
		Assert.assertEquals(welcomelink.getText(), "Welcome Admin");
	}*/
}
