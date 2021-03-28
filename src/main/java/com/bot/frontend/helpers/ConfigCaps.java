package com.bot.frontend.helpers;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ConfigCaps {

    static String url = "http://127.0.0.1:4723/wd/hub";


    public static final URL appiumServerUrl() {
        try {
            return new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static final DesiredCapabilities Poco_Facebok() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "M2007J20CG");
        capabilities.setCapability(MobileCapabilityType.UDID, "42ad375c");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
        capabilities.setCapability("appPackage", "com.facebook.katana"); //USSD
        capabilities.setCapability("appActivity", "com.facebook.katana.LoginActivity"); // USSD
        return capabilities;
    }


}
