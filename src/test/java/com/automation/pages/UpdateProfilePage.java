package com.automation.pages;

import com.automation.utilities.ScreenShot;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class UpdateProfilePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[6]/a")
    private WebElement updateContactInfoTab;

    @FindBy(xpath = "//*[@id=\"customer.firstName\"]")
    private WebElement txtFirstName;

    @FindBy(xpath = "//*[@id=\"customer.lastName\"]")
    private WebElement txtLastName;

    @FindBy(xpath = "//*[@id=\"customer.address.street\"]")
    private WebElement txtAddress;

    @FindBy(xpath = "//*[@id=\"customer.address.city\"]")
    private WebElement txtCity;

    @FindBy(xpath = "//*[@id=\"customer.address.state\"]")
    private WebElement txtState;

    @FindBy(xpath = "//*[@id=\"customer.address.zipCode\"]")
    private WebElement txtZipCode;

    @FindBy(xpath = "//*[@id=\"customer.phoneNumber\"]")
    private WebElement txtPhone;

    @FindBy(xpath = "//*[@id=\"updateProfileForm\"]/form/table/tbody/tr[8]/td[2]/input")
    private WebElement btnUpdateProfile;

    public UpdateProfilePage(WebDriver driver, Scenario scenario) {
        super(driver, scenario);
    }

    // Implementing the isAt() method as required by BasePage
    @Override
    public boolean isAt() {
        return btnUpdateProfile.isDisplayed();
    }

    public void clickUpdateContactInfoTab() {
        updateContactInfoTab.click();
    }

    public void enterFirstName(String firstName) {
        txtFirstName.clear();
        txtFirstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        txtLastName.clear();
        txtLastName.sendKeys(lastName);
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

    public void enterPhoneNumber(String phone) {
        txtPhone.clear();
        txtPhone.sendKeys(phone);
    }

    public void clickUpdateProfileButton() {
        btnUpdateProfile.click();
        ScreenShot.captureScreenShot(scenario);
    }
}
