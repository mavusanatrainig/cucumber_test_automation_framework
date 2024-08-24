package com.automation.stepdefinitions;


import com.automation.pages.RegisterPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

import static com.automation.constants.Constants.driver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class RegisterStepdefs {

    RegisterPage registerPage;

    @BeforeStep
    public void startup(Scenario scenario) {
        registerPage = new RegisterPage(driver, scenario);
    }

    @Given("I am on the parabank website landing page")
    public void iAmOnTheParabankWebsiteLandingPage() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("I click the register link")
    public void iClickTheRegisterLink() {
        WebElement registerLink = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(By.linkText("Register")));
        registerLink.click();
    }

    @And("I enter firstname as {string}")
    public void iEnterFirstnameAs(String firstName) {
        registerPage.enterFirstName(firstName);
    }

    @And("I enter lastname as {string}")
    public void iEnterLastnameAs(String lastName) {
        registerPage.enterLastName(lastName);
    }

    @And("I enter name as {string}")
    public void iEnterNameAs(DataTable data) {
        Map<String, String> table = data.transpose().asMap(String.class, String.class);
        registerPage.enterFirstName(table.get("first_name"));
        registerPage.enterLastName(table.get("lastname"));
    }

    @And("I enter address as {string}")
    public void iEnterAddressAs(String address) {
        registerPage.enterAddress(address);
    }

    @And("I enter city as {string}")
    public void iEnterCityAs(String city) {
        registerPage.enterCity(city);
    }

    @And("I enter state as {string}")
    public void iEnterStateAs(String state) {
        registerPage.enterState(state);
    }

    @And("I enter zipcode as {string}")
    public void iEnterZipcodeAs(String zipcode) {
        registerPage.enterZipCode(zipcode);
    }

    @And("I enter phone as {string}")
    public void iEnterPhoneAs(String phone) {
        registerPage.enterPhoneNumber(phone);
    }

    @And("I enter ssn as {string}")
    public void iEnterSsnAs(String ssn) {
        registerPage.enterSSN(ssn);
    }

    @And("I enter username as {string}")
    public void iEnterUsernameAs(String username) {
        registerPage.enterUsername(username);
    }

    @And("I enter password as {string}")
    public void iEnterPasswordAs(String password) {
        registerPage.enterPassword(password);
    }

    @And("I enter confirm as {string}")
    public void iEnterConfirmAs(String confirm) {
        registerPage.enterConfirmPassword(confirm);
    }

    @And("I click the register button")
    public void iClickTheRegisterButton() {
        registerPage.clickRegisterButton();
    }

    @And("the system confirms the registration")
    public void theSystemConfirmsTheRegistration() {

        String confirmationMessage = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("title")))
                .getText();
        assertThat("Registration confirmation message is displayed", confirmationMessage, containsString("Welcome mavusana"));
    }
}
