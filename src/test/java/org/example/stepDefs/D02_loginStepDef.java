package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login=new P02_login();

    @Given("user go to login page")
    public void goToLoginPage(){
    login.goToLoginPageByPressingLoginButton();
    }


    @When("user login with {string} {string} and {string}")
    public void userLoginWithAnd(String type, String email, String password) {
    login.enterEmail(email);
    login.enterPassword(password);

    }

    @When("user press on login button")
    public void userPressOnLoginButton() {
        login.submitLogin();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(login.loginCompleted());
        softAssert.assertTrue(login.myAccountElementIsDisplayed());
        softAssert.assertEquals(login.getURL(),login.websiteLink);
        softAssert.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(login.errorMessageIsCorrect().contains(login.unsuccessfulLoginMessage));
        softAssert.assertEquals(login.getErrorMessageColor(),login.errorMessageColor);
        softAssert.assertAll();
    }
}
