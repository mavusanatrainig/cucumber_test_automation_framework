package com.automation.pages;

import com.automation.utilities.ScreenShot;
import io.cucumber.java.Scenario;
//import lombok.extern.slf4j.Slf4j;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class LoginPage extends BasePage{
    @FindBy(xpath = "//*[@id='loginPanel']/form/div[1]/input")
    private WebElement txtUsername;

    @FindBy(xpath = "//*[@id='loginPanel']/form/div[2]/input")
    private WebElement txtPassword;

    @FindBy(xpath = "//*[@id='loginPanel']/form/div[3]/input")
    private WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/p")
    private WebElement welcomeMessage;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/h1")
    private WebElement errorMessage;


    public LoginPage(WebDriver driver, Scenario scenario) {
        super(driver, scenario);
    }


    @Override
    public boolean isAt() {
        return false;
    }

    public void enterUsername(String username){
        txtUsername.clear();
        txtUsername.sendKeys(username);

    }

    public void enterPassword(String pass){
        txtPassword.clear();
        txtPassword.sendKeys(pass);
    }

    public void clickLogin(){
        btnLogin.click();
        ScreenShot.captureScreenShot(scenario);
    }

    public void validateHomePage(){
        assertThat(driver.getTitle(),is("ParaBank | Accounts Overview"));
    }

    public void verifyWelcomeMessage(String msg){

       assertThat(welcomeMessage.getText(),is(msg));
    }
    public void validateErrorPage(){
        assertThat(driver.getTitle(),is("ParaBank | Error"));
    }

    public void ValidateErrorMessage(String msg){

        assertThat(errorMessage.getText(),is(msg));
    }
    public String getPageTitle() {
        return driver.getTitle();
    }

}


