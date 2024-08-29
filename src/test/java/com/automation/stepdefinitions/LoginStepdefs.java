package com.automation.stepdefinitions;


import com.automation.pages.LoginPage;
import com.automation.utilities.ScreenShot;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


import static com.automation.constants.Constants.driver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class LoginStepdefs {


    LoginPage loginPage;



    @BeforeStep
    public void startup(Scenario scenario){

         loginPage = new LoginPage(driver,scenario);
    }
    
    @Given("I have the parabank website URL")
    public void iHaveTheParabankWebsiteURL() {
        assertThat(driver.getCurrentUrl(),is("https://parabank.parasoft.com/parabank/index.htm"));
    }


    @When("I enter the username as {string}")
    public void iEnterTheUsernameAs(String arg0) {

        loginPage.enterUsername(arg0);
    }

    @And("I enter the password as {string}")
    public void iEnterThePasswordAs(String arg0) {
      loginPage.enterPassword(arg0);

    }

    @Then("The system displays the home page")
    public void theSystemDisplaysTheHomePage() {

        loginPage.validateHomePage();
    }

    @And("the system displays a message {string}")
    public void theSystemDisplaysAMessage(String arg0) {
        loginPage.verifyWelcomeMessage(arg0);
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        loginPage.clickLogin();

    }

    @And("the system displays error message {string}")
    public void ValidateErrorMessage(String errorMessage) {
       loginPage.ValidateErrorMessage(errorMessage);
    }

    @Then("The system displays the error page")
    public void verifyErrorPage() {
        loginPage.validateErrorPage();

    }
}
