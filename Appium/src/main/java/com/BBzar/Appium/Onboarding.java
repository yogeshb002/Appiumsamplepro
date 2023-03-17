package com.BBzar.Appium;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class Onboarding  extends App{
	
public static void Skip_method()  throws MalformedURLException, InterruptedException {
	
	App.Base();
	WebElement Skip = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView"));
Skip.click();
Thread.sleep(5000);
System.out.println("Click on skip done");
}
}
