package com.automation.pages;

import com.automation.utilities.ScreenShot;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BillPayPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"billpayForm\"]/form/table/tbody/tr[1]/td[2]/input")
    private WebElement txtPayeeName;

    @FindBy(xpath = "//*[@id=\"billpayForm\"]/form/table/tbody/tr[2]/td[2]/input")
    private WebElement txtAddress;

    @FindBy(xpath = "//*[@id=\"billpayForm\"]/form/table/tbody/tr[3]/td[2]/input")
    private WebElement txtCity;

    @FindBy(xpath = "//*[@id=\"billpayForm\"]/form/table/tbody/tr[4]/td[2]/input")
    private WebElement txtState;

    @FindBy(xpath = "//*[@id=\"billpayForm\"]/form/table/tbody/tr[5]/td[2]/input")
    private WebElement txtZipCode;

    @FindBy(xpath= "/html/body/div[1]/div[3]/div[2]/div/div[1]/form/table/tbody/tr[6]/td[2]/input")
    private WebElement txtPhoneNumber;

    @FindBy(xpath = "//*[@id=\"billpayForm\"]/form/table/tbody/tr[8]/td[2]/input")
    private WebElement txtAccountNumber;

    @FindBy(xpath = "//*[@id=\"billpayForm\"]/form/table/tbody/tr[9]/td[2]/input")
    private WebElement txtVerifyAccountNumber;

    @FindBy(xpath = "//*[@id=\"billpayForm\"]/form/table/tbody/tr[11]/td[2]/input")
    private WebElement txtAmount;

    @FindBy(xpath = "//*[@id=\"billpayForm\"]/form/table/tbody/tr[14]/td[2]/input")
    private WebElement btnSendPayment;

    @FindBy(xpath = "//*[@id=\"billpayResult\"]/h1")
    private WebElement successMessage;

    @FindBy(xpath = "//*[@id='errorPanel']")
    private WebElement errorMessage;

    public BillPayPage(WebDriver driver, Scenario scenario) {
        super(driver, scenario);
    }

    @Override
    public boolean isAt() {
        return btnSendPayment.isDisplayed();
    }

    public void enterPayeeName(String payeeName) {
        txtPayeeName.clear();
        txtPayeeName.sendKeys(payeeName);
    }

    public void enterAddress(String address) {
        txtAddress.clear();
        txtAddress.sendKeys(address);
    }

    public void enterCity(String city) {
        txtCity.clear();
        txtCity.sendKeys(city);
    }

    public void enterState(String state) {
        txtState.clear();
        txtState.sendKeys(state);
    }

    public void enterZipCode(String zipCode) {
        txtZipCode.clear();
        txtZipCode.sendKeys(zipCode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        txtPhoneNumber.clear();
        txtPhoneNumber.sendKeys(phoneNumber);
    }

    public void enterAccountNumber(String accountNumber) {
        txtAccountNumber.clear();
        txtAccountNumber.sendKeys(accountNumber);
    }

    public void enterVerifyAccountNumber(String verifyAccountNumber) {
        txtVerifyAccountNumber.clear();
        txtVerifyAccountNumber.sendKeys(verifyAccountNumber);
    }

    public void enterAmount(String amount) {
        txtAmount.clear();
        txtAmount.sendKeys(amount);
    }

    public void clickSendPayment() {
        btnSendPayment.click();
        ScreenShot.captureScreenShot(scenario);
    }

    public void verifySuccessMessage(String expectedMessage) {
        assertThat(successMessage.getText(), is(expectedMessage));
    }

    public void verifyErrorMessage(String expectedMessage) {
        assertThat(errorMessage.getText(), is(expectedMessage));
    }
}
