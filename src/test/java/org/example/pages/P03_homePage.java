package org.example.pages;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import io.cucumber.java.eo.Se;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class P03_homePage {
    P03_homePagePO homePagePO = new P03_homePagePO();
    static int randomNumber;
    static WebElement theRandomCategory;
    static String clicketText;
    public String IphonePageURL="https://demo.nopcommerce.com/iphone-6";
    public String SamsungPageURL="https://demo.nopcommerce.com/nokia-lumia-1020";
    public String facebookLink="https://www.facebook.com/nopCommerce";
    public String WishlistSuccessMessage="The product has been added to your ";
    public String WishlistSuccessMessageGreenColor="#4bb07a";

    public void selectEuroCurrency() {
        Select select = new Select(Hooks.driver.findElement(homePagePO.currency));
        select.selectByVisibleText("Euro");
    }

    public String getWelcomePageText() {
        return Hooks.driver.findElement(homePagePO.welcomeText).getText();
    }

    public List<String> getAllProducts() {
        List<WebElement> products = Hooks.driver.findElements(homePagePO.products);
        List<String> collector = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            collector.add(products.get(i).getText());
        }
        return collector;

    }

    public void enterASearch(String search) {
        Hooks.driver.findElement(homePagePO.searchBar).sendKeys(search);
        Hooks.driver.findElement(homePagePO.searchBar).sendKeys(Keys.ENTER);
    }

    public String getURL() {
        return Hooks.driver.getCurrentUrl();
    }

    public int getNumberOfProducts() {
        List<WebElement> products = Hooks.driver.findElements(homePagePO.products);
        return products.size();
    }

    public List<String> getTextINAllProducts() {
        List<WebElement> products = Hooks.driver.findElements(homePagePO.products);
        List<String> productsText = new ArrayList<>();
        for (int i = 0; i < getNumberOfProducts(); i++) {
            productsText.add(products.get(i).getText());
        }
        return productsText;
    }

    public void goToProductDetails() {
        Hooks.driver.findElement(homePagePO.productDetails).click();
    }

    public String getSku() {
        return Hooks.driver.findElement(homePagePO.Sku).getText();
    }

    public void hoverOnComputers() {
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(Hooks.driver.findElement(homePagePO.elementToHover_Computers)).perform();
    }

    public void clickOnDesktops() {
        Hooks.driver.findElement(homePagePO.DesktopsLocator).click();
    }

    public String getDesktopsText() {


        return Hooks.driver.findElement(homePagePO.DesktopsLocator).getText();

    }

    public String getDesktopTitleText() {


        return Hooks.driver.findElement(homePagePO.desktopTitlePage).getText();
    }

    public String getTitle() {
        return Hooks.driver.findElement(homePagePO.desktopTitlePage).getText();
    }

    public int generateRandomNumber() {
        Random random = new Random();
        int low = 0;
        int high = 6;
        randomNumber = random.nextInt(high - low) + low;
        return randomNumber;
    }

    public WebElement getRandomMainCategory() {
        generateRandomNumber();
        List<WebElement> categories = Hooks.driver.findElements(homePagePO.mainCategoriesLocator);
        theRandomCategory = categories.get(randomNumber);
        return theRandomCategory;
    }

    public void hoverOnRandomCategory() {
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(getRandomMainCategory()).perform();
    }
    public void clickIphoneImage(){
        String link= Hooks.driver.findElement(homePagePO.IphoneImageSlider).getAttribute("src");
        while (!(link.contains("01"))){
            link= Hooks.driver.findElement(homePagePO.IphoneImageSlider).getAttribute("src");
        }
        if(link.contains("01")){
            Hooks.driver.findElement(homePagePO.imageBanner).click();
        }

    }
    public void clickSamsungImage(){
//        WebDriverWait wait = new WebDriverWait(Hooks.driver,30);//visibilti of this element is hidden so this method cannot be used
//        wait.until(ExpectedConditions.visibilityOfElementLocated((homePagePO.SamsungImageSlider)));
        String link= Hooks.driver.findElement(homePagePO.SamsungImageSlider).getAttribute("src");
        while (!(link.contains("02"))){
            link= Hooks.driver.findElement(homePagePO.SamsungImageSlider).getAttribute("src");
        }
        if(link.contains("02")){
            Hooks.driver.findElement(homePagePO.imageBanner).click();
        }


    }
    public String getSliderURL(){
        return Hooks.driver.getCurrentUrl();
    }
    public void clickFacebookIcon(){
        Hooks.driver.findElement(homePagePO.facebookIcon).click();
    }
    public void clickTwitterIcon(){
        Hooks.driver.findElement(homePagePO.twitterIcon).click();
    }
    public void clickRssIcon(){
        Hooks.driver.findElement(homePagePO.rssIcon).click();
    }
    public void clickYoutubeIcon(){
        Hooks.driver.findElement(homePagePO.youtubeIcon).click();
    }
    public String getCurrentURL(){
//        WebDriverWait wait =new WebDriverWait(Hooks.driver,10);
//        wait.until(ExpectedConditions.visibilityOfAllElements());
        return Hooks.driver.getCurrentUrl();
    }
    public String goToTheNewWindow(){
         String currentHandle = Hooks.driver.getWindowHandle();
        Set<String> handles = Hooks.driver.getWindowHandles();
        String handle = null;
        for ( String actual : handles) {
            if (!actual.equalsIgnoreCase(currentHandle)) {
//Switch to the opened tab
                Hooks.driver.switchTo().window(actual);
                handle=actual;
            }

        }
        return handle;
    }
    public void closeTheNewTab(String handle){


        Hooks.driver.switchTo().window(handle);
        Hooks.driver.close();

    }
    public void clickWishlistButton(){
        Hooks.driver.findElement(homePagePO.HTCWishlistButton).click();
    }
    public String getWishlistSuccesMessgae(){
        WebDriverWait wait =new WebDriverWait(Hooks.driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePagePO.succesMessageLocator));
        return Hooks.driver.findElement(homePagePO.succesMessageLocator).getText();
    }
    public String getWishlistSuccessMessageColor(){
        WebElement t=Hooks.driver.findElement(homePagePO.successMessageBackground);
        String s = t.getCssValue("background-color");
        return  Color.fromString(s).asHex();

    }
    public Boolean waitSuccessMessageDisappear(){
        WebDriverWait wait =new WebDriverWait(Hooks.driver,30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(homePagePO.succesMessageLocator));
        return true;
    }
    public void goToWishlistPage(){
        Hooks.driver.findElement(homePagePO.wishlistPageLocator).click();
    }
    public int getNumberOfProductsInQty(){

        String number=  Hooks.driver.findElement(homePagePO.wishlistQtyLocator).getAttribute("value");
        return   Integer.parseInt(number);
    }

}
