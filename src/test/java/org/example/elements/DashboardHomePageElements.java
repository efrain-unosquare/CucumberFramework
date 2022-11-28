package org.example.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardHomePageElements {
    WebDriver driver;

    @FindBy(xpath = "//li[contains(text(),'Messages')]") public WebElement messagesLink;
    @FindBy(tagName= "textarea") public WebElement textArea;
    @FindBy(xpath = "//input[@Type='submit']") public WebElement sendBtn;
    @FindBy(css = "div.ossn-wall-post-button-container>input") public WebElement postBtn;

    @FindBy(xpath = "//p[contains(text(),'This post is created from automated Test')]") public  WebElement post;

    public DashboardHomePageElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
