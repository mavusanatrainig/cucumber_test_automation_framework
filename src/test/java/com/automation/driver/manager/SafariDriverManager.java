package com.automation.driver.manager;

import com.automation.driver.factory.Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverManager implements Factory {
    @Override
    public WebDriver createDriver() {
        return new SafariDriver();
    }
}
