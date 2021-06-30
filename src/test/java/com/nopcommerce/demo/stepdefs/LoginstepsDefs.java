package com.nopcommerce.demo.stepdefs;

import com.nopcommerce.demo.page.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginstepsDefs {
    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new LoginPage().navigateT0LoginLinkSucessfully();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
       Assert.assertEquals("Welcome, Please Sign In!",new LoginPage().getWelcomeText());
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)throws InterruptedException {
        Thread.sleep(2000);
        new LoginPage().enterEmailAddress(email);

    }

    @And("^I enter passwork \"([^\"]*)\"$")
    public void iEnterPasswork(String password) throws InterruptedException {
        Thread.sleep(2000);
        new LoginPage().enterPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickLoginButton();
    }

    @Then("^I should login sucessfully$")
    public void iShouldLoginSucessfully() {
        Assert.assertEquals("Welcome to our store",new LoginPage().getTextOnHomePage());
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errorMessage)  {
        Assert.assertEquals(errorMessage,new LoginPage().getErrorMsgText());

    }
}
