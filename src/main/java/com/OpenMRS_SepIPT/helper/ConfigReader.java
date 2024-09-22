<<<<<<< HEAD
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
=======
package com.OpenMRS_SepIPT.helper;

public class ConfigReader {
	public String getTextArea() {
		String textarea= getConfigFileValues().getProperty("textarea");
		return textarea;
	}
	
	public String getAttachment() {
		String attachment= getConfigFileValues().getProperty("attachment");
		return attachment;
	}
	
	public String getRecentDate() {
		String recentdate= getConfigFileValues().getProperty("recentdate");
		return recentdate;
	}	
	
	public String getRecentTag() {
		String recenttag= getConfigFileValues().getProperty("recenttag");
		return recenttag;
	}	
	
	public String getHeight() {
		String height= getConfigFileValues().getProperty("height");
		return height;
	}	
	
	public String getWeight() {
		String weight= getConfigFileValues().getProperty("weight");
		return weight;
	}
	
	public String getHeightCm() {
		String heightcm= getConfigFileValues().getProperty("heightcm");
		return heightcm;
	}	
	
	public String getWeightKg() {
		String weightkg= getConfigFileValues().getProperty("weightkg");
		return weightkg;
	}	
	
	public String getBmi() {
		String bmi= getConfigFileValues().getProperty("bmi");
		return bmi;
	}	
	
	public String getRecentTag1() {
		String recenttag1= getConfigFileValues().getProperty("recenttag1");
		return recenttag1;
	}
	
	public String getRecentVisits() {
		String recentvisits= getConfigFileValues().getProperty("recentvisits");
		return recentvisits;
	}
	
	public String getReason() {
		String reason= getConfigFileValues().getProperty("reason");
		return reason;
>>>>>>> 185e364c9099eacd8fdafc763999ecbd4494cce5
	}
}
