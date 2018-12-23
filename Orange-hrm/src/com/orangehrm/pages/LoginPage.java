package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.orangehrm.common.WebDriverFactory;

public class LoginPage {
	
	@FindBy(id="txtUsername") WebElement elmUserName;
	@FindBy(id="txtPassword") WebElement elmPassword;
	@FindBy(id="btnLogin") WebElement elmLogin;
	
	public LoginPage(){
		PageFactory.initElements(WebDriverFactory.DR, this);
	}
	
	public void loginTest(){
		elmUserName.sendKeys("kiran");
		elmPassword.sendKeys("kiran");
		elmLogin.click();
	}
}
