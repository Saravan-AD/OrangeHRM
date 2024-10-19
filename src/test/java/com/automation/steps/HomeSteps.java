package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage=new HomePage();
    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }
    @When("user click on the user button")
    public void user_click_on_the_user_button() {
        homePage.dropDown();
    }
    @When("user choose the logout option")
    public void user_choose_the_logout_option() {
        homePage.userLogout();
    }

    @When("user click on admin link")
    public void userClickOnAdminLink() {
        homePage.adminClick();
    }

    @When("user click on recruitment link")
    public void userClickOnRecruitmentLink() {
        homePage.recruitClick();
    }

}
