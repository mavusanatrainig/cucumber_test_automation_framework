package com.automation.stepdefinitions;

import com.automation.pages.FindTransactionsPage;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.automation.constants.Constants.driver;

public class MyStepdefs {
    FindTransactionsPage findTransactionsPage;
    @BeforeStep
    public void startup(Scenario scenario){

        findTransactionsPage = new FindTransactionsPage( driver,scenario);
    }


    @Given("I am on the Parabank Find Transactions page")
    public void iAmOnTheParabankFindTransactionsPage() {

        findTransactionsPage.validateTransactionsPage();
    }

    @Given("I select account {string} from the dropdown")
    public void iSelectAccountFromTheDropdown(String arg0) {
        findTransactionsPage.selectAccount(arg0);
    }

    @When("I enter transaction ID {string} in the {string} field")
    public void iEnterTransactionIDInTheField(String arg0, String arg1) {
        findTransactionsPage.enterTransactionId(arg0);
    }

    @And("I click the {string} button")
    public void iClickTheButton(String arg0) {
        findTransactionsPage.clickBtnFindById();
    }

    @Then("I should see the transactions with transaction ID {string}")
    public void iShouldSeeTheTransactionsWithTransactionID(String arg0) {

    }

    @When("I enter date {string} in the {string} field")
    public void iEnterDateInTheField(String arg0, String arg1) {
        findTransactionsPage.enterTransactionDate(arg1);
    }

    @Then("I should see the transactions from date {string}")
    public void iShouldSeeTheTransactionsFromDate(String arg0) {
        
    }

    @When("I enter start date {string} and end date {string} in the Find by Date Range fields")
    public void iEnterStartDateAndEndDateInTheFindByDateRangeFields(String arg0, String arg1) {
        findTransactionsPage.enterFromDate(arg0);
        findTransactionsPage.enterFromDate(arg1);
    }

    @Then("I should see the transactions between {string} and {string}")
    public void iShouldSeeTheTransactionsBetweenAnd(String arg0, String arg1) {
        
    }

    @When("I enter amount {string} in the Find by Amount field")
    public void iEnterAmountInTheFindByAmountField(String arg0) {
        findTransactionsPage.enterAmount(arg0);
    }

    @Then("I should see the transactions with amount {string}")
    public void iShouldSeeTheTransactionsWithAmount(String arg0) {
    }


    @And("I click the Find Transactions by Date button")
    public void iClickTheFindTransactionsByDateButton() {
        findTransactionsPage.clickBtnFindByDate();
    }

    @And("I click the Find Transactions by Date Range button")
    public void iClickTheFindTransactionsByDateRangeButton() {
        findTransactionsPage.clickBtnFindByDateRange();
    }

    @And("I click the Find Transactions by Amount button")
    public void iClickTheFindTransactionsByAmountButton() {
        findTransactionsPage.clickBtnFindByAmount();
    }
}
