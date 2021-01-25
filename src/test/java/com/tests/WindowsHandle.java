package com.tests;

import com.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.util.Set;

public class WindowsHandle extends TestBase {

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/windows");
        String windowsHandle= driver.getWindowHandle();
        System.out.println(windowsHandle);

        driver.findElement(By.partialLinkText("Click Here")).click();

        Set<String> allWindowH= driver.getWindowHandles();
        Thread.sleep(3000);

        for (String handle: allWindowH){
            System.out.println(handle);
        }
      //  driver.switchTo().window()
    }
}
