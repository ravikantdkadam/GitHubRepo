package com.qa.TestCases;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aq.Base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.ExcelConfigData;


@Listeners(com.qa.util.TestNgListener.class)


public class LoginPageTest extends TestBase{
	
	LoginPage lp;
	HomePage Hompage;
	ExcelConfigData excel;
	
	
	
	
	
	
	public LoginPageTest () {
		super();
		
	}
	
	@BeforeMethod 
	public void setup() {
		
		initilization();
		lp=new LoginPage();
		 excel=new ExcelConfigData("C:\\Users\\Ravikant\\DataDriven.xlsx");
				
	}
	
	
	@Test
	
	
	public void loginTest() {
				
	Hompage =lp.login(excel.getdata(0, 0, 0), excel.getdata(0, 0, 1));
     



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
