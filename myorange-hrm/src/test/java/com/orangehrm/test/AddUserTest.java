package com.orangehrm.test;

import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.page.LoginPage;

public class AddUserTest extends BaseSelenium {
@Test (dataProvider=("LoginData"))
public void verifySuccessAddUserPage(String strUsername, String strPassword)
{
	LoginPage lp = new LoginPage();
	lp.validLogin(strUsername, strPassword)
		.navigateToAdminPage()
			.navigateToAddUserPage()
				.isAddUserPageLoaded()
					.validUsername()
						.isAdminPageLoaded();
	
}

}
