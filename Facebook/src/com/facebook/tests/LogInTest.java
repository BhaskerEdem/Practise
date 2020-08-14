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
		lp.enterUserName();
		lp.password();
		lp.enterPassword();
		lp.login();
	}
	@AfterMethod
	public void toCaptureScreenShot(ITestResult result) throws Exception {
		LogInPage ms = new LogInPage();
		
		ms.captureScreenShot(result);
		ms.driver.quit();
		
	}

}
