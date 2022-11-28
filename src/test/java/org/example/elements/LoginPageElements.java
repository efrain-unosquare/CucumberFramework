package org.example.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='ossn-login']/fieldset/div[1]/input") public WebElement userInput;
    @FindBy(xpath = "//*[@id='ossn-login']/fieldset/div[2]/input") public WebElement passInput;
    @FindBy(xpath = "//input[@class='btn btn-primary']") public WebElement loginBtn;

    public LoginPageElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
