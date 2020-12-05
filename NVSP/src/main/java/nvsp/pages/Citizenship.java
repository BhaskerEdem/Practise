package nvsp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import genericPage.MasterPage;

public class Citizenship extends MasterPage{

	public Citizenship() throws Exception {
		super();
		
	}
	public void resident() {
		click("indain");
	}
	public void state() {
	WebElement states = driver.findElement(By.xpath(pr.getProperty("state")));
	Select state = new Select(states);
	state.selectByVisibleText("Telangana");
	click("residentbutton");
	}
}
