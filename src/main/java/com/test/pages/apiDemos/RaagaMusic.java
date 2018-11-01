package com.test.pages.apiDemos;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class RaagaMusic extends initializationPage{

	public static void main(String[] args) throws MalformedURLException {
		 AndroidDriver<MobileElement> dr;
			DesiredCapabilities caps = new DesiredCapabilities();
			//File app = new File("C:\\Users\\Sneha\\Downloads\\ApiDemos-debug.apk");
			File app = new File("D:\\apps\\Raaga Hindi Tamil Telugu songs and podcasts_v7.1.1_apkpure.com.apk");
			caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

			//caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			 //DesiredCapabilities caps = DesiredCapabilities.android();
			  caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
			 // caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.raaga.android");
			 // caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.raaga.musichome.MusicHome");
			  
			 /* caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.lenovo.anyshare.gps");
			  caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.lenovo.anyshare.main.MainActivity");*/
			  dr = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			  dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  
			  dr.findElementByXPath(".//*[@text='snehadt7@gmail.com']").click();
			  //dr.findElementById("com.raaga.android:id/landing_skip_to_raaga").click();
			  dr.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
			  
			  
			 /* dr.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"MY PLAYLISTS\"));"));
			  dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"MY PLAYLISTS\"));)");
		
			  dr.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"TALK\")")).click();
			  
			 // dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"MY PLAYLISTS\").instance(0))");
			  //dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(resourceId(\"com.raaga.android:id/music_home_raaga_live\")))");
			  dr.findElement(MobileBy.AndroidUIAutomator("text(\"TALK\")")).click();*/
			 System.out.println( dr.findElementByXPath(".//android.widget.ImageView[@resource-id='com.raaga.android:id/nav_ham_burger']").getText());
			  dr.findElementById("com.raaga.android:id/nav_ham_burger").click();
			  
			  

	

}
}
