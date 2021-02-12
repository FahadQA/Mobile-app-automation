package Base_Class;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Base_class {
	
	protected static AppiumDriver<MobileElement> driver;
//	private AndroidDriver driverr;
	
	
	public void Basic_Functionality() throws Exception 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "SM-A505F");
		cap.setCapability("udid", "R58M845XNZR");
		cap.setCapability("platformName", "Android");
		cap.setCapability("paltformVersion", "9");
		
		
		
		cap.setCapability("appPackage", "com.androidsample.generalstore");
		cap.setCapability("appActivity", "com.androidsample.generalstore.SplashActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application starting . . . ");
		
	}

}
