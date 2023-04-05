package com.BBzar.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class App 
{
	public static AppiumDriver driver;
    public static void Base() throws MalformedURLException, InterruptedException
    {
    	DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("platormVersion", "13");
		capabilities.setCapability("deviceName", "Galaxy A04e");
		capabilities.setCapability("automationName", "uiAutomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPacakge","com.sec.android.app.launcher");
		capabilities.setCapability("appActivity","com.presideatech.brobazaar.MainActivity");
		capabilities.setCapability("noRest", true);
	   // capabilities.setCapability("newCommandTimeout", 3000);
		
		 URL url = new URL("http://127.0.0.1:4723/wd/hub");
         driver = new AndroidDriver(url, capabilities);
		 
         WebElement BroBazaarApp = driver.findElement(AppiumBy.xpath("//*[@text='Chrome']"));
         BroBazaarApp.click();
         
         System.out.println("App Launched Sucessfully");
		
		Thread.sleep(5000);
		
        //driver.quit();
    }
}
