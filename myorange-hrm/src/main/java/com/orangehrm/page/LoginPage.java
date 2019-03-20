package com.orangehrm.page;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.orangehrm.common.WebDriverFactory;

public class LoginPage {
@FindBy (xpath="//input[@id='txtUsername' and @id='txtUsername']") WebElement elmUsername;
@FindBy (id="txtPassword") WebElement elmPassword;
@FindBy (id="btnLogin") WebElement elmButton;
@FindBy (xpath="//img[@alt='LinkedIn OrangeHRM group']") WebElement elmmLinkin;
@FindBy (xpath="//img[@alt='OrangeHRM on Facebook']") WebElement elmmFacebook;
@FindBy (xpath="//img[@alt='OrangeHRM on twitter']") WebElement elmTwitter;
@FindBy (xpath="//img[@alt='OrangeHRM on youtube']") WebElement elmYouTube;
@FindBy (xpath="//spam[@id='spanMessage']") WebElement elmValidation;

private WebDriverWait wt;
public LoginPage() {
PageFactory.initElements(WebDriverFactory.getdr(), this);
wt= new WebDriverWait(WebDriverFactory.getdr(), 10);
}

public HomePage validLogin(String strUsername, String strPassword) {
elmUsername.sendKeys(strUsername);
elmPassword.sendKeys(strPassword);
elmButton.click();
return new HomePage();
}


public LoginPage isLoginPageLoaded()  {
	wt.until(ExpectedConditions.visibilityOf(elmUsername));
	wt.until(ExpectedConditions.visibilityOf(elmPassword));
	wt.until(ExpectedConditions.visibilityOf(elmButton));
	return this;

}

public LoginPage socialMediaLinksVerify() {
	elmmLinkin.click();
	elmmFacebook.click();
	elmTwitter.click();
	elmYouTube.click();
	WebDriver dr = WebDriverFactory.getdr();
	Set <String> handles =dr.getWindowHandles();
	String myWindownsHandle=dr.getWindowHandle();
	
	Iterator <String> value = handles.iterator();
		while (value.hasNext())
		{		
			String temphandle = value.next();
			 System.out.println(temphandle);

			if (!myWindownsHandle.contentEquals(temphandle))
					{
						dr.switchTo().window(temphandle);
						System.out.println(temphandle);
						WebDriverFactory.getdr().getTitle();
						dr.close();
				 	}
			dr.switchTo().window(myWindownsHandle);
			dr.getTitle();
			//dr.quit();
		}
	return this;
}


public LoginPage invalidUsername()
{
	elmUsername.sendKeys("InvalidUsername");
	elmPassword.sendKeys("kiran");
	elmButton.click();
	return this.isLoginPageLoaded();
}

public LoginPage invalidPassword() 
{
	elmUsername.sendKeys("kiran");
	elmPassword.sendKeys("InvalidPassword");
	elmButton.click();
	return this.isLoginPageLoaded();
}

public LoginPage blankUnameAndPassword() 
{
	elmUsername.sendKeys("");
	elmPassword.sendKeys("");
	elmButton.click();
	return this.isLoginPageLoaded();
}

public LoginPage cursorFocusOnText ()
{
	WebDriverFactory.getdr().switchTo().activeElement().findElement(By.id("txtUsername"));
	return this.isLoginPageLoaded();
}

}
