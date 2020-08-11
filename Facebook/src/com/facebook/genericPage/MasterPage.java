package com.facebook.genericPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MasterPage {

	public WebDriver driver;
	public Properties prop;
	public Properties or;

	public MasterPage() throws Exception {

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
					"C:\\Users\\Bhasker\\git\\Practise\\Facebook\\com.facebook.drivers");
			driver = new ChromeDriver();
		}else {
			System.out.println("open IE browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));

	}

}
