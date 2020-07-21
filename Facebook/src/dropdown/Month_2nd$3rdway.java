package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Month_2nd$3rdway {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement BirthMonth = driver.findElement(By.xpath("//*[@id='month']"));
		Select Month = new Select(BirthMonth);
		Month.selectByIndex(2);
		Month.selectByValue("4");
		Month.selectByVisibleText("Jun");
		System.out.println(Month.getFirstSelectedOption().getText());

		List<WebElement> dropdown = Month.getOptions();
		for (int i = 0; i < dropdown.size(); i++) {
			String dropdownvalues = dropdown.get(i).getText();
			if (dropdownvalues.equalsIgnoreCase("Jul")) {
//				dropdown.get(i).click();
				Month.selectByVisibleText(dropdownvalues);
			}
		}

	}
}
