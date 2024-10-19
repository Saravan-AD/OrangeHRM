package com.automation.steps;

import com.automation.pages.RecruitmentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RecruitmentSteps {

    RecruitmentPage recruitmentPage=new RecruitmentPage();
    @Then("verify user is on recruitment page")
    public void verifyUserIsOnRecruitmentPage() {
      Assert.assertTrue(recruitmentPage.isRecruitmentPageDisplayed());
    }

    @When("user click on add button in recruitment page")
    public void userClickOnAddButtonInRecruitmentPage() {
        recruitmentPage.clickAdd();
    }

    @Then("verify user is on add candidate page for recruitment")
    public void verifyUserIsOnAddCandidatePageForRecruitment() {
        Assert.assertTrue(recruitmentPage.isCandidatePageDisplayed());
    }

    @And("user enter first and last name")
    public void userEnterFirstName() {
        recruitmentPage.enterFirstAndLastName();
    }

    @And("user enter email")
    public void userEnterEmail() {
        recruitmentPage.enterEmail();
    }

    @And("user click upload resume button")
    public void userClickUploadResumeButton() throws InterruptedException {
        recruitmentPage.uploadResume();
    }

    @And("user click on save button")
    public void userClickOnSaveButton() {
        recruitmentPage.clickSave();
    }

    @When("user enter name on search candidate name")
    public void userEnterNameOnSearchCandidateName() {
        recruitmentPage.enterNameSearch();
    }

    @Then("verify the candidate is displayed in the records")
    public void verifyTheCandidateIsDisplayedInTheRecords() {
        Assert.assertTrue(recruitmentPage.verifyNewUserInRecord());
    }
}
