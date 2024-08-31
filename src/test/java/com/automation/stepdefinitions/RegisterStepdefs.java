package com.automation.stepdefinitions;

import com.automation.pages.LoginPage;
import com.automation.pages.RegisterPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;

import java.util.Map;

import static com.automation.constants.Constants.driver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RegisterStepdefs {

    RegisterPage registerPage;
    @BeforeStep
    public void startup(Scenario scenario){

        registerPage = new RegisterPage( driver,scenario);
    }

    @Given("I am on the parabank website landing page")
    public void iAmOnTheParabankWebsiteLandingPage() {
        assertThat(driver.getCurrentUrl(),is("https://parabank.parasoft.com/parabank/index.htm"));
    }

    @When("I click the register link")
    public void iClickTheRegisterLink() {
        registerPage.clickRegisterLink();
    }
    @And("I enter name as {string}")
    public void i_enter_name_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterFirstName(string);
    }
    @When("I enter lastname as {string}")
    public void i_enter_lastname_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterLastName(string);
    }
    @When("I enter address as {string}")
    public void i_enter_address_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterAddress(string);
    }
    @When("I enter city as {string}")
    public void i_enter_city_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterCity(string);
    }
    @When("I enter state as {string}")
    public void i_enter_state_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterState(string);
    }
    @When("I enter zipcode as {string}")
    public void i_enter_zipcode_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterZipCode(string);
    }
    @When("I enter phone as {string}")
    public void i_enter_phone_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterPhone(string);
    }
    @When("I enter ssn as {string}")
    public void i_enter_ssn_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterSSN(string);
    }
    @When("I enter username as {string}")
    public void i_enter_username_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterUsername(string);
    }
    @When("I enter password as {string}")
    public void i_enter_password_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterPassword(string);
    }
    @When("I enter confirm as {string}")
    public void i_enter_confirm_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterConfirmPassword(string);
    }
    @Then("I click the register button")
    public void i_click_the_register_button() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.clickRegisterButton();
    }
    @Then("the system confirms the registration")
    public void the_system_confirms_the_registration() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.verifyCreationMessage("Your account was created successfully. You are now logged in.");

    }
}
