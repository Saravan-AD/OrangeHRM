package com.automation.steps;

import com.automation.pages.AdminPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AdminSteps {
    AdminPage adminPage=new AdminPage();

    @Then("verify user is on admin page")
    public void verifyUserIsOnAdminPage() {
        Assert.assertTrue(adminPage.isAdminPageDisplayed());
    }

    @When("user click on add button")
    public void userClickOnAddButton() {
        adminPage.clickAdd();
    }

    @Then("verify user is on add user page")
    public void verifyUserIsOnAddUserPage() {
       Assert.assertTrue(adminPage.iaAddUserPageDisplayed());
    }

    @When("user click on user role")
    public void userClickOnUserRole() {
        adminPage.clickUserRole();
    }

    @Then("select ESS opt")
    public void selectESSOpt() {
        adminPage.selectESS();
    }

    @When("user click on emp name box and enter the first letter of employee")
    public void userClickOnEmpNameBoxAndEnterTheFirstLetterOfEmployee() {
        adminPage.enterEmpNameFirstLetter();
    }

    @Then("select the first option")
    public void selectTheFirstOption() {
        adminPage.selectEmpName();
    }

    @When("user click on status")
    public void userClickOnStatus() {
        adminPage.clickStatus();
    }

    @Then("select Enabled")
    public void selectEnabled() {
        adminPage.selecetEnabled();
    }

    @When("user enter username")
    public void userEnterUsername() {
        adminPage.enterUsername();
    }

    @And("user enter password")
    public void userEnterPassword() {
        adminPage.enterPassowrd();
    }

    @And("user enter confirm password")
    public void userEnterConfirmPassword() {
        adminPage.enterConfirmPassword();
    }

    @And("user click save button")
    public void userClickSaveButton() {
        adminPage.clickSave();
    }

    @And("verify the user is displayed in the records")
    public void verifyNewUserIsDisplayedInTheRecords() {
        Assert.assertTrue(adminPage.verifyNewUserInRecord());
    }

    @And("verify success msg is displayed")
    public void verifySuccessMsgIsDisplayed() {
        Assert.assertTrue(adminPage.verifySuccessMsgIsDisplayed());
    }

    @When("user enters the username in the search box")
    public void userEntersTheUsernameInTheSearchBox() throws InterruptedException {
        adminPage.enterUsernameToSearch();
    }

    @And("clicks search")
    public void clicksSearch() {
        adminPage.clickSearch();
    }

    @When("user clicks the dlt button")
    public void userClicksTheDltButton() throws InterruptedException {
        Thread.sleep(5000);
        adminPage.userDlt();
    }

    @And("click on yes, delete")
    public void clickOnYesDelete() {
        adminPage.confirmDlt();
    }
}
