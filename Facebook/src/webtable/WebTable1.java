package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> allcompany = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println(allcompany.size());
		
		String companyName = "G V Films";
		
		for(int i=0; i<allcompany.size(); i++) {
			
			if(allcompany.get(i).getText().equalsIgnoreCase(companyName)) {
				allcompany.get(i).click();
			}
		}
	}

}
