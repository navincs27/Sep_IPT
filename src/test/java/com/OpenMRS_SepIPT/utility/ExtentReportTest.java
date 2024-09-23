package com.OpenMRS_SepIPT.utility;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;
import com.base_class_omrs.Base_class;

public class ExtentReportTest {
	
public static ExtentTest extenttest;
	
	@BeforeSuite
	public void extentReortstartup() {
    Base_class base = new Base_class();
      base.extentReportStart(null);
	}
	
	@AfterSuite
	public void extentreport() throws IOException {
      Base_class base = new Base_class();
       base.extentReportsTearDown(null);
	}
	


}
