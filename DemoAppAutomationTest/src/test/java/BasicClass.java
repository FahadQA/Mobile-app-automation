import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BasicClass {

    AppiumDriver driver;
    AppiumDriverLocalService service;

    @BeforeClass
    public void configAppium() throws MalformedURLException {

        System.out.println("**** Getting start the appium server ****");

//        service = new AppiumServiceBuilder().withAppiumJS(new File("/Users/smarterai/.nvm/versions/node/v20.11.1/lib/node_modules/appium/build/lib/main.js"))
//                .withIPAddress("0.0.0.0").usingPort(4723).build();


//        service.start();

        // Set desired capabilities
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "Fahademulator");
        desiredCapabilities.setCapability("app", "/Users/smarterai/Documents/Automation Project/Mobile app/DemoAppAutomationTest/src/test/DemoApp/ApiDemos-debug.apk");
        desiredCapabilities.setCapability("automationName", "UiAutomator2"); // Specify the automation name
        desiredCapabilities.setCapability("platformName", "Android"); // Specify the platform name


        // Initialize Appium driver with desired capabilities
        driver = new AppiumDriver(new URL("http://0.0.0.0:4723"), desiredCapabilities);

        System.out.println("**** Appium server started ****");

    }

    public void longPressVreification(WebElement ele)
    {
        ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(), "duration", 2000));


    }

    @AfterClass
    public void tearDown(){
        driver.quit();
        System.out.println("**** Driver closed ****");
//        service.stop();
//        System.out.println("**** Appium server closed ****");

    }



}
