package com.facebook.genericPage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

public class MasterPage {

	public WebDriver driver;
	public Properties prop;
	public Properties or;
	public Logger log;

	public MasterPage() throws Exception {
		log = Logger.getLogger("MasterPage");
		PropertyConfigurator.configure("./log4j.properties");
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\respository\\configuration.properties");
		prop = new Properties();
		prop.load(fs);

		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\respository\\locators.properties");
		or = new Properties();
		or.load(ip);

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Bhasker\\git\\Practise\\Facebook\\com.facebook.drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("open IE browser");
		}
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	public void click(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
	}

	public void sendDate(String xpathkey, String Date) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(Date);
	}
	
	/*
	 * public void captureScreenShot(ITestResult result) throws Exception {
	 * 
	 * if (ITestResult.FAILURE == result.getStatus()) {
	 * 
	 * TakesScreenshot ts = (TakesScreenshot)driver; File source =
	 * ts.getScreenshotAs(OutputType.FILE); FileUtils.copyFile(source, new
	 * File("./src/com/facebook/screenShotsOnFailure/" + result.getName() +
	 * ".png")); System.out.println("Screenshot Captured"); } }
	 */

}
