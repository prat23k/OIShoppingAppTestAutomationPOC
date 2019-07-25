package com.myApp.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.myApp.helpers.Page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.MobileElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
public class ShoppingListMenuPage extends Page {

	@AndroidFindBy(id = "org.openintents.shopping:id/action_bar")
	private AndroidElement actionBar;

	@AndroidFindBy(id = "org.openintents.shopping:id/image_bottom")
	private AndroidElement navigateMyshoppingListPageMenuButton;

	@AndroidFindBy(id = "org.openintents.shopping:id/list_items")
	private List<AndroidElement> listItems;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='New list']")
	private AndroidElement newList;

	@AndroidFindBy(id = "org.openintents.shopping:id/edittext")
	private AndroidElement createList;

	@AndroidFindBy(id = "android:id/button1")
	private AndroidElement okButton;
	
	@AndroidFindBy(id = "org.openintents.shopping:id/autocomplete_add_item")
	private AndroidElement addItem;
	
 
	@AndroidFindBy(id = "org.openintents.shopping:id/button_add_item")
	 private AndroidElement confirm_add_item ;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete item permanently']")
	private AndroidElement deleteItem;
	
	@AndroidFindBy(id = "android:id/button1")
	private AndroidElement confirmDelete;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
	private AndroidElement getsettings;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sort order']")
	private AndroidElement sortorder;
	
	@AndroidFindBy(className = "android.widget.CheckedTextView")
	private AndroidElement sortAlphabeticalRadioBtn;
	

		
	
	@AndroidFindBy(className = "android.widget.ImageView")
	private AndroidElement imageView;
	
	 
	public void gotoMyshoppingListPage() {
		navigateMyshoppingListPageMenuButton.click();

	}

	public void openNavigationMenu() {
		
		MobileElement navigationMenuButton = actionBar.findElement(By.className("android.widget.ImageButton"));
		navigationMenuButton.click();

	}

	public void tapAddNewListIcon() {

		newList.click();

	}

	public void enterListname(String listName) {
		createList.sendKeys(listName);
		okButton.click();
	}

	 public void addItem(String item) {
		 addItem.sendKeys(item);
		 confirm_add_item.click();
	 }
	 
	public void createItem(String itemName)
	{
		String[] listofItems = itemName.split(",");
		int itemsToAdd = listofItems.length;
		for (String item : listofItems) {
			System.out.println(item);
			addItem(item);			
		}
		
	}
	
	public void deleteItem() {
		TouchAction myaction = new TouchAction(driver);		
		WebElement toDeleteGrocery = driver.findElementByXPath("//android.widget.TextView[@text='Toaster']");
		myaction.longPress(longPressOptions().withElement(element(toDeleteGrocery)).withDuration(ofSeconds(2))).release().perform();
		deleteItem.click();
		confirmDelete.click();
		}
	
	public void sortList() {
		listItems.sort((s1, s2) -> s1.getText()
                .compareTo(s2.getText()));		
	
	}
	

	
	
	}


