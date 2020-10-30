package pageObject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Blackberry_PageObject {

	public WebDriver driver;

	public void openURL() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\Snapdeal\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
	}

	public void smartphone() {

		WebElement Mobile = driver.findElement(By.xpath("//*[text()='Mobile & Tablets']"));
		Actions act = new Actions(driver);
		act.moveToElement(Mobile).build().perform();
		driver.findElement(By.xpath("//*[text()='Smartphones']")).click();
		
	}

	public void selectPhone() {

		driver.findElement(By.xpath("//*[@placeholder='Search by Brand']")).click();
		driver.findElement(By.xpath("//*[@for='Brand-Blackberry']")).click();
		driver.findElement(By.xpath("//*[text()='APPLY']")).click();
		driver.findElement(By.xpath("//*[@id='1875196144']")).click();
		
	}

	public void addToCart() {

		Set<String> PopID = driver.getWindowHandles();
		Iterator<String> it = PopID.iterator();
		String Mainwindow = it.next();
		String Window1 = it.next();

		driver.switchTo().window(Window1);
		driver.findElement(By.xpath("//*[@id='add-cart-button-id']")).click();

	}

	public void confirmation() {

		System.out.println("Mobile added to cart successfully");
	}

	public void removeitem() {

		driver.findElement(By.xpath("//*[text()='View Cart']")).click();
		driver.findElement(By.xpath("//*[@class='remove-item-shortlist']")).click();

	}

	public void backToMainwindow() {

		driver.findElement(By.xpath("//*[text()='START SHOPPING NOW']")).click();
		driver.findElement(By.xpath("//*[@class='notIeLogoHeader aspectRatioEqual sdLogo cur-pointer']")).click();
		driver.quit();
	}
}
