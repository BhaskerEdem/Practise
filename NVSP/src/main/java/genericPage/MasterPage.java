package genericPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MasterPage {

	public WebDriver driver;
	public Properties pro;
	public Properties pr;

	public MasterPage() throws Exception {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "/NVSP/src/test/resources/repository/configuration.properties");
		pro = new Properties();
		pro.load(fs);

		FileInputStream io = new FileInputStream(
				System.getProperty("user.dir") + "/NVSP/src/test/resources/repository/locators.properties");
		pr = new Properties();
		pr.load(io);

		if (pro.getProperty("browser").equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/NVSP/src/main/resources/drivers/chromedriver.exe");
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
}
