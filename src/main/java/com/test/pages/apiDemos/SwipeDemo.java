package com.test.pages.apiDemos;

import java.net.MalformedURLException;
import java.time.Duration;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class SwipeDemo extends initializationPage{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<MobileElement> dr=initializationfun();
		dr.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		
		dr.findElement(MobileBy.AndroidUIAutomator("text(\"Date Widgets\")")).click();
		dr.findElement(MobileBy.AndroidUIAutomator("text(\"2. Inline\")")).click();
		dr.findElementByXPath(".//*[@content-desc='5']").click();
		//dr.findElement(MobileBy.AndroidUIAutomator("content-desc(\"5\")")).click();
		TouchAction action=new TouchAction(dr);
		//action.press(dr.findElement(MobileBy.AndroidUIAutomator("content-desc(\"15\")"))).waitAction().moveTo(dr.findElement(MobileBy.AndroidUIAutomator("content-desc(\"45\")"))).release().perform();
		action.press(dr.findElementByXPath(".//*[@content-desc='15']")).waitAction(Duration.ofSeconds(2	)).moveTo(dr.findElementByXPath(".//*[@content-desc='45']")).release().perform();
		

	}

}
