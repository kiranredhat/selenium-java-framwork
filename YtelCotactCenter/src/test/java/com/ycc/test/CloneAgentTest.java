package com.ycc.test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.ycc.common.BaseSelenium;
import com.ycc.page.LoginPage;

public class CloneAgentTest extends BaseSelenium{
@Test
public void veirfyCloneAgentSuccess() throws InterruptedException, AWTException
{
	LoginPage lp = new LoginPage();
	lp.successLogin().navigateToAgentPage().navigateToCloneAgentPage().cloneAgentSuccess();
}
	
}
