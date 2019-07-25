package com.myApp.pages;

import com.myApp.helpers.Page;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class HomePage extends Page {

	@AndroidFindBy(id = "org.openintents.shopping:id/action_bar")
	private AndroidElement actionBar;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='More options']")
	private AndroidElement MenuButton;

	public HomePage() {
	}

	public boolean isApphomeDisplayed() {
		return actionBar.isDisplayed();
	}

}
