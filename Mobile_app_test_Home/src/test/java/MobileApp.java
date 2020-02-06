import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MobileApp
{
	static AppiumDriver<MobileElement> driver;
	
//static WebDriver driver = new ChromeDriver();
	
	
	public static void main(String[] args) 
	{
		Calculator calculator  = new Calculator();
		 
		try {
			calculator.Sum_in_Calculator();
	       }catch(Exception exp)
	       {
	    	   System.out.println(exp.getCause());
	    	   System.out.println(exp.getMessage());
	    	   exp.printStackTrace(); 
	       }
	}
	
	
//	public static void pressButtonsController()
//	{
//		String calculator = new Calculator();
//	}
	

}
