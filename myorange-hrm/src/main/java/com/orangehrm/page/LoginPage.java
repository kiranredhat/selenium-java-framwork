package com.orangehrm.page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
//@FindBy (xpath="//input[@id='txtUsername' and @id='txtUsername']") WebElement elmUsername;
//@FindBy (xpath="//input[@id='txtUsername' or @id='txtUsername']") WebElement elmUsername;
//@FindBy (xpath="//input[contains(@id,'Username')]") WebElement elmUsername;
//@FindBy (xpath="//input[starts-with(@id,'txtUser')]") WebElement elmUsername;
	//@FindBy (xpath="//input[ends-with(@id,'txtUser')]") WebElement elmUsername;
//	@FindBy (xpath="//input[@id='txtPassword'])[last()]") WebElement elmPassword;

	
//@FindBy (xpath="//*[text()='LOGIN Panell']") WebElement elmUsername;//elmUsername.isDisplayed();
	
	//By naveen
	//@FindBy (xpath="//a[text()='Features']") WebElement elmButton1;
	//@FindBy (xpath="//a[contains(text(),'Features')]") WebElement elmButton2;
	////Parent
	//@FindBy (xpath="//div[@class='dropdown']//button[@type='button' and @class='btn btn-secondary dropdown-toggle' and @id='dropdownMenuButton']") WebElement elmButton3;
	////Preceding-Sibling
	//@FindBy (xpath="//a[text()='test2 test2']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']") WebElement elmButton4;

@FindBy (xpath="//input[@id='txtUsername' or @id='txtUsername']") WebElement elmUsername;
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
elmUsername.click();
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
 Set<String> handles= WebDriverFactory.getdr().getWindowHandles();
 String myHandle=WebDriverFactory.getdr().getWindowHandle();
 Iterator<String> values=handles.iterator();
 while(values.hasNext()) 
 	{
	 String temphandle=values.next();
	 	if(!myHandle.contentEquals(temphandle))
	 			{
	 				WebDriverFactory.getdr().switchTo().window(temphandle);
	 				System.out.println(temphandle);
	 				String r=WebDriverFactory.getdr().getTitle();
	 				if (r.contains("LinkedIn"))
	 				{
	 					System.out.println("This is LinkedIn Title" +r);
	 				}
	 				
	 				WebDriverFactory.getdr().close();
	 			}
	 	WebDriverFactory.getdr().switchTo().window(myHandle);
	assertTrue(WebDriverFactory.getdr().getTitle().contentEquals("OrangeHRM"));
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
