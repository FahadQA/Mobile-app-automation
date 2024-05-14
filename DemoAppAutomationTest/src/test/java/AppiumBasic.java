import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AppiumBasic extends BasicClass {

    @Test
    public void AppiumBasicTest()  {

        driver.findElement(By.id("android:id/text1")).click();
        System.out.println("Clicked");

    }
}
