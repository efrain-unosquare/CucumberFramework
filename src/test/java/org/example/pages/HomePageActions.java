package org.example.pages;

import org.example.elements.HomePageElements;
import org.example.steps.GlobalHooksDefinition;
import org.openqa.selenium.WebDriver;

public class HomePageActions {

    WebDriver driver;
    HomePageElements elements;

    public HomePageActions(GlobalHooksDefinition hooks){
        this.driver = hooks.getDriver();
        elements = new HomePageElements(driver);
    }

    public void clickOnLoginBtn(){
        elements.loginBtn.click();
    }

}
