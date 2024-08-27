package com.automation.pages;

import com.automation.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AccountOverviewPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"overviewAccountsApp\"]")
    private WebElement accountList;

    @FindBy(xpath = "//*[@id=\"accountTable\"]/tfoot/tr/td")
    private List<WebElement> accountBalances;

    @FindBy(xpath = "//*[@id=\"accountTable\"]/tfoot/tr/td")
    private WebElement footerText;

    public AccountOverviewPage(WebDriver driver, Scenario scenario) {
        super(driver, scenario);
    }

    @Override
    public boolean isAt() {
        return driver.getTitle().equals("ParaBank | Accounts Overview");
    }

    public void validateAccountListIsDisplayed() {
        assertThat(accountList.isDisplayed(), is(true));
    }

    public void validateAllBalancesDisplayed() {
        for (WebElement balance : accountBalances) {
            assertThat(balance.getText().trim(), is(not(emptyString())));
        }
    }

    public void validateFooterText(String expectedText) {
        assertThat(footerText.getText(), containsString(expectedText));
    }
}
