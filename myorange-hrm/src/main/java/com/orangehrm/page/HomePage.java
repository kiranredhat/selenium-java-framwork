package com.orangehrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.orangehrm.common.WebDriverFactory;

public class HomePage 
{
@FindBy (id="welcome") WebElement elmWelcomeLink;
//@FindBy (id="menu_admin_viewAdminModule") WebElement elmAdminPage;
@FindBy (id="menu_admin_viewAdminModule") WebElement elmAdminPage;

@FindBy	(id="menu_pim_viewPimModule") WebElement elmPIM;
@FindBy (id="menu_leave_viewLeaveModule") WebElement elmLeave;
@FindBy (id="menu_time_viewTimeModule") WebElement elmTime;	
	
private WebDriverWait wt;
public HomePage()
{
	PageFactory.initElements(WebDriverFactory.getdr(), this);
	wt=new WebDriverWait(WebDriverFactory.getdr(), 10);
}
	
public HomePage isHomePageLoaded() 
{
	Assert.assertEquals(elmWelcomeLink.getText(), "Welcome Admin");
	wt.until(ExpectedConditions.visibilityOf(elmWelcomeLink));
	wt.until(ExpectedConditions.visibilityOf(elmAdminPage));
	wt.until(ExpectedConditions.visibilityOf(elmPIM));
	wt.until(ExpectedConditions.visibilityOf(elmLeave));
	wt.until(ExpectedConditions.visibilityOf(elmTime));
	return this;
}

public AdminPage navigateToAdminPage()
{
	elmAdminPage.click();
	return new AdminPage();
}

public PIMPage navigateToPIMPage()
{
	elmPIM.click();
	return new PIMPage();
}

public LeavePage naviagateToLeavePage()
{
	elmLeave.click();
return new LeavePage();
}

public TimePage navigateToTime()
{
	elmTime.click();
	return new TimePage();
}

}
