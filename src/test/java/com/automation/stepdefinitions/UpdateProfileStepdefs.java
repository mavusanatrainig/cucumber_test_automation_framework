package com.automation.stepdefinitions;

import com.automation.pages.UpdateProfilePage;
import com.automation.pages.LoginPage;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.automation.constants.Constants.driver;

public class UpdateProfileStepdefs {

    UpdateProfilePage updateProfilePage;
    LoginPage loginPage;

    @BeforeStep
    public void setup(Scenario scenario) {
        updateProfilePage = new UpdateProfilePage(driver, scenario);
        loginPage = new LoginPage(driver, scenario);
    }

    @Given("the user is logged in to the Parabank websit")
    public void userIsLoggedInToParabank() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        loginPage.enterUsername("mavusana");
        loginPage.enterPassword("kamo");
        loginPage.clickLogin();
        loginPage.validateHomePage();
    }

    @When("the user clicks on the Update Contact Info tab")
    public void userClicksUpdateContactInfo() {
        updateProfilePage.clickUpdateContactInfoTab();
    }




    @And("the user updates their first name to {string}")
    public void userUpdatesFirstName(String firstName) {
        updateProfilePage.enterFirstName(firstName);
    }

    @And("the user updates their last name to {string}")
    public void userUpdatesLastName(String lastName) {
        updateProfilePage.enterLastName(lastName);
    }

    @And("the user updates their address to {string}")
    public void userUpdatesAddress(String address) {
        updateProfilePage.enterAddress(address);
    }

    @And("the user updates their city to {string}")
    public void userUpdatesCity(String city) {
        updateProfilePage.enterCity(city);
    }

    @And("the user updates their state to {string}")
    public void userUpdatesState(String state) {
        updateProfilePage.enterState(state);
    }

    @And("the user updates their zip code to {string}")
    public void userUpdatesZipCode(String zipCode) {
        updateProfilePage.enterZipCode(zipCode);
    }

    @And("the user updates their phone number to {string}")
    public void userUpdatesPhone(String phone) {
        updateProfilePage.enterPhoneNumber(phone);
    }

    @Then("the user clicks the Update Profile button")
    public void userClicksUpdateProfileButton() {
        updateProfilePage.clickUpdateProfileButton();
    }
}
