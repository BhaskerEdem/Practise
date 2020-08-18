package com.flipkart.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Electronics_PageObject {
	
	WebDriver driver;
	
	public void openURL() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhasker\\git\\Practise\\MultiWebsites\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
	}

}
