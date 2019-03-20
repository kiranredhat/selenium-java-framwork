package com.orangehrm.test;

import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.page.LoginPage;

public class LoginTest extends BaseSelenium 
	{
//Verify Login Successful
@Test  (dataProvider=("LoginData") ,priority=2) 
	public void loginSuccesfull (String strUsername, String strPassword)
	{
		LoginPage lp = new LoginPage();
		lp.validLogin(strUsername, strPassword).isHomePageLoaded();
	}
//verify Login With Invalid Username
@Test (priority=6)
	public void verifyLoginWithInvalidUsername()
	{
		LoginPage lp=new LoginPage();
		lp.invalidUsername();
	}
	
//verify Login With Invalid Password
@Test (priority=1)
public void  verifyLoginWithInvalidPasssword() 
	{
		LoginPage lp = new LoginPage();
		lp.invalidPassword();
	}

	
	
//Verify Social Media Links
@Test (priority=3)
public void  verifySocialMediaLink()
	{
		LoginPage lp = new LoginPage();
		lp.socialMediaLinksVerify();
	}

//Verify Login With Blank Username
@Test (priority=4)
public void  verifyLoginBlankUsername()
	{
		LoginPage lp = new LoginPage();
		lp.blankUnameAndPassword();
	}

@Test (priority=5)
public void  verifyDefaultCursorFocus()
	{
		LoginPage lp = new LoginPage();
		lp.cursorFocusOnText();
	}
}
