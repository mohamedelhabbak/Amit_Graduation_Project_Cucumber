package org.example.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;

public class P02_login {
P02_loginPO loginPO=new P02_loginPO();
    public String websiteLink="https://demo.nopcommerce.com/";
    public String unsuccessfulLoginMessage="Login was unsuccessful";
    public String   errorMessageColor="#e4434b";
    public void goToLoginPageByPressingLoginButton(){
    Hooks.driver.findElement(loginPO.loginButton).click();
}
public void enterEmail(String email){
    Hooks.driver.findElement(loginPO.emailTextField).sendKeys(email);
}
public void enterPassword(String password){
    Hooks.driver.findElement(loginPO.passwordFieldTextField).sendKeys(password);
}
public void submitLogin(){
    Hooks.driver.findElement(loginPO.loginSubmitButton).click();
}
public Boolean loginCompleted(){
    return Hooks.driver.findElement(loginPO.logoutElement).isDisplayed();
}
public String getURL(){
    return Hooks.driver.getCurrentUrl();
}
public Boolean myAccountElementIsDisplayed(){
    return Hooks.driver.findElement(loginPO.MyAccountLocator).isDisplayed();
}
public String errorMessageIsCorrect(){
    return Hooks.driver.findElement(loginPO.errorMessageLocator).getText();
}
public String getErrorMessageColor(){

    String stringForColor=Hooks.driver.findElement(loginPO.errorMessageLocator).getCssValue("Color");
    String color = Color.fromString(stringForColor).asHex();
    return color;
}
}
