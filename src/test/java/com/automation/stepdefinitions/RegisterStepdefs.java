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
    public void i_click_the_register_link() {

        registerPage.clickRegisterLink();
    }

//    @And("I enter name")
//    public void i_enter_name_as(String firstname) {
//        // Write code here that turns the phrase above into concrete actions
//        registerPage.enterFirstName(firstname);
//    }
@And("I enter name as {string}")
public void i_enter_name_as(String firstname) {
    registerPage.enterFirstName(firstname);
}

    @And("I enter lastname as {string}")
    public void i_enter_lastname_as(String lastname) {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterLastName(lastname);
    }
    @And("I enter address")
    public void i_enter_address() {
        String address = faker.address().streetAddress();
        registerPage.enterAddress(address);
    }

    @And("I enter city")
   public void i_enter_city() {
    String city = faker.address().city();
    registerPage.enterCity(city);
    }
    @And("I enter state")
    public void i_enter_state() {
        String state = faker.address().state();
        registerPage.enterState(state);
    }
    @And("I enter zipcode")
    public void i_enter_zipcode() {
        String zipCode = faker.address().zipCode();
        registerPage.enterZipCode(zipCode);
    }
    @And("I enter phone")
    public void i_enter_phone() {
        String phone = faker.phoneNumber().phoneNumber();
        registerPage.enterPhone(phone);
    }
    @And("I enter ssn")
    public void i_enter_ssn() {
        String ssn = faker.idNumber().ssnValid();
        registerPage.enterSSN(ssn);
    }
    @And("I enter username as {string}")
    public void iEnterUsernameAs(String username) {
        registerPage.enterUsername(username);

    }
    @And("I enter password as {string}")
    public void i_enter_password_as(String password) {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterPassword(password);
    }
    @And("I enter confirm as {string}")
    public void i_enter_confirm_as(String confirm) {
        // Write code here that turns the phrase above into concrete actions
        registerPage.enterConfirmPassword(confirm);
    }
    @Then("I click the register button")
    public void i_click_the_register_button() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.clickRegisterButton();
    }
    @And("the system confirms the registration")
    public void the_system_confirms_the_registration() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.verifyCreationMessage("Your account was created successfully. You are now logged in.");
    }



}

//    @And("I pupulate the registration information")
//    public void iPupulateTheRegistrationInformation(DataTable table) {
//        Map<String,String> data = table.transpose().asMap();
//        registerPage.enterPhone(faker.phoneNumber().phoneNumber());
//        registerPage.enterCity(faker.address().cityName());
//
//    }
//
//
//}

