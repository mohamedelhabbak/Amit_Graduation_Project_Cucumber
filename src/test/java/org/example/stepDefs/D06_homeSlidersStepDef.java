package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    P03_homePage homePage = new P03_homePage();


    @When("user click on  {string}")
    public void userClickOn(String slider) {
        switch (slider) {
            case "iphone":
                homePage.clickIphoneImage();
                break;
            case "samsung":
                homePage.clickSamsungImage();
                break;
        }
    }

    @Then("user in on the right {string}")
    public void userInOnTheRight(String slider) {
        switch (slider) {
            case "iphone":
                Assert.assertEquals(homePage.getSliderURL(), homePage.IphonePageURL);
                break;
            case "samsung":
                Assert.assertEquals(homePage.getSliderURL(), homePage.SamsungPageURL);
                break;

        }
    }
}
