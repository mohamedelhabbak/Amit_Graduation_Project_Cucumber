package org.example.pages;

import org.openqa.selenium.By;

public class P02_loginPO {
    public By loginButton=By.className("ico-login");
    public By emailTextField=By.id("Email");
    public By passwordFieldTextField=By.id("Password");
    public By loginSubmitButton=By.className("login-button");
    public By logoutElement=By.className("ico-logout");
    public By errorMessageLocator=By.className("message-error");
    public By MyAccountLocator=By.className("ico-account");
}
