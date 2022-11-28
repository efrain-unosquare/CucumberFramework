package org.example.pages;

import org.example.steps.GlobalHooksDefinition;
import org.openqa.selenium.WebDriver;

public class GlobalCommonActions {
    WebDriver driver;

    public GlobalCommonActions(GlobalHooksDefinition hooksDefinition){
        this.driver = hooksDefinition.getDriver();
    }

    public void goToUrl(String url){
        driver.get(url);
    }

    public String getCurrentPageUrl(){
        return driver.getCurrentUrl();
    }

    public void resizeTheWindow(){
        driver.manage().window().maximize();
    }
}
