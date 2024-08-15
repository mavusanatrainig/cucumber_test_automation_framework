package com.automation.stepdefinitions;

import com.automation.pages.LoginPage;
import com.automation.pages.RegisterPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;

import java.util.Map;

import static com.automation.constants.Constants.driver;

public class RegisterStepdefs {

    RegisterPage registerPage;
    @BeforeStep
    public void startup(Scenario scenario){

        registerPage = new RegisterPage( driver,scenario);
    }



    @When("I click the register link")
    public void iClickTheRegisterLink() {
    }


    @And("I enter firstname as {string}")
    public void iEnterFirstnameAs(String arg0, String arg1) {

    }

    @And("I enter name as {string}")
    public void iEnterNameAs(String arg0, String arg1) {

    }

    @And("I enter name as {}")
    public void iEnterNameAs(DataTable data) {
        Map<String,String> table = data.transpose().asMap();
        registerPage.EnterFirstName(table.get("first_name"));
    }
}
