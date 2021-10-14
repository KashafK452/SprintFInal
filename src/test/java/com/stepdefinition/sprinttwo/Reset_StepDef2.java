package com.stepdefinition.sprinttwo;

import Pages.AdminTabPg;
import Pages.DashboardPage;
import Pages.LoginPage;
//import browser.Browser;
import excel.ReadData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Reset_StepDef2 {


	@Given("user has logged in to orange hrm and is on admin tab")
	public void user_has_logged_in_to_orange_hrm_and_is_on_admin_tab() {
		try {
		//Login
		LoginPage.lpage(ReadData.config("url"));
		//dashboard
		DashboardPage.adminTab();
	  //admin->usermanagement
		AdminTabPg.Admin();
		System.out.println("User is on admin panel");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		}
		catch (Exception e) {
			System.out.println("Catch reset1");
		}
	}
	@When("user enters employee information")
	public void user_enters_employee_information() {
		try {
		AdminTabPg.inputUserName("henry");
		AdminTabPg.searchrecord();
	System.out.println("Search sucessful");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		}
		catch (Exception e) {
			System.out.println("Catch reset2");
		}
	}
	@Then("user clicks on reset button")
	public void user_clicks_on_reset_button() {
		try {
		 AdminTabPg.resetrecord();
		   System.out.println("Fields reset!");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		}
		catch (Exception e)
		{
			System.out.println("Catch reset 3");
		}
	}
	@Then("user is able to reset all the info")
	public void user_is_able_to_reset_all_the_info() {
		try {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		System.out.println("Reset sucessful");
		}
		catch (Exception e) {
			System.out.println("Catch reset4");
		}
		
	}





}
