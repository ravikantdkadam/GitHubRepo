package com.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aq.Base.TestBase;
import com.qa.pages.ContactsPage;
import com.qa.pages.DealsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.Utilclass;


public class HomePageTest extends TestBase {
	LoginPage lp;
	HomePage homepage;
	DealsPage dealspage;
	ContactsPage contactspage;
	
	public HomePageTest() {
		super();
	}


	@BeforeMethod 
	public void setup() {
		
		initilization();
		lp=new LoginPage();
		homepage=new HomePage();
		dealspage=new DealsPage();
		contactspage=new ContactsPage(); 
		homepage = lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}	
	
	
	
		@Test
		public void ClickOnContactsTest() {
			contactspage=homepage.clickOnContact();
			String Contactsurl= driver.getCurrentUrl();
			Utilclass.takeSnapShot(driver, "Contactsurl");
			System.out.println(Contactsurl);
			
			
			
			
			}

			
			@Test
			public void ClickOnDealsTest()  {
				dealspage=homepage.ClickOnDeals();
				String Dealsurl= driver.getCurrentUrl();
				Utilclass.takeSnapShot(driver, "dealsurl");
				System.out.println(Dealsurl);
				


			
			
		}
		
		
		@AfterMethod
		public void TearDown() {
			driver.quit();
		}
		

		
		
				

	
}
