package com.myApp.core.driver;

import com.myApp.core.configuration.AppSettings;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MyAndroidDriver {

    public MyAndroidDriver() {
    }

    public AndroidDriver getDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.APP, AppSettings.Instance.AppPath);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, AppSettings.Instance.DeviceName);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability("autoGrantPermissions",true);
        caps.setCapability("appWaitActivity","org.openintents.shopping.ui.LayoutChoiceActivity");
        return new AndroidDriver(new URL(AppSettings.Instance.AppiumServerUrl), caps);
    }

}
