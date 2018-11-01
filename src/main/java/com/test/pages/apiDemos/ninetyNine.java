package com.test.pages.apiDemos;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ninetyNine extends initializationPage{

	public static void main(String[] args) throws MalformedURLException {
		 AndroidDriver<MobileElement> dr;
			DesiredCapabilities caps = new DesiredCapabilities();
			//File app = new File("C:\\Users\\Sneha\\Downloads\\ApiDemos-debug.apk");
			File app = new File("D:\\apps\\com.nnacres.app_2018-06-01.apk");
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
			  
			  
			 // dr.findElementByXPath(".//*[@text='snehadt7@gmail.com']").click();
			  //dr.findElementById("com.raaga.android:id/landing_skip_to_raaga").click();
			 // dr.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
			  
		
			 // dr.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"TALK\")")).click();
			  
			 // 
			  
			  dr.findElementById("com.nnacres.app:id/buttonOverlayGotIt").click();
			  
			  dr.findElement(MobileBy.AndroidUIAutomator("text(\"Search\")")).click();
			  dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"2\"));)");

			  dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"2\").instance(0))");
			  //dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"2\")))");
			  
			 /* Point point=dr.findElementByClassName("android.widget.ImageView").getLocation();
			  MobileElement ele=dr.findElementByClassName("android.widget.ImageView");
			  
			  Dimension dim=dr.manage().window().getSize();
			  int height=dim.getHeight();
			  int width=dim.getWidth();
			  int startX=width/2;
			  int startY=(int)(height*.80);
			  int endY=(int)(height*.20);
			  TouchAction action=new TouchAction(dr);
			  action.longPress(startX, startY).waitAction(Duration.ofSeconds(2)).moveTo(startX, endY).release().perform();
			  
		/*	 int startX= ele.getLocation().getX();
			 int startY=ele.getLocation().getY();
			int endX= (startX+ele.getSize().getWidth());
			int end50=(int)(startX+((ele.getSize()).getWidth())*0.41);
			  TouchAction action=new TouchAction(dr);
			  action.longPress(startX, startY).moveTo(end50, startY).release().perform();
			 /* Dimension dim=dr.manage().window().getSize();
			  int Height=dim.getHeight();
			  int Width=dim.getWidth();
			 int y=(int) (Height*.60);
			 int startX=(int)(Width*75);
			 int endX=(int)(Width*30);
			 action.tap(startX, y).moveTo(endX, y).perform();*/
			 
			 // action.tap(point.x+40, point.y+30).perform();
			 /* dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\"com.nnacres.app:id/bedroom2\").instance(0))");
			  dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(resourceId(\"com.nnacres.app:id/bedroom2\"))");
			  dr.findElementById("com.raaga.android:id/music_home_raaga_live").click();
			 // dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(resourceId(\"com.nnacres.app:id/bedroom2\")))");
			 /* dr.findElementByXPath(".//android.widget.TextView[@text='TALK']").click();
			  dr.findElementById("com.raaga.android:id/nav_ham_burger").click();*/
			  
			  

	

}
}
