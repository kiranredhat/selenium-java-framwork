package com.orangehrm.test;

import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.page.LoginPage;

public class AdminTest extends BaseSelenium {
	@Test  (dataProvider=("LoginData") ,priority=1) 
public void navigateToAddUserPage (String strUsername, String strPassword)
{
	LoginPage lp = new LoginPage();
	lp.validLogin(strUsername, strPassword)
		.navigateToAdminPage()
			.navigateToAddUserPage();
	
}
 
}