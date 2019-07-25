package com.myApp.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import com.myApp.pages.ShoppingListMenuPage;

public class ShoppingMenuSteps {
	private ShoppingListMenuPage shopppinglistmenupage;

	public ShoppingMenuSteps(ShoppingListMenuPage shopppinglistmenupage) {
		this.shopppinglistmenupage = shopppinglistmenupage;
	}

	@And("^I Navigating to My Shopping List Page$")
	public void Navigating_to_My_Shopping_List_Page() {

		shopppinglistmenupage.gotoMyshoppingListPage();

	}

	@When("^I click on Add New List link$")
	public void I_click_on_Add_New_List_link() {
		shopppinglistmenupage.openNavigationMenu();
		shopppinglistmenupage.tapAddNewListIcon();

	}

	@And("^I create a list \"([^\"]*)\"$")
	public void I_create_a_list_with_name(String listName) {
		System.out.println(listName);
		shopppinglistmenupage.enterListname(listName);
	}

	@Then("I add items \"([^\\\"]*)\" to the list$")
	public void I_add_items_to_the_list(String itemName) {

		shopppinglistmenupage.createItem(itemName);
	}

	@And("^I delete an item from the list$")
	public void I_delete_an_item_from_the_list() {
		shopppinglistmenupage.deleteItem();
	}

	@And("^I sort the created list items$")
	public void I_sort_the_created_list_items() {
		shopppinglistmenupage.sortList();
	}

}
