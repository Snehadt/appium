package com.test.pages.apiDemos;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ScrollDemo extends initializationPage{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<MobileElement> dr=initializationfun();
		dr.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		dr.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		//dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");

	}

}
