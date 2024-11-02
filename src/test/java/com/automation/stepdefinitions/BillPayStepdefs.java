package com.automation.stepdefinitions;

import com.automation.pages.BillPayPage;
import com.automation.pages.LoginPage;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.automation.constants.Constants.driver;

public class BillPayStepdefs {

    BillPayPage billPayPage;
    LoginPage loginPage;

    @BeforeStep
    public void setup(Scenario scenario) {
        billPayPage = new BillPayPage(driver, scenario);
        loginPage = new LoginPage(driver, scenario);
    }

    @Given("the user is logged in to the Parabank website")
    public void userIsLoggedIn() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        loginPage.enterUsername("mavusana");
        loginPage.enterPassword("kamo");
        loginPage.clickLogin();
        loginPage.validateHomePage();
    }

    @When("I click the bill pay link")
    public void iClickTheBillPayLink() {
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a")).click();
    }

    @And("I enter payee name as {string}")
    public void iEnterPayeeNameAs(String payeeName) {
        billPayPage.enterPayeeName(payeeName);
    }

    @And("I enter address as {string}")
    public void iEnterAddressAs(String address) {
        billPayPage.enterAddress(address);
    }

    @And("I enter city as {string}")
    public void iEnterCityAs(String city) {
        billPayPage.enterCity(city);
    }

    @And("I enter state as {string}")
    public void iEnterStateAs(String state) {
        billPayPage.enterState(state);
    }

    @And("I enter zip code as {string}")
    public void iEnterZipCodeAs(String zipCode) {
        billPayPage.enterZipCode(zipCode);
    }

    @And("I enter phone number as {string}")
    public void iEnterPhoneNumberAs(String phoneNumber) {
        billPayPage.enterPhoneNumber(phoneNumber);
    }

    @And("I enter account number as {string}")
    public void iEnterAccountNumberAs(String accountNumber) {
        billPayPage.enterAccountNumber(accountNumber);
    }

    @And("I enter verify account number as {string}")
    public void iEnterVerifyAccountNumberAs(String verifyAccountNumber) {
        billPayPage.enterVerifyAccountNumber(verifyAccountNumber);
    }

    @And("I enter amount as {string}")
    public void iEnterAmountAs(String amount) {
        billPayPage.enterAmount(amount);
    }

    @And("I click send payment button")
    public void iClickSendPaymentButton() {
        billPayPage.clickSendPayment();
    }

    @Then("the system displays success message {string}")
    public void theSystemDisplaysSuccessMessage(String expectedMessage) {
        billPayPage.verifySuccessMessage(expectedMessage);
    }

    @Then("the bill pay system displays error message {string}")
    public void theBillPaySystemDisplaysErrorMessage(String expectedMessage) {
        billPayPage.verifyErrorMessage(expectedMessage);
    }
    }

