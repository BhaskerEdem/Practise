package radio_button;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button1 {

public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@value='1']")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
//		creating list of radio buttons
		List<WebElement> radios = driver.findElements(By.xpath("//input[contains(@type,'ra')]"));
		System.out.println("Total Radio Buttons = "+radios.size());
		
//		Thread.sleep(3000);
		System.out.println(radios.get(1).isEnabled());
		radios.get(1).click();
		System.out.println(radios.get(1).isSelected());
		radios.get(2).click();
		System.out.println(radios.get(1).isSelected());
		System.out.println(radios.get(1).isDisplayed());
	}

}
