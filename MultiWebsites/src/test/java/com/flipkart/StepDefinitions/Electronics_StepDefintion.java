package com.flipkart.StepDefinitions;

import com.flipkart.pageObject.Electronics_PageObject;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Electronics_StepDefintion extends Electronics_PageObject{
		
	Electronics_StepDefintion es = new Electronics_StepDefintion();
	
	 @Given("^I am user of flipkart application$")
	    public void i_am_user_of_flipkart_application() throws Throwable {
	       es.openURL();
	    }

	    @When("^I click on moblies$")
	    public void i_click_on_moblies() throws Throwable {
	       
	    }

	    @Then("^I able to see the mobile on cart$")
	    public void i_able_to_see_the_mobile_on_cart() throws Throwable {
	      
	    }

	    @And("^select the one moblie$")
	    public void select_the_one_moblie() throws Throwable {
	        
	    }

	    @And("^click on add to cart$")
	    public void click_on_add_to_cart() throws Throwable {
	       
	    }

	    @And("^click on remove from cart$")
	    public void click_on_remove_from_cart() throws Throwable {
	        
	    }

	
}
