package com.automation.pages;

import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage extends BasePage {

    @FindBy (how = How.NAME, using = "firstname")
    private WebElement txtEnterFirstName;

    private By lastName;

    public RegisterPage(WebDriver driver, Scenario scenario) {
        super(driver, scenario);
    }


    @Override
    public boolean isAt() {
        return false;
    }

    public void EnterFirstName(String name){
        txtEnterFirstName.clear();
        txtEnterFirstName.sendKeys();
    }
}
