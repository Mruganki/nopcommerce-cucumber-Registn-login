package com.nopcommerce.demo.stepdefs;

import com.nopcommerce.demo.page.RegistrationPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.Random;

public class RegistrationstepsDefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }



    @When("^I navigate to RegisterLink$")
    public void iNavigateToRegisterLink() throws InterruptedException {
        new RegistrationPage().navigateToRegistrationLink();
    }



    @And("^I select Gender 'Male'$")
    public void iSelectGenderMale() throws InterruptedException {
        new RegistrationPage().selectGender();
    }

    @And("^I select FirstName \"([^\"]*)\"$")
    public void iSelectFirstName(String firstname)  {
        new RegistrationPage().enterFirstName(firstname);

    }

    @And("^I select LastName \"([^\"]*)\"$")
    public void iSelectLastName(String lastname)  {
        new RegistrationPage().enterlastName(lastname);

    }

    @And("^I select DOB \"([^\"]*)\"$")
    public void iSelectDOB(String dob)  {
        new RegistrationPage().selectDOB(dob);

    }

    @And("^I select MOB \"([^\"]*)\"$")
    public void iSelectMOB(String mob)  {
        new RegistrationPage().selectMOB(mob);

    }
    @And("^I select YOB \"([^\"]*)\"$")
    public void iSelectYOB(String yob)  {
        new RegistrationPage().selectYOB(yob);

    }

    @And("^I Enter Email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        Random r = new Random();
        email= "topper" + r.nextInt() + "@gmail.com";
        new RegistrationPage().enterEmail(email);
        System.out.println(email);

    }


    @And("^I Enter Password\"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new RegistrationPage().enterPassword(password);

    }

    @And("^I Enter ConfirmPassword \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmpassword)  {
        new RegistrationPage().enterConfirmPassWord(confirmpassword);

    }

    @And("^I click on 'Registration Button'$")
    public void iClickOnRegistrationButton() {
        new RegistrationPage().RegistrationButton();
    }

    @Then("^I should see text \"([^\"]*)\"$")
    public void iShouldSeeText(String textonrgstnpage)  {
        Assert.assertEquals("Your registration completed",new RegistrationPage().verifyUsersuccefullyregistred());

    }


    @And("^I click logout button$")
    public void iClickLogoutButton() throws InterruptedException {
        new RegistrationPage().clicklogout();
    }

    @Then("^I should see text \"([^\"]*)\"below firstname field$")
    public void iShouldSeeTextBelowFirstnameField(String errormsg)  {
        Assert.assertEquals("First name is required.",new RegistrationPage().verifyErrorMsg());

    }
}
