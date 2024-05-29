import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class LongPressGesture extends BasicClass {

    @Test
    public void AppiumBasicTest() throws InterruptedException {

        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        System.out.println("View Button Clicked");

        driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
        System.out.println("Expandable Lists Button Clicked");

        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
        System.out.println("Custom Adapter Button Clicked");

        WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text=\"People Names\"]"));

        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement)ele).getId(),"duration",2000));

        Thread.sleep(5000);
    }
}
