package com.test.pages.apiDemos;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class touchActions extends initializationPage{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<MobileElement> dr=initializationfun();
		dr.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		TouchAction action=new TouchAction(dr);
		action.tap(dr.findElement(MobileBy.AndroidUIAutomator("text(\"Expandable Lists\")"))).perform();
		//action.press(dr.findElement(MobileBy.AndroidUIAutomator("text(\"1. Custom Adapter\")"))).waitAction(3000);
		action.tap(dr.findElement(MobileBy.AndroidUIAutomator("text(\"1. Custom Adapter\")"))).perform();

		action.longPress(dr.findElement(MobileBy.AndroidUIAutomator("text(\"People Names\")"))).perform();
				

	}

}
