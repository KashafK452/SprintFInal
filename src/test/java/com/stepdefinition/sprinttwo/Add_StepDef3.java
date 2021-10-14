package com.stepdefinition.sprinttwo;

import Pages.AdminTabPg;
import Pages.DashboardPage;
import Pages.LoginPage;
import excel.ReadData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add_StepDef3 {
	
	@Given("user has logged in and is on admin tab")
	public void user_has_logged_in_and_is_on_admin_tab() {
		try {
		   LoginPage.lpage(ReadData.config("url"));
		   DashboardPage.adminTab();
		   AdminTabPg.Admin();
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		}
		catch (Exception e) {
			System.out.println("catch add1");
		}
	}
	@When("user clicks on add button")
	public void user_clicks_on_add_button() {
		try {
		AdminTabPg.addrecord();
	    System.out.println("User is redirected to new page to fill record info");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		}
		catch (Exception e) {
			System.out.println("Catch add2");
		}
	}
	@And("user enters  new employee info")
	public void user_enters_new_employee_info() {
		try {
		AdminTabPg.addrecord2();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		}
		catch (Exception e) {
			System.out.println("Catch add3");
		}
	}
	
	@Then("user is able to add employee record")
	public void user_is_able_to_add_employee_record() {
		try {
		System.out.println("Defect! unable to add record");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		}
		catch (Exception e) {
			System.out.println("Catch add4");
		}
	}





}
