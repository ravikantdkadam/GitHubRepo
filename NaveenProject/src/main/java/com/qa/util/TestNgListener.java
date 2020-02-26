package com.qa.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aq.Base.TestBase;



public class TestNgListener extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test is Successfully passed  "+result.getName());
		takeSnapShot(result.getMethod().getMethodName());
		
		
	}
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test is failed "+result.getName());
		takeSnapShot(result.getMethod().getMethodName());
		
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

}
