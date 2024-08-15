package com.automation.stepdefinitions;

import com.automation.constants.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.function.Consumer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class loginStepdefs {

    private Scenario scenario;

    @Before
    public void startup(Scenario scenario){
        this.scenario = scenario;
    }

    @Given("I have the parabank website URL")
    public void iHaveTheParabankWebsiteURL() {
        scenario.log("URL " + Constants.driver.getCurrentUrl());
        assertThat(Constants.driver.getCurrentUrl(), is("https://parabank.parasoft.com/parabank/index.htm"));
    }

    @When("I enter the username as {string}")
    public void iEnterTheUsernameAs(String username) {
        performActionOnElement("//*[@id=\"loginPanel\"]/form/div[1]/input", element -> {
            element.clear();
            element.sendKeys(username);
        });
    }

    @And("I enter the password as {string}")
    public void iEnterThePasswordAs(String password) {
        performActionOnElement("//*[@id=\"loginPanel\"]/form/div[2]/input", element -> {
            element.clear();
            element.sendKeys(password);
        });
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        performActionOnElement("//*[@id=\"loginPanel\"]/form/div[3]/input", WebElement::click);
    }

    @Then("The system displays the register page")
    public void theSystemDisplaysTheRegisterPage() {
        assertThat(Constants.driver.getTitle(), is("ParaBank | Accounts Overview"));
    }

    @And("the system displays a message {string}")
    public void theSystemDisplaysAMessage(String expectedMessage) {
        String actualMessage = getElementText("//*[@id=\"leftPanel\"]/p");
        assertThat(actualMessage, is(expectedMessage));
    }
    @Then("The system displays the login page")
    public void theSystemDisplaysTheLoginPage() {

    }

    @And("the system displays a error message {string}")
    public void theSystemDisplaysAErrorMessage(String errormsg) {
        String actualMessage = getElementText("//*[@id=\"rightPanel\"]/h1");
        assertThat(actualMessage, is(errormsg));
    }

    //  methods using lambdas
    private void performActionOnElement(String xpath, Consumer<WebElement> action) {
        WebElement element = Constants.driver.findElement(By.xpath(xpath));
        action.accept(element);
    }

    private String getElementText(String xpath) {
        return Constants.driver.findElement(By.xpath(xpath)).getText();
    }


}
