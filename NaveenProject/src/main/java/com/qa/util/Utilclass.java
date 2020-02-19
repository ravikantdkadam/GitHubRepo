package com.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Utilclass {
	

	public static void takeSnapShot (WebDriver driver ,String screenshotName) {
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		File source=scrShot.getScreenshotAs(OutputType.FILE);
		
	try {
		FileUtils.copyFile(source, new File ("./screenshot/"+screenshotName+".png"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
	}
}
