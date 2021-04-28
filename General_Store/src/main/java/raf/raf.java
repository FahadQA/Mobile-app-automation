package raf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import Base_Class.Base_class;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class raf extends Base_class{
	
	public void testref() throws InterruptedException
	{
		//==== Home page ==== 
		MobileElement CountryDropDownButton = driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry"));
		MobileElement NameTextField = driver.findElement(By.id("com.androidsample.generalstore:id/nameField"));
		MobileElement MaleRadiobutton = driver.findElement(By.id("com.androidsample.generalstore:id/radioMale"));
		MobileElement FemaleRadiobutton = driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale"));
		MobileElement letsShopButton = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
		//MobileElement selectCountry = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\""+"Australia"+ "\").instance(0))"));
		//MobileElement radioGroup =driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\""+"Jordan 6 Rings"+ "\").instance(0))"));
		//MobileElement addTocart = driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart"));
 
	                                      

		NameTextField.sendKeys("hello");
		System.out.println("hello");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		FemaleRadiobutton.click();
		System.out.println("geneder selected");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		CountryDropDownButton.click();
		System.out.println("DropDownButton clicked");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//===== select country from another view ====
		MobileElement selectCountry = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\""+"Australia"+ "\").instance(0))"));
		selectCountry.click();
		System.out.println("country selected");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		letsShopButton.click();		
		System.out.println("letsShopButton clicked");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//==== product list screen ====
		
		//MobileElement radioGroup =driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\""+"Jordan 6 Rings"+ "\").instance(0))"));
		
		//int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\""+"Nike Blazer Mid '77"+ "\").instance(0))"));
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
        
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		MobileElement addTocart = driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart"));
		addTocart.click();
		System.out.println("Product added");
		Thread.sleep(5000L);
		
		

		
		

		
		
//		double sumOfproducts = price1 + price2;
//		System.out.println("sum Of products"+sumOfproducts);
		
		
       
		
      }
	
   


	public void refrun() {


		try {
			testref();
	       }catch(Exception exp)
	       {
	    	   System.out.println(exp.getCause());
	    	   System.out.println(exp.getMessage());
	    	   exp.printStackTrace(); 
	       }
		
	}	

}
