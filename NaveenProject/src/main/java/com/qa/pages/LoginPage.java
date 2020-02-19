package com.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aq.Base.TestBase;

public class LoginPage extends TestBase {
	
	
	//PageFactory -----OR
	
   @FindBy(name="email")
   WebElement username;
   
   @FindBy(name="password")
   WebElement password;
   

   @FindBy(xpath="//div[text()='Login']")
   WebElement loginBtn;
   
   
   
   
   // create constructor of same page (Intilizing page objects)
   
 public LoginPage() {
	 
	PageFactory.initElements(driver, this);
 }
 
 
 // Create Methods(Actions)
 
 public HomePage login (String un, String pwd) {
	 
	 username.sendKeys(un);
	 password.sendKeys(pwd);
	 loginBtn.click();
	 return new HomePage();
 }
 
 public String title() {
	
	 return driver.getTitle();
	 
	 
 }


 

 }
	
	


