package com.pages;
import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class JSalertPages {


    public JSalertPages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[@onclick='jsAlert()']")
    public WebElement simpleAlert;

    @FindBy (xpath = "//button[@onclick='jsPrompt()']")
    public WebElement promptAlert;
}