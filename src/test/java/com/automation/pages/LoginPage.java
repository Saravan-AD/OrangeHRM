package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(className = "orangehrm-login-button")
    WebElement loginButton;

    @FindBy(xpath = "//input[@name='username']")
    WebElement usernameInput;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordInput;

    public void openWebsite(){
        driver.get(ConfigReader.getConfigValue("application.url"));
    }
    public boolean isLoginPageDisplayed(){
        return loginButton.isDisplayed();
    }

    public void doLogin(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
