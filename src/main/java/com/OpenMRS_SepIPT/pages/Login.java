package com.OpenMRS_SepIPT.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OpenMRS_SepIPT.pagesinterfaces.LoginInter;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Login implements LoginInter  {

	
public static WebDriver driver;
	
	@FindBy(id=username_id)
	private WebElement username;
	
	@FindBy(id=password_id)
	private WebElement password;
	
	
	@FindBy(xpath =Location_xpath)
	private WebElement location;
	

	@FindBy(xpath =login_xpath)
	private WebElement login;
	
	
	
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}




	public boolean validLogin(ExtentTest extenttest) {
		try {
	urlLaunch(Frm.getInstanceFrm().getConfigurationReader().getUrl());
	SendKeys(driver, username, Frm.getInstanceFrm().getConfigurationReader().getuserName());
	SendKeys(driver, password, Frm.getInstanceFrm().getConfigurationReader().getPassword());
	click(driver, location);
	click(driver, login);
	validation(driver, Frm.getInstanceFrm().getConfigurationReader().getTile());
	extenttest.log(Status.PASS, "Login Successfull");
		}catch (AssertionError e) {
			extenttest.log(Status.FAIL, "Login Failed"   + e.getMessage());
			return false;
			
		}
		
		return true;
		}

}
