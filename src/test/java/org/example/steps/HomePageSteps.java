package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.GlobalCommonActions;
import org.example.pages.HomePageActions;
import static org.junit.Assert.fail;

public class HomePageSteps {

    HomePageActions pageActions;
    GlobalCommonActions commonActions;

    public HomePageSteps(HomePageActions pageActions,  GlobalCommonActions commonActions){
        this.pageActions = pageActions;
        this.commonActions = commonActions;
    }

    @Given("I am on the Home Page")
    public void i_am_on_the_home_page() {
        commonActions.goToUrl("https://demo.opensource-socialnetwork.org/");
    }
    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        pageActions.clickOnLoginBtn();
    }
    @Then("I navigate to the login form page")
    public void i_navigate_to_the_login_form_page() {
        String expUrl = "https://demo.opensource-socialnetwork.org/login";
        String actUrl = commonActions.getCurrentPageUrl();
        if (!actUrl.equals(expUrl)){
            fail("Page does not navigate to expected Page");
        }
    }
}
