package wait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("how to check");
		
		WebElement AllSuggestions = driver.findElement(By.xpath("//*[@role='listbox']"));
		List<WebElement> AllSearch = AllSuggestions.findElements(By.tagName("li"));
		System.out.println(AllSearch.size());
		
		for(int i = 0; i<AllSearch.size(); i ++) {
			String Allresult = AllSearch.get(i).getText();
			String finalResult = "how to check internet speed";
			
			if (Allresult.equalsIgnoreCase(finalResult)) {
				AllSearch.get(i).click();
				System.out.println("You have selected "+finalResult);
				break;
			}
		}
		
	}
}
