package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register register = new P01_register();

    @Given("user go to register page")
    public void goRegisterPage() {
        register.clickRegisterlink();

    }

    @When("user enter all valid credentials{string}")
    public void enterValidCredentials(String gender) {
        register.selectGender(gender);


//        register.sendCompanyName("Alexadria Uni");

    }

    @When("user enter first and last name {string} and {string}")
    public void userEnterFirstAndLastNameAnd(String firstName, String lastName) {
        register.sendFirstName(firstName);
        register.sendLastName(lastName);
    }

    @And("user enter date of birth{string}{string}{string}")
    public void userEnterDateOfBirth(String day, String month, String year) {
        register.selectDay(day);
        register.selectYear(year);
        register.selectMonth(month);
    }



    @And("user enter email {string} field")
    public void userEnterEmailField(String email) {

        register.sendEmail(email);
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String password, String confirmPassword) {
        register.sendPassword(password);
        register.sendConfirmationPassword(confirmPassword);
    }
    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        register.pressSubmitRegistration();
    }
    @Then("success message is displayed")
    public void testRegistrationSuccesfully() throws InterruptedException {
        SoftAssert softAssert =new SoftAssert();
        softAssert.assertEquals(register.getRegistrationCompletedText(), "Your registration completed");
        softAssert.assertEquals(register.getTheColorOfTheMessage(),"#4cb17c");
        softAssert.assertAll();
    }


}
