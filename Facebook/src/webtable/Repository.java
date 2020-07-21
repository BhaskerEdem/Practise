package webtable;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repository {

	public static void main(String[] args) throws Exception {
		
		File src = new File("D:\\Selenium\\Workspace\\Facebook\\Repository\\Object_Repository.properties");
		
		FileInputStream fil = new FileInputStream(src);
		
		Properties pr = new Properties();
		
		pr.load(fil);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath(pr.getProperty("EmailOrPhone"))).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath(pr.getProperty("Password") )).sendKeys("12345");
	}
}
