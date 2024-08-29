package com.automation.stepdefinitions;
import com.automation.pages.LoginPage;

import com.automation.pages.RegisterPage;
import com.github.javafaker.Faker;
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
    Faker faker;

    @BeforeStep
    public void startup(Scenario scenario){
        registerPage = new RegisterPage( driver,scenario);
        faker =  new Faker();
    }
    @Given("I am on the parabank website landing page")
    public void iAmOnTheParabankWebsiteLandingPage() {
        assertThat(driver.getCurrentUrl(),is("https://parabank.parasoft.com/parabank/index.htm"));
    }
    @When("I click the register link")
    public void iClickTheRegisterLink() {
        registerPage.clickRegisterLink();
    }
    @And("I enter name")
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
    @When("I enter zipcode")
    public void i_enter_zipcode() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterZipCode(faker.address().zipCode());
    }
    @When("I enter phone")
    public void i_enter_phone() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterPhone(faker.phoneNumber().phoneNumber());
    }
    @When("I enter ssn")
    public void i_enter_ssn() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterSSN(faker.idNumber().ssnValid());
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

    @And("I enter name as {string}")
    public void iEnterNameAs(String arg0) {
        if(arg0.equals("p-fname ")){
            registerPage.enterFirstName(faker.name().firstName());

        }else {
            registerPage.enterFirstName(arg0);
        }
    }

    @And("I pupulate the registration information")
    public void iPupulateTheRegistrationInformation(DataTable table) {
        Map<String,String> data = table.transpose().asMap();
        registerPage.enterPhone(faker.phoneNumber().phoneNumber());
        registerPage.enterCity(faker.address().cityName());

    }
}

