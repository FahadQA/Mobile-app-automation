package Test_Case_05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import Base_Class.Base_class;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Test_Case_05 extends Base_class {
	
	public void Test_Case_05_Functionality() throws InterruptedException
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
		MobileElement radioGroup =driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\""+"Nike Blazer Mid '77"+ "\").instance(0))"));
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
        
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		MobileElement addTocart = driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart"));
		addTocart.click();
		System.out.println("Product added");
		Thread.sleep(5000L);
		
		
//		String amount1 = driver.findElements(By.xpath("//*[@text='$160.97']")).get(0).getText();
//		System.out.println(amount1);
//		double price1 = getAmount(amount1);
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		
//		String amount2 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
//		System.out.println(amount2);
//		double price2 = getAmount(amount2);
		
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
		
		double sum = 0;
		for(int i =0; i<count; i++)
		{
			String amount = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText();
			System.out.println(amount);
			double price = getAmount(amount);
			sum = sum+price;
			
		}
		
		System.out.println("sum Of products"+sum);
		
		
//		double sumOfproducts = price1 + price2;
//		System.out.println("sum Of products"+sumOfproducts);
		
		String totalPrice = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		System.out.println("So the total price"+totalPrice);
		totalPrice = totalPrice.substring(1);
		double total = Double.parseDouble(totalPrice);

       Assert.assertEquals(sum, total);
       System.out.println("matched");
       
		
      }
	
    public double getAmount(String value)
    {
    	value = value.substring(1);
		double price = Double.parseDouble(value);
		return price;
    }


	public void Test_Case_05_Functionality_Exception() {


		try {
			Test_Case_05_Functionality();
	       }catch(Exception exp)
	       {
	    	   System.out.println(exp.getCause());
	    	   System.out.println(exp.getMessage());
	    	   exp.printStackTrace(); 
	       }
		
	}	

}
