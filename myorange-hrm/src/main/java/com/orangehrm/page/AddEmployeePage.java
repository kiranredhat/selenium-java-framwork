package com.orangehrm.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.common.WebDriverFactory;

public class AddEmployeePage 
{
@FindBy (id="firstName") WebElement elmFirstName;
@FindBy (id="middleName") WebElement elmMiddleName;
@FindBy (id="lastName") WebElement elmLastName;


public WebDriverWait wt;
public AddEmployeePage() 
{
	PageFactory.initElements(WebDriverFactory.getdr(), this);
	wt=new WebDriverWait(WebDriverFactory.getdr(), 10);
}

}
