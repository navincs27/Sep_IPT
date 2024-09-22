package com.OpenMRS_SepIPT.utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.listener.ExtentReport_test;

public class ITestListenerClass {
	{
	    public String testname;
	    public String Methodname;
	    
	    
		public void onTestStart(ITestResult result) {
		}
	     
		public void onTestSuccess(ITestResult result) {
			try {
				ExtentReport_test.extentest.pass(result.getMethod()+ " : " + "TEST PASS",
						MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void onTestFailure(ITestResult result) {
			try {
				ExtentReport_test.extentest.fail(result.getMethod()+ " : " + "TEST FAIL",
						MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
}
