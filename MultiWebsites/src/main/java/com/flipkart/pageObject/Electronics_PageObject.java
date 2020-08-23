package com.flipkart.pageObject;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.corba.se.spi.orbutil.fsm.Action;
import com.sun.istack.internal.logging.Logger;

public class Electronics_PageObject {
	
	WebDriver driver;
	
	public void openURL() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhasker\\git\\Practise\\MultiWebsites\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
	}
	public void clickOnMobile() {
		WebElement electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
		Actions act = new Actions(driver);
		act.moveToElement(electronics).build().perform();
		driver.findElement(By.xpath("//*[@title='Mobiles']")).click();
		
	}
	public void selectMobile() {
		driver.findElement(By.xpath("//*[text()='POCO']")).click();
		driver.findElement(By.xpath("//*[@class='_1Nyybr  _30XEf0'][@alt='POCO X2 (Atlantis Blue, 128 GB)']")).click();
	}
	public void addCart() {
		
		Set<String> pi = driver.getWindowHandles();
		Iterator<String> it = pi.iterator();
		String MainWindow = it.next();
		String Mobile = it.next();
		driver.switchTo().window(Mobile);
		driver.findElement(By.xpath("//*[text()='ADD TO CART']")).click();
		
	}
	public void confirmation() {
		
		System.out.println("Moblie added to cart successfully");
		driver.findElement(By.xpath("//*[text()='Remove']")).click();
	}
	public void remove() {
		
		
		int totalframes = driver.findElements(By.tagName("iframe")).size();
		
		for(int i=0; i<=totalframes; i++) {
			driver.switchTo().frame(i);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Remove']"))).click();
//			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[3]/div/div[2]")).click();
		}
		
	}
}
