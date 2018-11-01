package com.test.pages.apiDemos;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class watsApp {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<MobileElement> dr;
		DesiredCapabilities caps = new DesiredCapabilities();
		//File app = new File("C:\\Users\\Sneha\\Downloads\\ApiDemos-debug.apk");
		//File app = new File("D:\\apps\\Raaga Hindi Tamil Telugu songs and podcasts_v7.1.1_apkpure.com.apk");
		//caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		//caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		 //DesiredCapabilities caps = DesiredCapabilities.android();
		  caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		 caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.whatsapp");
		 caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.whatsapp.HomeActivity");
		  
		 /* caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.lenovo.anyshare.gps");
		  caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.lenovo.anyshare.main.MainActivity");*/
		  dr = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		  dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  dr.findElementById("com.whatsapp:id/eula_accept").click();

	}

}
