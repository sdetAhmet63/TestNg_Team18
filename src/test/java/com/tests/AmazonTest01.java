package com.tests;

import com.pages.AmazonPagesTestBase;
import com.utilities.TestBase;
import org.junit.Test;


public class AmazonTest01 extends TestBase {
    @Test
    public void test01(){
        driver.get("https://www.amazon.fr");
        AmazonPagesTestBase amazonPage=new AmazonPagesTestBase(driver);
        amazonPage.amazonSearchBox.sendKeys("webcam");

    }

}
