package com.automation.stepdefinitions;
import com.automation.pages.RegisterPage;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

import static com.automation.constants.Constants.driver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Register2StepDefs {

    RegisterPage registerPage;
    Faker faker;

    @BeforeStep
    public void startup(Scenario scenario){
        registerPage = new RegisterPage( driver,scenario);
        faker =  new Faker();
    }
    @Given("I am on parabank website landing page")
    public void iAmOnParabankWebsiteLandingPage() {
        assertThat(driver.getCurrentUrl(), is("https://parabank.parasoft.com/parabank/index.htm"));
    }

    @When("I click the register.htm link")
    public void i_click_the_register_htm_link() {
        registerPage.clickRegisterLink();
    }

    @And("I populate the registration information with:")
    public void i_populate_the_registration_information(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String firstName = data.get(1).get(0);
        String lastName = data.get(1).get(1);
        String password = data.get(1).get(2);
        String confirmPassword = data.get(1).get(3);

        registerPage.enterFirstName(firstName);
        registerPage.enterLastName(lastName);
        registerPage.enterAddress(faker.address().streetAddress());
        registerPage.enterCity(faker.address().cityName());
        registerPage.enterState(faker.address().state());
        registerPage.enterZipCode(faker.address().zipCode());
        registerPage.enterPhone(faker.phoneNumber().phoneNumber());
        registerPage.enterSSN(faker.idNumber().ssnValid());

        registerPage.enterPassword(password);
        registerPage.enterConfirmPassword(confirmPassword);
    }

    @And("I try the following usernames:")
    public void i_try_the_following_usernames(DataTable dataTable) {
        List<String> usernames = dataTable.asList(String.class);
        boolean registrationSuccessful = false;
        String password = "kamo";
        String confirmPassword = "kamo";
        for (String username : usernames) {
            registerPage.enterUsername(username);
            registerPage.enterPassword(password);
            registerPage.enterConfirmPassword(confirmPassword);
            registerPage.clickRegisterButton();

            if (!registerPage.isUsernameTaken()) {
                registrationSuccessful = true;
                break;
            } else {
                registerPage.clearUsername();
            }
        }

        // If all usernames are taken, generate a random one
        if (!registrationSuccessful) {
            String randomUsername = faker.name().username();
            registerPage.enterUsername(randomUsername);
            registerPage.clickRegisterButton();
        }
    }

    @Then("the system confirms registration")
    public void the_system_confirms_registration() {

        registerPage.verifyCreationMessage("Your account was created successfully. You are now logged in.");
    }
}

