package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.Blackberry_PageObject;

public class Blackberry_StepDefinition extends Blackberry_PageObject {

	Blackberry_PageObject bp = new Blackberry_PageObject();
	
	@Given("^I am user of snapdeal application$")
	public void i_am_user_of_snapdeal_application() throws Throwable {
	    bp.openURL();
	}

	@When("^I click on Smartphones$")
	public void i_click_on_Smartphones() throws Throwable {
		bp.smartphone();
	}

	@When("^select the blackberry phone$")
	public void select_the_blackberry_phone() throws Throwable {
	    bp.selectPhone();
	}

	@When("^add to cart$")
	public void add_to_cart() throws Throwable {
		bp.addToCart();
	}

	@Then("^I able to see the mobile on cart$")
	public void i_able_to_see_the_mobile_on_cart() throws Throwable {
	   bp.confirmation();
	}

	@Then("^click on remove from cart$")
	public void click_on_remove_from_cart() throws Throwable {
		bp.removeitem();
	}

	@Then("^I can able to come on main window and close$")
	public void i_can_able_to_come_on_main_window_and_close() throws Throwable {
	    bp.backToMainwindow();
	}

	
}
