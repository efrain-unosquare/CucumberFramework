package org.example.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {

    WebDriver driver;

    @FindBy(linkText = "Login") public WebElement loginBtn;

    public HomePageElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
