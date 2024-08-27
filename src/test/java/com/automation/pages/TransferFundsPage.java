package com.automation.pages;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TransferFundsPage extends BasePage {

    @FindBy(how = How.NAME, using = "username")
    private WebElement txtUsername;


    public TransferFundsPage(WebDriver driver, Scenario scenario) {
        super(driver, scenario);
    }

    @Override
    public boolean isAt() {
        return false;
    }
}

