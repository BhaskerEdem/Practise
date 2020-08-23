package com.flipkart.StepDefinitions;

import com.flipkart.pageObject.Electronics_PageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Electronics_StepDefintion extends Electronics_PageObject {

	Electronics_PageObject es = new Electronics_PageObject();

	@Given("^I am user of flipkart application$")
	public void i_am_user_of_flipkart_application() throws Throwable {
		es.openURL();
	}

	@When("^I click on moblies$")
	public void i_click_on_moblies() throws Throwable {
		es.clickOnMobile();
	}

	@When("^select one moblie$")
	public void select_one_moblie() throws Throwable {
		es.selectMobile();
	}

	@When("^click on add to cart$")
	public void click_on_add_to_cart() throws Throwable {
		es.addCart();
	}

	@Then("^I able to see the mobile on cart$")
	public void i_able_to_see_the_mobile_on_cart() throws Throwable {
		es.confirmation();
	}

	@Then("^click on remove from cart$")
	public void click_on_remove_from_cart() throws Throwable {
		es.remove();
	}

}
