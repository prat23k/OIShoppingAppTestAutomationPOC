package com.myApp.steps;

import com.myApp.pages.HomePage;

import cucumber.api.java.en.Given;

import junit.framework.Assert;;

public class HomePageSteps {
	private HomePage homePage;

	public HomePageSteps(HomePage homePage) {
		this.homePage = homePage;
	}

	@SuppressWarnings("deprecation")
	@Given("^I am on the OI Shopping App Home page$")
	public void I_am_on_the_OI_Shopping_App_Home_page() {
		homePage.isApphomeDisplayed();
		Assert.assertEquals(true, homePage.isApphomeDisplayed());
	}

}