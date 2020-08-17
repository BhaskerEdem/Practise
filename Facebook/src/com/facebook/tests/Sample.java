package com.facebook.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.facebook.pages.LogInPage;

public class Sample {
	ScreenShotOnFailure lp = new ScreenShotOnFailure();
	@Test
	public void checking() throws Exception {
		
		LogInPage li = new LogInPage();
		li.login();
		li.log.info("clicked on login_button");
		
	}
	@AfterMethod
	public void screenShot(ITestResult result) throws Exception {
		
		lp.captureScreenShot(result);
		lp.driver.quit();
	}
	
}
