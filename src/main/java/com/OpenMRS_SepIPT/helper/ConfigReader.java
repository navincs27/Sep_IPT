package com.OpenMRS_SepIPT.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
FileInputStream fis;
	
	public Properties configFile()	{
		File file = new File("C:\\Users\\sures\\eclipse-workspace\\Sep_IPT\\src\\main\\java\\com\\OpenMRS_SepIPT\\helper\\OpenMrsdata.properties");
		
		try {
			fis = new FileInputStream(file);
			
			
		} catch (FileNotFoundException e) {

		}
		
		Properties pro = new Properties();
		
		try {
			pro.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pro;
	}
	
	public String getBrowser()	{
		String browser = configFile().getProperty("browser");
		return browser;
	}
	
	public String getUrl()	{
		String url = configFile().getProperty("url");
		return url;
	}
	public String getUsername()	{
		String username = configFile().getProperty("username");
		return username;
	}
	public String getPassword()	{
		String password = configFile().getProperty("password");
		return password;
	}
	public String getTitle()	{
		String title = configFile().getProperty("title");
		return title;
	}
	public String getGiven()	{
		String given = configFile().getProperty("given");
		return given;
	}
	public String getFname()	{
		String fname = configFile().getProperty("fname");
		return fname;
	}
	public String getGender()	{
		String gender = configFile().getProperty("gender");
		return gender;
	}
	public String getDay()	{
		String day = configFile().getProperty("day");
		return day;
	}
	public String getMonth()	{
		String month = configFile().getProperty("month");
		return month;
	}
	public String getYear()	{
		String year = configFile().getProperty("year");
		return year;
	}
	public String getAddress1()	{
		String address1 = configFile().getProperty("address1");
		return address1;
	}
	public String getAddress2()	{
		String address2 = configFile().getProperty("address2");
		return address2;
	}
	public String getCity()	{
		String city = configFile().getProperty("city");
		return city;
	}
	public String getState()	{
		String state = configFile().getProperty("state");
		return state;
	}
	public String getCountry()	{
		String country = configFile().getProperty("country");
		return country;
	}
	public String getPostalCode()	{
		String postalcode = configFile().getProperty("postalcode");
		return postalcode;
	}
	public String getPhoneno()	{
		String phoneno = configFile().getProperty("phoneno");
		return phoneno;
	}
	public String getRelationType()	{
		String relationtype = configFile().getProperty("relationtype");
		return relationtype;
	}
	public String getPersonName()	{
		String personname = configFile().getProperty("personname");
		return personname;
	}
	public String getTitle1()	{
		String title1 = configFile().getProperty("title1");
		return title1;
	}
}
