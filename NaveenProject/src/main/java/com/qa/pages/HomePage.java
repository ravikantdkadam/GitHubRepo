package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aq.Base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contact;
	
	@FindBy(xpath="//span[text()='Deals']")
	WebElement Deals;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public ContactsPage clickOnContact() {
		contact.click();
		
		return new ContactsPage();
	}
	
	public DealsPage ClickOnDeals() {
		Deals.click();
		
		return new DealsPage();
	}
	
	
	

}
