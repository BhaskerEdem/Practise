package nvsp.test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import genericPage.CaptureScreenShot;
import nvsp.pages.LogInPage;

public class LoginTest {

	@Test
	public void doLoginTest() throws Exception {
		LogInPage lp = new LogInPage();
		
		lp.login();
		lp.userName();
		lp.passWord();
		lp.captcha();
		lp.lButton();
	}
	@AfterMethod
	public void takeScreenShotOnFailure(ITestResult result) throws Exception {
		CaptureScreenShot cs = new CaptureScreenShot();
		cs.screenShotOnFailure(result);
		cs.driver.quit();
		
	}
}