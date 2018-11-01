package com.test.pages.apiDemos;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ApiDemosAuto extends initializationPage{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		 AndroidDriver<MobileElement> dr=initializationfun();
		 
		 dr.findElementByXPath(".//android.widget.TextView[@text='Preference']").click();
		 dr.findElementByXPath(".//android.widget.TextView[@text='3. Preference dependencies']").click();
		 dr.findElementByClassName("android.widget.CheckBox").click();
		 dr.findElementByXPath("(.//android.widget.RelativeLayout)[2]").click();
		 dr.findElementByClassName("android.widget.EditText").sendKeys("1234");
		 dr.findElementsByClassName("android.widget.Button").get(1).click();
		 
		 
	}

}
