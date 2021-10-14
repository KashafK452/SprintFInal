package com.stepdefinition.sprinttwo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Openad_StepDef0 {
	

	@Given("User is logged into website")
	public void user_is_logged_into_website() {
		try {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Open--Given");
		}
		catch (Exception e) {
			System.out.println("Catch search 1");
		}
	}
	@Given("User clicks on admin tab")
	public void user_clicks_on_admin_tab() {
		try {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Open--Given");
		}
		catch (Exception e) {
			System.out.println("Catch search 2");
		}
	}
	@When("user clicks on user management option")
	public void user_clicks_on_user_management_option() {
		try {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Open--When");
		}
		catch (Exception e)
		{
			System.out.println("Catch search 3");
		}
	}
	@Then("user should be able to see user management panel")
	public void user_should_be_able_to_see_user_management_panel() {
		try {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Open--Then");
		}
		catch (Exception e)
		{
			System.out.println("Catch seacrh 4");
		}
	}





}
