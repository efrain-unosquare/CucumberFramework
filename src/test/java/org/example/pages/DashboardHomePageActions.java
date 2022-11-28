package org.example.pages;

import org.example.elements.DashboardHomePageElements;
import org.example.steps.GlobalHooksDefinition;
import org.openqa.selenium.WebDriver;

public class DashboardHomePageActions {

    WebDriver driver;
    DashboardHomePageElements elements;

    public DashboardHomePageActions(GlobalHooksDefinition hooks){
        this.driver = hooks.getDriver();
        elements = new DashboardHomePageElements(driver);
    }

    public void clickOnMessagesLink(){
        elements.messagesLink.click();
    }

    public void enterNewMessage(String message){
        elements.textArea.sendKeys(message);
    }

    public void sendMessage(){
        elements.sendBtn.click();
    }

    public void enterNewPost(String newPost){
        elements.textArea.sendKeys(newPost);
    }

    public void clickPublishNewPost(){
        elements.postBtn.click();
    }

    public boolean isNewPostCreated(){
        return elements.post.isDisplayed();
    }
}
