package org.example.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.DashboardHomePageActions;
import org.example.pages.GlobalCommonActions;
import org.example.pages.LoginPageActions;

import static org.junit.Assert.fail;

public class DashboardHomePageSteps {

    DashboardHomePageActions actions;
    GlobalCommonActions commonActions;
    LoginPageActions loginActions;

    public DashboardHomePageSteps(DashboardHomePageActions actions,GlobalCommonActions commonActions, LoginPageActions loginActions){
        this.actions = actions;
        this.commonActions = commonActions;
        this.loginActions = loginActions;
    }

    @When("I login into the application")
    public void iLoginIntoTheApplication(DataTable table) {
        loginActions.enterUserName(table.cell(1,0));
        loginActions.enterPassword(table.cell(1,1));
        loginActions.clickOnLoginBtn();
    }

    @When("I click on messages link")
    public void i_click_on_messages_link() {
        actions.clickOnMessagesLink();
    }

    @Then("I navigate to the messages page")
    public void i_navigate_to_the_messages_pages() {
        String expUrl = "https://demo.opensource-socialnetwork.org/messages/all";
        String actUrl = commonActions.getCurrentPageUrl();

        if (!actUrl.equals(expUrl)){
            fail("Unable to navigate to the messages page");
        }
    }

    @Then("I create a new post")
    public void iCreateANewPost() throws InterruptedException {
        actions.enterNewPost("This post is created from automated Test");
        actions.clickPublishNewPost();
        Thread.sleep(3000);
    }

    @Then("I send a new message")
    public void iSendANewMessage() throws InterruptedException {
        actions.enterNewMessage("Hi, from automated Test");
        actions.sendMessage();
        Thread.sleep(3000);
    }

    @Then("I validate the Post is created")
    public void iValidateThePostIsCreated() {
        if (!actions.isNewPostCreated()){
            fail("Error while creating a new post");
        }
    }
}
