package com.orangehrm.page;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.orangehrm.common.WebDriverFactory;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class PIMPage {
@FindBy (id="resultTable") WebElement elmTable;
@FindBy (id="btnAdd") WebElement elmAddEmployee;

private WebDriverWait wt;
public PIMPage()
{
	PageFactory.initElements(WebDriverFactory.getdr(), this);
	wt =new WebDriverWait(WebDriverFactory.getdr(), 10);
}

public AddEmployeePage addNewEmployee ()
{
	elmAddEmployee.click();
	return new AddEmployeePage();
}




public PIMPage verifytableValue()
{
	elmAddEmployee.click();
	return this;
}


}


