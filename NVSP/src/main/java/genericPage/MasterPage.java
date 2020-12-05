package genericPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

public class MasterPage {
	
	public WebDriver driver;
	public Properties pro;
	public Properties pr;

	public MasterPage() throws Exception {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\repository\\configuration.properties");
		pro = new Properties();
		pro.load(fs);

		FileInputStream io = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\repository\\locators.properties");
		pr = new Properties();
		pr.load(io);

		if (pro.getProperty("browser").equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\git\\Practise\\NVSP\\src\\main\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("open IE browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(pro.getProperty("URL"));
	}

	public void click(String xpath) {
		driver.findElement(By.xpath(pr.getProperty(xpath))).click();
	}

	public void senddata(String xpath, String Data) {
		driver.findElement(By.xpath(pr.getProperty(xpath))).sendKeys(Data);
	}
	
	public void captureScreenShot(ITestResult result) throws Exception {
		
		if(ITestResult.FAILURE == result.getStatus()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./src/test/resources/screenShots/"+ result.getName()+".png"));
			System.out.println("Screenshot Captured");
		}
	}
	
	
	
}
