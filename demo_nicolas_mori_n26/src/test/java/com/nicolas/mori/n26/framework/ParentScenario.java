package com.nicolas.mori.n26.framework;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.nicolas.mori.n26.page.object.HomePage;
import com.nicolas.mori.n26.page.object.LoginPage;
import com.nicolas.mori.n26.page.object.ToolBar;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * This Class is created for make a helper for all the pages, and all the parts
 * of the a native app, or for execute all the drivers. And for create all the
 * objects of pages, or objects created in all the pages.
 * 
 */

public class ParentScenario {

	protected WebDriver driver;

	protected ToolBar toolBar;
	protected LoginPage loginPage;
	protected HomePage homePage;

	/**
	 * this method create the object driver for Android.
	 * 
	 * @param uuid
	 *            of the device to use.
	 */
	public void startAndroid(String uuid) {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, uuid);
		cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.android2.calculator3");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");

		try {
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (Exception e) {
			System.out.println("Exeption at the moment to generate the driver = " + e);
		}

		toolBar = new ToolBar(driver);
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);

	}

}
