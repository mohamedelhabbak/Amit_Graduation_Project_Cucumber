package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.IHookable;

import java.util.Set;

public class D07_followUsStepDef {
    P03_homePage homePage=new P03_homePage();
    public String handle;
    @When("user click on {string} icon")
    public void userClickOnIcon(String window) {
        switch (window){
            case "Facebook":
                homePage.clickFacebookIcon();
                break;
            case "Twitter":
                homePage.clickTwitterIcon();
                break;
            case"Rss":
                homePage.clickRssIcon();
                break;
            case "Youtube":
                homePage.clickYoutubeIcon();
                break;
        }
    }

    @Then("user is in the Facebook Page{string}")
    public void userIsInTheFacebookPage(String link) {
        Assert.assertEquals(homePage.getCurrentURL(),link);
    }

    @And("user switch to the new Window")
    public void userSwitchToTheNewWindow() {
      handle= homePage.goToTheNewWindow();
    }

    @And("user close the new window")
    public void userCloseTheNewWindow() {

            homePage.closeTheNewTab(handle);
    }


}

