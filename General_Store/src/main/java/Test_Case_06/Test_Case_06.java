package Test_Case_06;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base_Class.Base_class;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class Test_Case_06  extends Base_class {
	public void Test_Case_06_Functionality() throws InterruptedException
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
        
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		MobileElement addTocart = driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart"));
		addTocart.click();
		System.out.println("Product added");
		
//		=== code of test case 06 starts from here ===
		
		WebElement Checkbox = driver.findElement(By.xpath("//*[@text='Send me e-mails on discounts related to selected products in future']"));
		WebElement TandC = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
		WebElement popUpCloseButton = driver.findElement(By.xpath("//*[@text='CLOSE']"));
		WebElement webViewButton = driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed"));
//		Checkbox.click();
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(tapOptions().withElement(element(Checkbox))).perform();
	
		System.out.println("checkbox clicked");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		
		TouchAction ClickTerms = touchAction.longPress(longPressOptions().withElement(element(TandC)).withDuration(ofSeconds(2)));
		ClickTerms.release().perform();
		System.out.println("terms clicked");

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		popUpCloseButton.click();
		System.out.println("close button clicked");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		webViewButton.click();
		System.out.println("web button clicked");

	}




	public void Test_Case_06_Functionality_Exception() {


		try {
			Test_Case_06_Functionality();
	       }catch(Exception exp)
	       {
	    	   System.out.println(exp.getCause());
	    	   System.out.println(exp.getMessage());
	    	   exp.printStackTrace(); 
	       }
		
	}	
	

}
