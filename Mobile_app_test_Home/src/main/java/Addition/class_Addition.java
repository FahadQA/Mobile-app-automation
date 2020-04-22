package Addition;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import App_Run_Customization.class_App_Run_Customization;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class class_Addition {
	
	static AppiumDriver<MobileElement> driver;
	
	
	
	public void Addition_Functionality() throws Exception 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "SM-A505F");
		cap.setCapability("udid", "R58M845XNZR");
		cap.setCapability("platformName", "Android");
		cap.setCapability("paltformVersion", "9");
		
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application starting . . . ");

		
		
		
		MobileElement one = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_01"));
		MobileElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02"));
		MobileElement plus = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add"));
		MobileElement equal = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal"));
		MobileElement result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_tv_result"));
		
		
		int i;
		
		for(i=0; i<2 ; i++)
		{
			one.click();
		}
		
		plus.click();
		
		for(i=0; i<2 ; i++)
		{
			two.click();
		}
		
		//equal.click();
		
		System.out.println("the result is:"+ " "+result.getText());
		
		
		
	}
	
	public void Addition_Exicution() 
	{
		
		try {
			Addition_Functionality();
	       }catch(Exception exp)
	       {
	    	   System.out.println(exp.getCause());
	    	   System.out.println(exp.getMessage());
	    	   exp.printStackTrace(); 
	       }
		
		
	}
	
	

}
