package com.facebook.pages;

import com.facebook.genericPage.MasterPage;

public class LogInPage extends MasterPage {

	public LogInPage() throws Exception {
		super();
	}

	public void emailOrPhone() {
		click("EmailOrPhone");
	}

	public void enterUserName() {
		sendDate("EmailOrPhone", "abc@gmail.com");

	}

	public void password() {
		click("Password");
	}

	public void enterPassword() {
		sendDate("Password", "123");
	}
	
	public void login() {
		click("Login");
	}
}
