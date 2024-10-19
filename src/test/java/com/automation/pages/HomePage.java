package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//a[@class='oxd-main-menu-item active']/span")
    WebElement dashboardOpt;

    @FindBy(xpath = "//a[@class='oxd-main-menu-item']/span[text()='Admin']")
    WebElement adminOpt;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logoutBtn;

    @FindBy(className = "oxd-userdropdown-tab")
    WebElement userDropdown;

    @FindBy(xpath = "//a[contains(@class,'oxd-main-menu-item')]/span[text()='Recruitment']")
    WebElement recruitmentOpt;

    public boolean isHomePageDisplayed(){
        System.out.println(dashboardOpt.getText());
        return dashboardOpt.getText().equals("Dashboard");
    }

    public void dropDown(){
        userDropdown.click();
    }

    public void userLogout(){
        logoutBtn.click();
    }

    public void adminClick(){
        adminOpt.click();
    }

    public void recruitClick(){
        System.out.println("here");
        recruitmentOpt.click();
    }
}
