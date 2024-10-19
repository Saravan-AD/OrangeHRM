package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RecruitmentPage extends BasePage {

    @FindBy(xpath = "//a[@class='oxd-main-menu-item active']/span")
    WebElement recruitOpt;

    @FindBy(xpath = "//button[text()=' Add ']")
    WebElement addBtn;

    @FindBy(xpath = "//h6[text()='Add Candidate']")
    WebElement addCandidateText;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstNameBox;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastNameBox;

    @FindBy(xpath = "//label[normalize-space(text())='Email']/ancestor::div[contains(@class, 'oxd-input-group__label-wrapper')]/following-sibling::div[1]//input")
    WebElement emailBox;

    @FindBy(xpath = "//div[@class='oxd-file-button' and text()='Browse']")
    WebElement resumeUploadBtn;

    @FindBy(xpath = "//button[text()=' Save ']")
    WebElement saveBtn;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement nameSearch;

    @FindBy(xpath = "//div[@role='listbox']/div[1]/span")
    WebElement selectName;

    @FindBy(xpath = "//button[text()=' Search ']")
    WebElement searchBtn;

    @FindBy(xpath = "//div[@class='oxd-table-body']/div/div/div[3]/div")
    List<WebElement> userNamesInRec;

    public boolean isRecruitmentPageDisplayed(){
        return recruitOpt.getText().equals("Recruitment");
    }

    public void clickAdd(){
        addBtn.click();
    }

    public boolean isCandidatePageDisplayed(){
        return addCandidateText.isDisplayed();
    }

    public void enterFirstAndLastName(){
        firstNameBox.sendKeys("zed");
        lastNameBox.sendKeys("lk");
    }


    public void enterEmail(){
        emailBox.sendKeys("xyz@gmail.com");
    }

    public void uploadResume() throws InterruptedException {
        resumeUploadBtn.click();
        Thread.sleep(20000);
    }

    public void clickSave(){
        saveBtn.click();
    }

    public void enterNameSearch(){
        nameSearch.sendKeys("z");
        selectName.click();
    }

    public boolean verifyNewUserInRecord(){
        for(WebElement name:userNamesInRec){
            if (name.getText().equals("zed lk")) {
                System.out.println(333+name.getText());
                return true;
            }
        }
        return false;
    }

//    public boolean verifySuccessMsgIsDisplayed(){
//        return successMsg.getText().equals("Success");
//    }
}
