package com.facebook.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.facebook.pages.LogInPage;

public class LogInTest {
	
	@Test
	public void doLogInTest() throws Exception {
		LogInPage lp = new LogInPage();
		
		lp.emailOrPhone();
		lp.log.info("clicked on emailOrPhone");
		lp.enterUserName();
		lp.log.info("userName Entered");
		lp.password();
		lp.log.info("clicked on password");
		lp.enterPassword();
		lp.log.info("Password Entered");
		lp.login();
		lp.log.info("clicked on Login_buttom");
	}


}
