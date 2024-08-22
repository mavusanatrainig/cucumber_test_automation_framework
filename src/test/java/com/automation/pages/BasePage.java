package com.automation.pages;

import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


@Slf4j
public abstract class BasePage {


    protected WebDriver driver;
    protected Scenario scenario;

    public BasePage(WebDriver driver, Scenario scenario) {
        this.driver = driver;
        this.scenario = scenario;
        PageFactory.initElements(driver,this);

    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
        log.info("Init");
        PageFactory.initElements(driver,this);
    }

    public abstract boolean isAt();
}
