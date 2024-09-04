package com.automation.stepdefinitions;

import com.automation.pages.AccountOverviewPage;
import com.automation.pages.LoginPage;
import com.automation.pages.RegisterPage;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.automation.constants.Constants.driver;




public class AccountOverviewStepdefs {

    AccountOverviewPage accountOverviewPage;
    LoginPage loginPage;

    @BeforeStep
    public void startup(Scenario scenario) {
        accountOverviewPage = new AccountOverviewPage(driver, scenario);
        loginPage = new LoginPage(driver, scenario);
    }

    @Given("user is logged in to the Parabank website")
    public void userIsLoggedIn() {
        driver.get("https://parabank.parasoft.com");
        loginPage.enterUsername("mavusana");
        loginPage.enterPassword("kamo");
        loginPage.clickLogin();
        loginPage.validateHomePage();
    }

    @When("user navigates to the {string} page")
    public void userNavigatesToPage(String page) {
        if ("Account Overview".equals(page)) {

            accountOverviewPage = new AccountOverviewPage(driver, null);
        }
    }

    @Then("user should see a list of all accounts")
    public void userShouldSeeListOfAccounts() {
        accountOverviewPage.validateAccountListIsDisplayed();
    }

    @Then("each account should display the current balance")
    public void eachAccountShouldDisplayCurrentBalance() {
        accountOverviewPage.validateAllBalancesDisplayed();
    }

    @Then("user should see the text {string}")
    public void userShouldSeeText(String expectedText) {
        accountOverviewPage.validateFooterText(expectedText);
    }
}
