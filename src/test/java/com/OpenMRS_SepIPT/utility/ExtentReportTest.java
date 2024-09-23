package com.OpenMRS_SepIPT.utility;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.OpenMRS_SepIPT.base.Baseclass;
import com.aventstack.extentreports.ExtentTest;
import com.base_class_omrs.Base_class;

public class ExtentReportTest {
	
public static ExtentTest extenttest;
	
	@BeforeSuite
	public void extentReortstartup() {
    Baseclass base = new Baseclass();
      base.extentReportStart(null);
	}
	
	@AfterSuite
	public void extentreport() throws IOException {
      Baseclass base = new Baseclass();
       base.extentReportsTearDown(null);
	}
	


}
