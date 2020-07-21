package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Month_1stWay {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		List<WebElement> bm = driver.findElements(By.xpath("//*[@id='month']/option"));
		System.out.println("Total months = " + bm.size());
		bm.get(2).click();
		System.out.println(bm.get(2).isDisplayed());
		System.out.println(bm.get(2).isSelected());
		System.out.println(bm.get(2).isEnabled());
		bm.get(3).click();
	}
}
