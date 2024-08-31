package com.automation.pages;

import com.automation.utilities.ScreenShot;
import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class LoginPage extends BasePage{
    @FindBy(how=How.NAME,  using="username")
    private WebElement txtUsername;
    @FindBy(how=How.NAME,  using="password")
    private WebElement txtPassword;
    @FindBy(how = How.XPATH, using = "//*[@id=\"loginPanel\"]/form/div[3]/input")
    private WebElement btnLogin;
    @FindBy(how = How.XPATH, using ="\"//*[@id=\\\"leftPanel\\\"]/p\"" )
    private WebElement lblWelcomeMsg;

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
//        assertThat(driver.getTitle(),is("ParaBank | Welcome | Online Banking"));
        assertThat(driver.getTitle(),is("ParaBank | Accounts Overview"));
    }

    public void verifyWelcomeMessage(String msg){

       assertThat( lblWelcomeMsg.getText(),is(msg));
    }

}


