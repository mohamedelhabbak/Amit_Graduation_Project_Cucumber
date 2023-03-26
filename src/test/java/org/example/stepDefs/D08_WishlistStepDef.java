package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef {
    P03_homePage homePage=new P03_homePage();
    @When("user click the wishlist button")
    public void userClickWishlistButton(){
        homePage.clickWishlistButton();
    }

    @Then("user can see a green success message displayed")
    public void userCanSeeAGreenSuccessMessageDisplayed() {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(homePage.getWishlistSuccesMessgae().toLowerCase()
                .contains(homePage.WishlistSuccessMessage.toLowerCase()));
        softAssert.assertEquals(homePage.getWishlistSuccessMessageColor(),homePage.WishlistSuccessMessageGreenColor);
        softAssert.assertAll();
    }

    @And("success message disappear")
    public void successMessageDisapear() {
        Assert.assertTrue(homePage.waitSuccessMessageDisappear());
    }

    @And("user can go to wishlistPage")
    public void userCanGoToWishlistPage() {
        homePage.goToWishlistPage();
    }

    @Then("user can find the Qty greater than Zero")
    public void userCanFindTheQtyGreaterThanZero() {
       Assert.assertTrue((homePage.getNumberOfProductsInQty())>0);

    }
}
