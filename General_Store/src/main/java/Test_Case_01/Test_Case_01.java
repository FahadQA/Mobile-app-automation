package Test_Case_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import Base_Class.Base_class;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Test_Case_01 extends Base_class{
	
	

	
	public void Test_Case_01_Functionality() throws InterruptedException
	{
		 
		MobileElement CountryDropDownButton = driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry"));
		MobileElement NameTextField = driver.findElement(By.id("com.androidsample.generalstore:id/nameField"));
		MobileElement MaleRadiobutton = driver.findElement(By.id("com.androidsample.generalstore:id/radioMale"));
		MobileElement FemaleRadiobutton = driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale"));
		MobileElement letsShopButton = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
		 
	                                      
//		MobileElement country = driver.findElement(By.xpath("*//[@text='Albenia']"));
//		MobileElement ountry = driver.findElement(By.id("android:id/text1"));
//		MobileElement country = driver.findElementByAndroidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(text(\"Angela\"));");

//      This is for git test purpose 		
		
		
		
		
		
		
		NameTextField.sendKeys("hello");
		System.out.println("hello");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		FemaleRadiobutton.click();
		System.out.println("geneder selected");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		CountryDropDownButton.click();
		System.out.println("DropDownButton clicked");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		MobileElement selectCountry = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\""+"Australia"+ "\").instance(0))"));
		selectCountry.click();
		System.out.println("country selected");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		letsShopButton.click();		
		System.out.println("letsShopButton clicked");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


		
		
		
				
	}
	
	public void Base_Class_Exception() 
	{
		
				try {
					 Basic_Functionality();
			       }catch(Exception exp)
			       {
			    	   System.out.println(exp.getCause());
			    	   System.out.println(exp.getMessage());
			    	   exp.printStackTrace(); 
			       }

   }
	
	public void Test_Case_01_Functionality_Exception()
	{
		try {
			Test_Case_01_Functionality();
	       }catch(Exception exp)
	       {
	    	   System.out.println(exp.getCause());
	    	   System.out.println(exp.getMessage());
	    	   exp.printStackTrace(); 
	       }


		
		
	}
	
	
}
