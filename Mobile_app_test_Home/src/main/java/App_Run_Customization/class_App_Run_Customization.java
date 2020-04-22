package App_Run_Customization;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class class_App_Run_Customization {
	
	
	static AppiumDriver<MobileElement> driver;
	
	public void Customization_Functionality() throws Exception 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "SM-A505F");
		cap.setCapability("udid", "R58M845XNZR");
		cap.setCapability("platformName", "Android");
		cap.setCapability("paltformVersion", "9");
		
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		


}
	
}
