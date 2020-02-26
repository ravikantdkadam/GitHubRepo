package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aq.Base.TestBase;

public class NewContactPage extends TestBase {
	
	@FindBy(name="first_name")
	  WebElement FirstName;
	
	@FindBy(name="last_name")
	   WebElement LastName;
	
	
	@FindBy(name="middle_name")
	   WebElement MiddleName;
	
	
	@FindBy(xpath="//div[@name='company']/input")
	   WebElement Company;
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	   WebElement SaveButton;
	
	
	public NewContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public  contactlistpage FillForm (String fristname,String lastname,String middlename,String company ) {
		
		FirstName.sendKeys(fristname);
		LastName.sendKeys(lastname);
		MiddleName.sendKeys(middlename);
		Company.sendKeys(company);
		SaveButton.click();
		
		return new contactlistpage();
		
	}


}
