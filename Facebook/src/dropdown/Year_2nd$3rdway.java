package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Year_2nd$3rdway {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement byr = driver.findElement(By.xpath("//*[@id='year']"));
		Select year = new Select(byr);
		year.selectByIndex(32);
		year.selectByValue("2017");
		year.selectByVisibleText("1993");

		System.out.println(year.getFirstSelectedOption().getText());

		List<WebElement> dropdown = year.getOptions();

		for (int i = 0; i < dropdown.size(); i++) {

			String dropdownvalues = dropdown.get(i).getText();
			if (dropdownvalues.equals("1965")) {

				dropdown.get(i).click();
//				year.selectByVisibleText(dropdownvalues);
			}

		}
		System.out.println(year.getFirstSelectedOption().getText());

	}

}
