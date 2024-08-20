package com.automation.driver.manager;

import com.automation.driver.factory.Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager implements Factory {
    @Override
    public WebDriver createDriver() {
        return new FirefoxDriver();
    }
}
