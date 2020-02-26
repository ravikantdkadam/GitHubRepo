package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aq.Base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	WebElement NewContact;
	
	
	public ContactsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public NewContactPage ClickonNewContact() {
		NewContact.click();
		
		return new NewContactPage();
		
	}
	
	
	
	
	
		
	}


