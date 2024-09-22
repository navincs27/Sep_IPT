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
	}
}
