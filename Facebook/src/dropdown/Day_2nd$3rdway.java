package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day_2nd$3rdway {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement birthday = driver.findElement(By.xpath("//*[@id='day']"));
		Select day = new Select(birthday);
		day.selectByIndex(2);
		day.selectByValue("4");
		day.selectByVisibleText("31");
		
		List<WebElement> dropdown = day.getOptions();
		for (int i = 0; i<dropdown.size(); i++) {
			String dropdownvalues = dropdown.get(i).getText();
			if(dropdownvalues.equalsIgnoreCase("23")) {
//				dropdown.get(i).click();
				day.selectByVisibleText(dropdownvalues);
			}
			
		}
	}
}
