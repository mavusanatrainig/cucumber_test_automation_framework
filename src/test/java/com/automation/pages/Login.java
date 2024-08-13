package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage{


    public Login(WebDriver driver) {
        super(driver)  ;
    }

    public void enterUserName(String username){

        driver.findElement(By.name("username")).sendKeys(username);
    }



}


