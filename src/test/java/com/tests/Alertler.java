package com.tests;

import com.pages.JSalertPages;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.junit.Test;


public class Alertler {

    JSalertPages jSalertPages=new JSalertPages();

    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("JSalert"));
        jSalertPages.simpleAlert.click();
        Thread.sleep(5000);
        System.out.println(Driver.getDriver().switchTo().alert().getText());

    }

    @Test
    public void test02() {
        Driver.getDriver().get(ConfigurationReader.getProperty("JSalert"));
        Driver.getDriver().manage().window().maximize();
        jSalertPages.promptAlert.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String mesaj=Driver.getDriver().switchTo().alert().getText();
        System.out.println(mesaj);
        Driver.getDriver().switchTo().alert().sendKeys("selam");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.getDriver().switchTo().alert().accept();

    }

}
