package com.automation.pages;

import com.automation.pages.BasePage;
import io.cucumber.java.Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RegisterPage extends BasePage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"customer.firstName\"]")
    private WebElement txtEnterFirstName;
    @FindBy(how = How.XPATH, using = "//input[@class='input'][@id='customer.lastName']")
    private WebElement txtEnterLastName;
    @FindBy(how = How.XPATH, using = "//input[@class='input'][@id='customer.address.street']")
    private WebElement txtEnterStreet;
    @FindBy(how = How.XPATH, using = "//input[@class='input'][@id='customer.address.city']")
    private WebElement txtEnterCity;
    @FindBy(how = How.XPATH, using = "//input[@class='input'][@id='customer.address.state']")
    private WebElement txtEnterState;
    @FindBy(how = How.XPATH, using = "//input[@class='input'][@id='customer.address.zipCode']")
    private WebElement txtEnterZipCode;
    @FindBy(how = How.XPATH, using = "//input[@class='input'][@id='customer.phoneNumber']")
    private WebElement txtEnterPhoneNumber;
    @FindBy(how = How.XPATH, using = "//input[@class='input'][@id='customer.ssn']")
    private WebElement txtEnterSsn;
    @FindBy(how = How.XPATH, using = "//input[@class='input'][@id='customer.username']")
    private WebElement txtEnterUsername;
    @FindBy(how = How.XPATH, using = "//input[@class='input'][@id='customer.password']")
    private WebElement txtEnterPassword;
    @FindBy(how = How.XPATH, using = "//input[@class='input'][@id='repeatedPassword']")
    private WebElement txtEnterRepeatedPassword;
    @FindBy(how = How.NAME, using = "customer.address.street")
    private WebElement txtEnterAddress;
    @FindBy(how = How.XPATH, using = "//input[contains(@value,'Register')]")
    private WebElement btnClickRegister;
    @FindBy(how = How.XPATH, using = " /html/body/div[1]/div[3]/div[1]/div/p[2]/a")
    private WebElement linkRegister;
    @FindBy(how = How.XPATH, using = "//*[@id=\"rightPanel\"]/p")
    private WebElement labelSuccessfulAccountCreation;
    @FindBy(how = How.XPATH, using = "//*[@id=\"rightPanel\"]/p")
    private WebElement Successmsg;
    @FindBy(how = How.XPATH, using = "//*[@id=\"customerForm\"]/table/tbody/tr[10]/td[3]")//This username already exists.
    private WebElement usernameerror;



    public RegisterPage(WebDriver driver, Scenario scenario) {
        super(driver, scenario);
    }




    @Override
    public boolean isAt() {
        return false;
    }

    public void navigateToHomePage() {
        assertThat(driver.getCurrentUrl(), is("https://parabank.parasoft.com/parabank/index.htm"));
    }

    public void clickRegisterLink() {
        linkRegister.click();
//        assertThat(driver.getCurrentUrl(), is("https://parabank.parasoft.com/parabank/register.htm"));

    }

    public void enterFirstName(String firstname) {
        txtEnterFirstName.clear();
        txtEnterFirstName.sendKeys(firstname);
    }

    public void enterLastName(String lastname) {
        txtEnterLastName.clear();
        txtEnterLastName.sendKeys(lastname);
    }

    public void enterAddress(String name) {
        txtEnterAddress.clear();
        txtEnterAddress.sendKeys(name);
    }

    public void enterCity(String name) {
        txtEnterCity.clear();
        txtEnterCity.sendKeys(name);
    }

    public void enterState(String name) {
        txtEnterState.clear();
        txtEnterState.sendKeys(name);
    }

    public void enterZipCode(String name) {
        txtEnterZipCode.clear();
        txtEnterZipCode.sendKeys(name);
    }

    public void enterPhone(String name) {
        txtEnterPhoneNumber.clear();
        txtEnterPhoneNumber.sendKeys(name);
    }

    public void enterSSN(String name) {
        txtEnterSsn.clear();
        txtEnterSsn.sendKeys(name);
    }

    public void enterUsername(String username) {
        txtEnterUsername.clear();
        txtEnterUsername.sendKeys(username);
    }

    public void enterPassword(String password) {
        txtEnterPassword.clear();
        txtEnterPassword.sendKeys(password);
    }

    public void enterConfirmPassword(String confirm) {
        txtEnterRepeatedPassword.clear();
        txtEnterRepeatedPassword.sendKeys(confirm);
    }

    public void clickRegisterButton() {
//        btnClickRegister.clear();
        btnClickRegister.click();
    }

    public void verifyCreationMessage(String msg) {
        assertThat(labelSuccessfulAccountCreation.getText(), is(msg));
    }
    public void usernameError(String errormsg) {
        assertThat(usernameerror.getText().trim(), is(errormsg));
    }


    public boolean isUsernameTaken() {
        try {
            return usernameerror.isDisplayed();
        } catch (NoSuchElementException e) {
            return false; // Return false if the element is not found
        }
    }
    public void clearUsername() {
        txtEnterUsername.clear();

    }

}
// Method to verify the registration success message
// Method to attempt the registration submission

