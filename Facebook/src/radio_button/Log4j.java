package radio_button;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("Log4j");
		
		PropertyConfigurator.configure("D:\\Selenium\\Workspace\\Facebook\\log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("Chromedriver Lunched");
		
		driver.manage().window().maximize();
		logger.info("Window Maximized");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		logger.info("ImplicityWait added");
		
		driver.get("https://www.facebook.com/");
		logger.info("URL Get Opened");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gmail.com");
		logger.info("Mail ID Entered");
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
		logger.info("Password Entered");
		
	}
}
