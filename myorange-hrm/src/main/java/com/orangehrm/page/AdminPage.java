package com.orangehrm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.common.WebDriverFactory;
import com.sun.corba.se.spi.orbutil.fsm.Action;

public class AdminPage {
@FindBy (id="btnAdd") WebElement elmAddUser;


private WebDriverWait wt;
public AdminPage()
{
	PageFactory.initElements(WebDriverFactory.getdr(), this);
	wt=new WebDriverWait(WebDriverFactory.getdr(), 10);
}

public AddUserPage navigateToAddUserPage()
{
	elmAddUser.click();
//	Actions action = new Actions(WebDriverFactory.getdr());
//	action.moveToElement(elmAddUserNew1).moveToElement(elmAddUserNew2).moveToElement(elmAddUserNew3).click().build().perform();
	return new AddUserPage();
}

public AdminPage isAdminPageLoaded()
{
	wt.until(ExpectedConditions.visibilityOf(elmAddUser));
	return this;
}
}
 
