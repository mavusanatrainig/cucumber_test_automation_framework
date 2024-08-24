package com.automation.pages;

import com.automation.utilities.ScreenShot;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"customer.firstName\"]")
    private WebElement txtEnterFirstName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"customer.lastName\"]")
    private WebElement txtEnterLastName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"customer.address.street\"]")
    private WebElement txtEnterAddress;

    @FindBy(how = How.XPATH, using = "//*[@id=\"customer.address.city\"]")
    private WebElement txtEnterCity;

    @FindBy(how = How.XPATH, using = "//*[@id=\"customer.address.state\"]")
    private WebElement txtEnterState;

    @FindBy(how = How.XPATH, using = "//*[@id=\"customer.address.zipCode\"]")
    private WebElement txtEnterZipCode;

    @FindBy(how = How.XPATH, using = "//*[@id=\"customer.phoneNumber\"]")
    private WebElement txtEnterPhoneNumber;

    @FindBy(how = How.XPATH, using = "//*[@id=\"customer.ssn\"]")
    private WebElement txtEnterSSN;

    @FindBy(how = How.XPATH, using = "//*[@id=\"customer.username\"]")
    private WebElement txtEnterUsername;

    @FindBy(how = How.XPATH, using = "//*[@id=\"customer.password\"]")
    private WebElement txtEnterPassword;

    @FindBy(how = How.XPATH, using = "//*[@id=\"repeatedPassword\"]")
    private WebElement txtEnterConfirmPassword;

    @FindBy(how = How.XPATH, using = "//input[@value='Register']")
    private WebElement btnRegister;

    public RegisterPage(WebDriver driver, Scenario scenario) {
        super(driver, scenario);
    }

    @Override
    public boolean isAt() {
        return txtEnterFirstName.isDisplayed();
    }

    public void enterFirstName(String name) {
        txtEnterFirstName.clear();
        txtEnterFirstName.sendKeys(name);
    }

    public void enterLastName(String lastName) {
        txtEnterLastName.clear();
        txtEnterLastName.sendKeys(lastName);
    }

    public void enterAddress(String address) {
        txtEnterAddress.clear();
        txtEnterAddress.sendKeys(address);
    }

    public void enterCity(String city) {
        txtEnterCity.clear();
        txtEnterCity.sendKeys(city);
    }

    public void enterState(String state) {
        txtEnterState.clear();
        txtEnterState.sendKeys(state);
    }

    public void enterZipCode(String zipCode) {
        txtEnterZipCode.clear();
        txtEnterZipCode.sendKeys(zipCode);
    }

    public void enterPhoneNumber(String phone) {
        txtEnterPhoneNumber.clear();
        txtEnterPhoneNumber.sendKeys(phone);
    }

    public void enterSSN(String ssn) {
        txtEnterSSN.clear();
        txtEnterSSN.sendKeys(ssn);
    }

    public void enterUsername(String username) {
        txtEnterUsername.clear();
        txtEnterUsername.sendKeys(username);
    }

    public void enterPassword(String password) {
        txtEnterPassword.clear();
        txtEnterPassword.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        txtEnterConfirmPassword.clear();
        txtEnterConfirmPassword.sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        ScreenShot.captureScreenShot(scenario);
        btnRegister.click();

    }
}
