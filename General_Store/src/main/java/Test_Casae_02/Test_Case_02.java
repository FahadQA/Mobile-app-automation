package Test_Casae_02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import Base_Class.Base_class;
import io.appium.java_client.MobileElement;

public class Test_Case_02 extends Base_class {
	
	MobileElement letsShopButton = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")); 
    String ToastMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
    



}
