package nvsp.test;

import org.testng.annotations.Test;

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
}
