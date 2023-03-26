package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

public class P01_register {
 P01_registerPO registerPO=new P01_registerPO();
    public void clickRegisterlink()
    {
        Hooks.driver.findElement(registerPO.registerButton).click();
    }
 public void sendFirstName(String fName){
        Hooks.driver.findElement(registerPO.firstNameField).sendKeys(fName);
 }
 public void sendLastName(String lName){
     Hooks.driver.findElement(registerPO.lastNameField).sendKeys(lName);
 }
 public void selectGender(String gender){
     if(gender.equalsIgnoreCase("male"))
         Hooks.driver.findElement(registerPO.genderMale).click();
     else if (gender.equalsIgnoreCase("female"))
         Hooks.driver.findElement(registerPO.genderFemale).click();
 }
 public void sendEmail(String email){
Hooks.driver.findElement(registerPO.emailTextField).sendKeys(email);
 }
 public void selectDay(String day){
     Select dayList=new Select(Hooks.driver.findElement(registerPO.dayField));
     dayList.selectByVisibleText(day);

 }
 public void selectMonth(String month){
     Select monthList = new Select(Hooks.driver.findElement(registerPO.monthField));
     monthList.selectByVisibleText(month);
 }
 public void selectYear(String year){
     Select yearList = new Select(Hooks.driver.findElement(registerPO.yearField));
     yearList.selectByVisibleText(year);
 }
    public void sendCompanyName(String companyName){
       Hooks.driver.findElement(registerPO.companyNameTextField).sendKeys(companyName);
    }
    public void sendPassword(String password){

        Hooks.driver.findElement(registerPO.passwordTextField).sendKeys(password);
    }
    public void sendConfirmationPassword(String confirmPassword){
       Hooks.driver.findElement(registerPO.confirmationPAsswordTextField).sendKeys(confirmPassword);
    }
    public void pressSubmitRegistration(){

        Hooks.driver.findElement(registerPO.registerSubmittionButton).click();
    }
    public String getRegistrationCompletedText() throws InterruptedException {

        return Hooks.driver.findElement(registerPO.regestrationCompletedTextPlace).getText();
    }
    public String getTheColorOfTheMessage(){
        String stringForColor=Hooks.driver.findElement(registerPO.regestrationCompletedTextPlace).getCssValue("Color");
        String color = Color.fromString(stringForColor).asHex();
        return color;
    }
}
