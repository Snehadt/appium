package com.test.pages.apiDemos;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class UsingAndroidUIAutomator extends initializationPage{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<MobileElement> dr=initializationfun();
		dr.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();

	}

}
