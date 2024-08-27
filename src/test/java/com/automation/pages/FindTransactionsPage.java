package com.automation.pages;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FindTransactionsPage extends BasePage {

    @FindBy(how = How.ID, using = "account")
    private WebElement accountDropdown;

    @FindBy(how = How.ID, using = "transactionId")
    private WebElement txtTransactionId;

    @FindBy(how = How.ID, using = "transactionDate")
    private WebElement txtTransactionDate;

    @FindBy(how = How.ID, using = "fromDate")
    private WebElement txtFromDate;

    @FindBy(how = How.ID, using = "toDate")
    private WebElement txtToDate;

    @FindBy(how = How.ID, using = "amount")
    private WebElement txtAmount;

    //buttons
    @FindBy(how = How.ID, using = "findById")
    private WebElement btnFindById;

    @FindBy(how = How.ID, using = "findByDate")
    private WebElement btnFindByDate;

    @FindBy(how = How.ID, using = "findByDateRange")
    private WebElement btnFindByDateRange;

    @FindBy(how = How.ID, using = "findByAmount")
    private WebElement btnFindByAmount;

    //button[@class='button'][@id='findById'][contains(.,'FIND TRANSACTIONS')]
    //button[@class='button'][@id='findByDate'][contains(.,'FIND TRANSACTIONS')]
    //button[@class='button'][@id='findByDateRange'][contains(.,'FIND TRANSACTIONS')]
    //button[@class='button'][@id='findByAmount'][contains(.,'FIND TRANSACTIONS')]
    //input[@class='input'][@id='transactionId']
    //input[@class='input'][@id='transactionDate']
    //input[@class='input'][@id='fromDate']
    //input[@class='input'][@id='toDate']
    //input[@class='input'][@id='amount']


    public FindTransactionsPage(WebDriver driver, Scenario scenario) {
        super(driver, scenario);
    }

    @Override
    public boolean isAt() {
        return false;
    }

    public void validateTransactionsPage(){
        assertThat(driver.getTitle(),is("Find Transactions"));
    }

    public void selectAccount(String account){
            accountDropdown.sendKeys(account);
    }
    public void enterTransactionId(String pass) {
        txtTransactionId.clear();
        txtTransactionId.sendKeys(pass);
    }

    public void enterTransactionDate(String pass) {
        txtTransactionDate.clear();
        txtTransactionDate.sendKeys(pass);
    }


    public void enterFromDate(String pass) {
        txtFromDate.clear();
        txtFromDate.sendKeys(pass);
    }

    public void enterToDate(String pass) {
        txtToDate.clear();
        txtToDate.sendKeys(pass);
    }

    public void enterAmount(String pass) {
        txtAmount.clear();
        txtAmount.sendKeys(pass);
    }

    public void clickBtnFindById( ) {
        btnFindById.clear();
        btnFindById.click();
    }


    public void clickBtnFindByDate() {
        btnFindByDate.click();
    }

    public void clickBtnFindByDateRange() {
        btnFindByDateRange.click();
    }

    public void clickBtnFindByAmount() {
        btnFindByAmount.click();
    }
}
