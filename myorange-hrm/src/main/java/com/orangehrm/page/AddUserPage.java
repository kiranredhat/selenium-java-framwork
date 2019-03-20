package com.orangehrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.common.WebDriverFactory;

public class AddUserPage {
@FindBy (id="systemUser_userType") WebElement elmUserRole;
@FindBy (id="systemUser_employeeName_empName") WebElement elmEmployee;
@FindBy (id="systemUser_userName") WebElement elmUserName;
@FindBy (id="systemUser_status") WebElement elmStatus;
@FindBy (id="systemUser_password") WebElement elmPassword;
@FindBy (id="systemUser_confirmPassword") WebElement elmConfirmPassword;
@FindBy (id="btnSave") WebElement elmSave;

private WebDriverWait wt;
public AddUserPage()
{
	PageFactory.initElements(WebDriverFactory.getdr(), this);
	wt=new WebDriverWait(WebDriverFactory.getdr(), 10);
}

public AdminPage validUsername()
{
	Select select = new Select(elmUserRole);
	select.selectByIndex(0);
	elmEmployee.sendKeys("kiran gaikwad");
	elmUserName.sendKeys("kiran"+System.currentTimeMillis());
	Select select1 = new Select (elmStatus);
	select1.selectByIndex(0);
	elmPassword.sendKeys("kiran");
	elmConfirmPassword.sendKeys("kiran");
	return new AdminPage();
//	elmSave.click();
	
	
}

public AddUserPage isAddUserPageLoaded()
{
	wt.until(ExpectedConditions.visibilityOf(elmUserRole));
	wt.until(ExpectedConditions.visibilityOf(elmUserName));
	wt.until(ExpectedConditions.visibilityOf(elmEmployee));
	wt.until(ExpectedConditions.visibilityOf(elmStatus));
	wt.until(ExpectedConditions.visibilityOf(elmPassword));
	wt.until(ExpectedConditions.visibilityOf(elmConfirmPassword));



	return this;
	
}
}
