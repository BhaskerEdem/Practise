package nvsp.test;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import genericPage.CaptureScreenShot;
import nvsp.pages.Citizenship;

public class CitizenshipTest {

	@Test
	public void residentTest() throws Exception {
		Citizenship cs = new Citizenship();
		cs.resident();
		cs.state();
	}
	@AfterMethod
	public void screenShot(ITestResult result) throws Exception {
	CaptureScreenShot cs = new CaptureScreenShot();
	cs.screenShotOnFailure(result);
	cs.driver.quit();
	}
}
