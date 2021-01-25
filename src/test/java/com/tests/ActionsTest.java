package com.tests;

import com.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class ActionsTest extends TestBase {


    @Test
    public void test01(){
        //sag tiklama ==contextClick
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions actions=new Actions(driver);
        WebElement contextMenu= driver.findElement(By.id("hot-spot"));
        actions.contextClick(contextMenu).perform();
        driver.switchTo().alert().accept();



    }

}
