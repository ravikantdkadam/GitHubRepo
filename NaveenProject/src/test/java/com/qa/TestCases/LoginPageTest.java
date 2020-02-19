package com.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aq.Base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.Utilclass;

public class LoginPageTest extends TestBase{
	
	LoginPage lp;
	HomePage Hompage;
	
	
	
	public LoginPageTest () {
		super();
		
	}
	
	@BeforeMethod 
	public void setup() {
		
		initilization();
		lp=new LoginPage();
		
		
		
		
				
	}
	
	
	@Test
	
	
	public void loginTest() {
			
	Hompage = lp.login(prop.getProperty("username"), prop.getProperty("password"));
Utilclass.takeSnapShot(driver, "Input Crediantyials");
	} 
	
	@Test
	public void TitleTest(){
		
	String title=lp.title();
	Assert.assertEquals(title, "Cogmento CRM");

		
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	

}
