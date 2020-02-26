package com.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aq.Base.TestBase;
import com.qa.pages.ContactsPage;
import com.qa.pages.DealsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.NewContactPage;
import com.qa.pages.contactlistpage;
import com.qa.util.ExcelConfigData;

@Listeners(com.qa.util.TestNgListener.class)
public class NewContactPageTest extends TestBase {

	LoginPage lp;
	HomePage homepage;
	DealsPage dealspage;
	ContactsPage contactspage;
	ExcelConfigData excel;
	NewContactPage newcontact;
	contactlistpage contactlist;
	
	
	public NewContactPageTest() {
		super();
	}


	@BeforeMethod 
	public void setup() {
		
		initilization();
		lp=new LoginPage();
		homepage=new HomePage();
		dealspage=new DealsPage();
		contactspage=new ContactsPage(); 
		newcontact=new NewContactPage();
		homepage = lp.login(prop.getProperty("username"), prop.getProperty("password"));
		contactspage=homepage.clickOnContact();
		 contactlist=new contactlistpage();
		 newcontact=contactspage.ClickonNewContact();
	}	
	
		@Test
		public void createcontact() {
			newcontact.FillForm("Ashwini", "Patil", "balaji", "Capita");
		
			}

	
		@AfterMethod
		public void TearDown() {
			driver.quit();
		}
	
}
	
	


