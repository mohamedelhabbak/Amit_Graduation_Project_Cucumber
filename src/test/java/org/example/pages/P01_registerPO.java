package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_registerPO {
    public By registerPageWelcomeText=By.className("page-title");
    public By genderMale=By.id("gender-male");
    public By genderFemale=By.id("gender-female");
    public  By firstNameField=By.id("FirstName");
    public By lastNameField= By.id("LastName");
    public By dayField=By.name("DateOfBirthDay");
    public By monthField=By.name("DateOfBirthMonth");
    public By yearField = By.name("DateOfBirthYear");
    public WebElement genderOptions;
    public By emailTextField=By.id("Email");
    public By companyNameTextField=By.id("Company");
    public By newsLetterCheckBox=By.cssSelector("input[type=\"checkbox\"]");
    public By passwordTextField=By.id("Password");
    public By confirmationPAsswordTextField=By.name("ConfirmPassword");
    public By registerSubmittionButton=By.id("register-button");
    public By regestrationCompletedTextPlace=By.className("result");////div[@class=\"page-body\"]/div[@class=\"result\"]"
    public By personalDetailTitle= By.xpath(".//strong[text()=\"Your Personal Details\"]");
    public By companyNameTextLocator=By.xpath(".//label[text()=\"Company name:\"]");
    public By companyDetailsTextLocator=By.xpath(".//strong[text()='Company Details']");
    public By registerButtonText =By.id("register-button");
    public By usernameRedAstrek=By.xpath("(//span[@class=\"required\"])[1]");
    public By registerButton=By.className("ico-register");
}
