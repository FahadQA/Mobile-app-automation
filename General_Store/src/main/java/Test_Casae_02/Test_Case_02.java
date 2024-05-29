package Test_Casae_02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.springframework.util.Assert;
import org.testng.*;

import Base_Class.Base_class;
import io.appium.java_client.MobileElement;

public class Test_Case_02 extends Base_class{

	
	public void Test_Case_02_Functionality() throws InterruptedException
	{
		 
		MobileElement letsShopButton = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
		
		letsShopButton.click();		
		System.out.println("letsShopButton clicked");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String ToastMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(ToastMessage);

    }
	
	public void Test_Case_02_Functionality_Exception()
	{
		try {
			Test_Case_02_Functionality();
	       }catch(Exception exp)
	       {
	    	   System.out.println(exp.getCause());
	    	   System.out.println(exp.getMessage());
	    	   exp.printStackTrace(); 
	       }
		
		
	}
}
