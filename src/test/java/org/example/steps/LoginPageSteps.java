package org.example.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.elements.LoginPageElements;
import org.example.pages.GlobalCommonActions;
import org.example.pages.LoginPageActions;

import static org.junit.Assert.fail;

public class LoginPageSteps {

    LoginPageActions actions;
    GlobalCommonActions commonActions;

    public LoginPageSteps(LoginPageActions actions, GlobalCommonActions commonActions) {
        this.actions = actions;
        this.commonActions = commonActions;
    }


    @Given("I am on the login page")
    public void i_am_on_the_login_page() throws InterruptedException {
        commonActions.goToUrl("https://demo.opensource-socialnetwork.org/login");
        commonActions.resizeTheWindow();
        actions.clearLoginForm();
        Thread.sleep(2000);
    }

    @When("I enter username and password")
    public void iEnterUsernameAndPassword(DataTable dataTable) throws InterruptedException {
        actions.enterUserName(dataTable.cell(1, 0));
        actions.enterPassword(dataTable.cell(1, 1));
        Thread.sleep(2000);
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        actions.clickOnLoginBtn();
    }

    @Then("I validate to login")
    public void iValidateToLogin() {
        String expUrl = "https://demo.opensource-socialnetwork.org/home";
        String actUrl = commonActions.getCurrentPageUrl();
        if (!actUrl.equals(expUrl)){
            fail("Unable to login");
        }
    }
}
