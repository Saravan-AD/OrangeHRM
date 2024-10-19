package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;
import java.util.UUID;


public class AdminPage extends BasePage {
    String empName;
    String password;
    String username;
    @FindBy(xpath = "//a[@class='oxd-main-menu-item active']/span")
    WebElement adminOpt;

    @FindBy(xpath = "//button[text()=' Add ']")
    WebElement addBtn;

    @FindBy(xpath = "//h6[text()='Add User']")
    WebElement addUserText;

    @FindBy(xpath = "//label[normalize-space(text())='User Role']/ancestor::div[contains(@class, 'oxd-input-group__label-wrapper')]/following-sibling::div[1]")
    WebElement userRoleBtn;

    @FindBy(xpath = "//label[normalize-space(text())='User Role']/ancestor::div[contains(@class, 'oxd-input-group__label-wrapper')]/following-sibling::div[1]//div[@role='option']/span[text()='ESS']")
    WebElement selectESS;

    @FindBy(xpath = "//label[normalize-space(text())='Employee Name']/ancestor::div[contains(@class, 'oxd-input-group__label-wrapper')]/following-sibling::div[1]//input")
    WebElement empNameBox;

    @FindBy(xpath = "//label[normalize-space(text())='Employee Name']/ancestor::div[contains(@class, 'oxd-input-group__label-wrapper')]/following-sibling::div[1]//div[@role='option'][1]/span")
    WebElement empNameSelect;

    @FindBy(xpath = "//label[normalize-space(text())='Status']/ancestor::div[contains(@class, 'oxd-input-group__label-wrapper')]/following-sibling::div[1]")
    WebElement statusBtn;

    @FindBy(xpath = "//label[normalize-space(text())='Status']/ancestor::div[contains(@class, 'oxd-input-group__label-wrapper')]/following-sibling::div[1]//div[@role='option']/span[text()='Enabled']")
    WebElement selectEnabled;

    @FindBy(xpath = "//label[normalize-space(text())='Username']/ancestor::div[contains(@class, 'oxd-input-group__label-wrapper')]/following-sibling::div//input")
    WebElement usernameBox;

    @FindBy(xpath = "//label[normalize-space(text())='Password']/ancestor::div[contains(@class, 'oxd-input-group__label-wrapper')]/following-sibling::div[1]//input")
    WebElement passwordBox;

    @FindBy(xpath = "//label[normalize-space(text())='Confirm Password']/ancestor::div[contains(@class, 'oxd-input-group__label-wrapper')]/following-sibling::div[1]//input")
    WebElement confirmPasswordBox;

    @FindBy(xpath = "//button[text()=' Save ']")
    WebElement saveBtn;

    @FindBy(xpath = "//div[@class='oxd-table-body']/div/div/div[2]/div")
    List<WebElement> userNamesInRec;

    @FindBy(xpath = "//div[@id='oxd-toaster_1']//p[1]")
    WebElement successMsg;

    @FindBy(xpath = "//div[@class='oxd-table-filter']//label[normalize-space(text())='Username']/ancestor::div[contains(@class, 'oxd-input-group__label-wrapper')]/following-sibling::div[1]/input[contains(@class,oxd-input)]")
    WebElement usernameSearchBox;

    @FindBy(xpath = "//div[@class='oxd-table-filter']//button[text()=' Search ']")
    WebElement searchBtn;

    @FindBy(xpath = "//div[@class='oxd-table-body']/div/div/div[6]/div/button[1]")
    WebElement userDelete;

    @FindBy(xpath = "//button[text()=' Yes, Delete ']")
    WebElement confirmDeletionBtn;

    public boolean isAdminPageDisplayed(){
        return adminOpt.getText().equals("Admin");
    }

    public boolean iaAddUserPageDisplayed(){
        return addUserText.isDisplayed();
    }

    public void clickAdd(){
        addBtn.click();
    }

    public void clickUserRole(){
        userRoleBtn.click();
    }

    public void selectESS(){
        selectESS.click();
    }

    public void enterEmpNameFirstLetter(){
        empNameBox.sendKeys("p");
    }

    public void selectEmpName(){
        System.out.println("1111"+empNameSelect.getText());
        empName=empNameSelect.getText();
        empNameSelect.click();
    }

    public void clickStatus(){
        statusBtn.click();
    }

    public void selecetEnabled(){
        selectEnabled.click();
    }

    public void enterUsername(){
        Random random = new Random();
        username = empName + random.nextInt(1000);
        usernameBox.sendKeys(username);
    }

    public void enterPassowrd(){
        password =  UUID.randomUUID().toString().substring(0, 9);
        passwordBox.sendKeys(password);
    }

    public void enterConfirmPassword(){
        confirmPasswordBox.sendKeys(password);
    }

    public void clickSave(){
        saveBtn.click();
    }

    public boolean verifyNewUserInRecord(){
        for(WebElement name:userNamesInRec){
            if (name.getText().equals(username)) {
                System.out.println(333+name.getText());
                return true;
            }
        }
        return false;
    }

    public boolean verifySuccessMsgIsDisplayed(){
        return successMsg.getText().equals("Success");
    }

    public void enterUsernameToSearch(){
        System.out.println(username+"222222222222222");
        if (usernameBox.isEnabled()) {
            System.out.println("box enabled");
            usernameSearchBox.sendKeys(username);
        }
        String enteredText = usernameSearchBox.getAttribute("value");
        System.out.println("user name search "+enteredText);
    }

    public void clickSearch(){
        System.out.println("click");
        searchBtn.click();
        System.out.println("click2");
    }

    public void userDlt(){
        userDelete.click();
    }

    public void confirmDlt(){
        confirmDeletionBtn.click();
    }
}
