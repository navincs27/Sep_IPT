package com.OpenMRS_SepIPT.runner;

import org.listener.ExtentReport_Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.LogInPom;

public class TestRunner {

	public void setUp() {
		browserLaunch("chrome");
	}

	@Test(priority = 1)
	public void validLogin() {
		ExtentReport_Test.extendttest = extendreports
				.createTest("Login test" + " : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("Valid login");
		LogInPom pm = new LogInPom(driver);
		Assert.assertTrue(pm.validLogin(ExtentReport_Test.extendttest));
	}

}
