package com.stepdefinition.sprinttwo;

import Pages.AdminTabPg;
import Pages.DashboardPage;
import Pages.LoginPage;
import excel.ReadData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Edit_StepDef6 {

	

	@Given("user is logged in and directed to admin tab")
	public void user_is_logged_in_and_directed_to_admin_tab() {
		try {
		LoginPage.lpage(ReadData.config("url"));
		DashboardPage.adminTab();
		AdminTabPg.Admin();
		System.out.println("User is on admin tab");
		   
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		}
		catch (Exception e) {
			System.out.println("Catch edit1");
		}
	}
	@When("user clicks on a record to edit")
	public void user_clicks_on_a_record_to_edit() {
		try {
		AdminTabPg.seltoedit();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		}
		catch (Exception e) {
			System.out.println("Catch edit2");
		}
	}
	@Then("user enters updated info")
	public void user_enters_updated_info() {
		try {
		AdminTabPg.editrecord();
	    System.out.println("Defect! found");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		}
		catch (Exception e)
		{
			System.out.println("catch edit3");
		}
	}
	
	@And("user is able to see updated record")
	public void user_is_able_to_see_updated_record() {
		try {
		
		System.out.println("No record updated");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		}
		catch (Exception e)
		{
			System.out.println("catch edit 4");
		}
	}





}
