package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user enter {string}")
    public void enterSearch(String search) {
        homePage.enterASearch(search);

    }

    @Then("user is on the Correct page")
    public void userIsOnTheCorrectPage() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(homePage.getURL().contains("https://demo.nopcommerce.com/search?q="));
    }

    @And("user can find relevant results{string}")
    public void userCanFindRelevantResults(String search) {
        SoftAssert softAssert = new SoftAssert();
        int numberOfProducts = homePage.getNumberOfProducts();
        for (int i = 0; i < numberOfProducts; i++) {
            String currentProduct = homePage.getTextINAllProducts().get(i).toLowerCase();
            softAssert.assertTrue(currentProduct.contains(search.toLowerCase()));
        }
        softAssert.assertAll();
    }

    @Then("user can find relevant results with Sku{string}")
    public void userCanFindRelevantResultsWithSku(String sku) {

        Assert.assertTrue(homePage.getSku().toLowerCase().contains(sku.toLowerCase()));

    }


    @When("user go to the product details")
    public void userGoToTheProductDetails() {
        homePage.goToProductDetails();
    }
}
