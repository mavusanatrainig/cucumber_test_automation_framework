package com.automation.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;

    protected JavascriptExecutor javascriptExecutor;

    public void init(){
        PageFactory.initElements(this.driver,this);
    }


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
