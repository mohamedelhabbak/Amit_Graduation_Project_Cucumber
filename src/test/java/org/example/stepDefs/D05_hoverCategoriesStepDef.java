package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.example.pages.P03_homePagePO;
import org.testng.Assert;

public class D05_hoverCategoriesStepDef {
    static String text;
    P03_homePage homePage = new P03_homePage();

    @When("user hover on computers")
    public void hoverOnComputers() {
        homePage.hoverOnComputers();
//        homePage.hoverOnRandomCategory();

    }

    @And("user click on Desktops")
    public void clickOnDesktops() {
        text = homePage.getDesktopsText();
        homePage.clickOnDesktops();


    }

    @Then("user is at the same page of the sub-title")
    public void userIsAtTheSamePageOfTheSubTitle() {
        Assert.assertEquals(homePage.getTitle().toLowerCase().trim(), text.toLowerCase().trim());
    }
}
