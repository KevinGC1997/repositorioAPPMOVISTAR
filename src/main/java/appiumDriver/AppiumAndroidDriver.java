package appiumDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAndroidDriver {
    public static AppiumDriver<MobileElement> driver;

    public static AppiumAndroidDriver appium(){
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("noReset", "true");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "10");
            capabilities.setCapability("deviceName", "M2004J19G");
            capabilities.setCapability( "udid", "ff5dd04c0505");
            capabilities.setCapability("appPackage", "movistar.android.app");
            capabilities.setCapability("appActivity", "movistar.android.app.MainActivity");

            driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return new AppiumAndroidDriver();
    }
    public io.appium.java_client.AppiumDriver<MobileElement> on(){return driver;}
}
