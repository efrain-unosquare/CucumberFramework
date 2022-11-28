package org.example.pages;

import org.example.elements.LoginPageElements;
import org.example.steps.GlobalHooksDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageActions {

    WebDriver driver;
    LoginPageElements elements;

    public LoginPageActions(GlobalHooksDefinition hooks){
        this.driver = hooks.getDriver();
        elements = new LoginPageElements(driver);
    }

    public void clearLoginForm(){
        elements.userInput.clear();
        elements.passInput.clear();
    }

    public void enterUserName(String userName){
        elements.userInput.sendKeys(userName);
    }

    public void enterPassword(String password){
        elements.passInput.sendKeys(password);
    }

    public void clickOnLoginBtn(){
        elements.loginBtn.click();
    }

}
