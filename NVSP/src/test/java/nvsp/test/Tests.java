package nvsp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import genericPage.CaptureScreenShot;
import genericPage.ScreenShot;

public class Tests {
	@Test
	public void testing() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\git\\Practise\\NVSP\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@id='hi']")).click();
		
		
	}
	
	@AfterMethod
	public void screenshot(ITestResult result) throws Exception {
	ScreenShot cs = new ScreenShot();
		cs.screenShot(result);
		cs.driver.quit();
	}
}
