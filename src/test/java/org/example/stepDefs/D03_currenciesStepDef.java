package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D03_currenciesStepDef {
P03_homePage homePage=new P03_homePage();
    @When("user can select euro currency")
    public void selectCurrency(){
    homePage.selectEuroCurrency();
    }

    @Given("user is at Home Page")
    public void userIsAtHomePage() {
        Assert.assertEquals(homePage.getWelcomePageText(),"Welcome to our store");
    }

    @Then("user can find Euro Symbol at All The products")
    public void userCanFindEuroSymbolAtAllTheProducts() {
        for(int i=0 ; i<homePage.getAllProducts().size();i++){
            Assert.assertTrue(homePage.getAllProducts().get(i).contains("€"));// it is mentionned hard assertion not soft
        }

    }
}
