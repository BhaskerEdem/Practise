package nvsp.test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import genericPage.MasterPage;
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
		MasterPage ms = new MasterPage();
		ms.captureScreenShot(result);
		ms.driver.quit();
		
	}
}
