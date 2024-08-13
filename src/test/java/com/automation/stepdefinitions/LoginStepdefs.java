package com.automation.stepdefinitions;


import com.automation.constants.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert.*;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;

import java.util.concurrent.Callable;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class LoginStepdefs {

    private Scenario scenario;

    @Before
    public void startup(Scenario scenario){
         this.scenario=scenario ;
    }
    
    @Given("I have the parabank website URL")
    public void iHaveTheParabankWebsiteURL() {

        scenario.log("URL "+Constants.driver.getCurrentUrl());
        assertThat(Constants.driver.getCurrentUrl(),is("https://parabank.parasoft.com/parabank/index.htm"));
    }


    @When("I enter the username as {string}")
    public void iEnterTheUsernameAs(String arg0) {
        Constants.driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).clear();

        Constants.driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys(arg0);
        
    }

    @And("I enter the password as {string}")
    public void iEnterThePasswordAs(String arg0) {
        Constants.driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).clear();

        Constants.driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys(arg0);

    }

    @Then("The system displays the home page")
    public void theSystemDisplaysTheHomePage() {

        assertThat(Constants.driver.getTitle(),is("ParaBank | Accounts Overview"));
        
    }

    @And("the system displays a message {string}")
    public void theSystemDisplaysAMessage(String arg0) {
        String actualmsg = Constants.driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/p")).getText();
        assertThat(actualmsg,is(arg0));
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        Constants.driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
    }
}
