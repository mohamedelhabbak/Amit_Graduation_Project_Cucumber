package org.example.pages;

import org.openqa.selenium.By;

public class P03_homePagePO {
    public By currency=By.id("customerCurrency");
    public By welcomeText=By.className("topic-block-title");
    public By products=By.className("product-item");
    public By searchBar=By.className("search-box-text");
    public By Sku=By.className("sku");
    public By productDetails=By.xpath("//h2[*]/a");
    public By elementToHover_Computers=By.xpath(".//a[text()='Computers ']");
    public By DesktopsLocator=By.xpath(".//a[text()='Desktops ']");
    public By desktopTitlePage=By.cssSelector("div[class=\"page-title\"] h1");
    public By mainCategoriesLocator=By.xpath("//ul[@class='top-menu notmobile']/li");
    public  By IphoneImageSlider=By.xpath("//div[@id=\"nivo-slider\"]/a/img");
    public By SamsungImageSlider=By.xpath("(//div[@id=\"nivo-slider\"]/a/img)[2]");
    public By imageBanner=By.id("nivo-slider");
    public By facebookIcon=By.className("facebook");
    public By twitterIcon=By.className("twitter");
    public By rssIcon=By.className("rss");
    public By youtubeIcon=By.className("youtube");
    public By HTCWishlistButton=By.cssSelector("div[data-productid=\"18\"] button[title=\"Add to wishlist\"]");
    public By succesMessageLocator=By.className("content");
    public By successMessageBackground=By.className("bar-notification");
    public By wishlistPageLocator=By.className("wishlist-label");
    public By wishlistQtyLocator=By.className("qty-input");


}
