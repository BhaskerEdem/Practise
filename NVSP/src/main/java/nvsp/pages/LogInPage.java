package nvsp.pages;

import javax.swing.JOptionPane;

import genericPage.MasterPage;

public class LogInPage extends MasterPage {

	public LogInPage() throws Exception {
		super();
	}

	public void login() {
		click("login");
	}
	
	public void userName() {
		senddata("mobile", "7207574174");
	}
	
	public void passWord() {
		senddata("password", "Bh@sker#4");
	}
	
	public void captcha() {
		String cvalue = JOptionPane.showInputDialog("Please enter the captcha");
		senddata("captcha", cvalue);
	}
	public void lButton() {
		click("loginbutton");
	}
}
