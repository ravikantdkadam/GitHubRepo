package com.aq.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	
	public static Properties prop;
	
	
	public TestBase ()  {
		
		
		try {
			prop =new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Ravikant\\eclipse-workspace\\NaveenProject\\src\\main\\java\\com\\qa\\config\\config.properties");
			
		prop.load(ip);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	//Create initialization Method
	
	public static void initilization() {
		String browsername=prop.getProperty("browser");
		
		if (browsername.equals("chrome")) {
			

			System.setProperty("webdriver.chrome.driver","D:\\Amit selenium jar file\\chromedriver\\chromedriver.exe");
			
			 driver=new ChromeDriver();
		}
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
}
