package com.tests;

import com.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Iframe_Test extends TestBase {

    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);
        WebElement iframe= driver.findElement(By.xpath("//p"));
        System.out.println(iframe.getText());
        iframe.clear();
        iframe.sendKeys("team 18'den selamlar... ");
        driver.switchTo().defaultContent();



    }
}
