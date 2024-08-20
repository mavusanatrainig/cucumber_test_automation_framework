package com.automation.driver.factory;

import com.automation.driver.manager.ChromeDriverManager;
import com.automation.driver.manager.EdgeDriverManager;
import com.automation.driver.manager.FirefoxDriverManager;
import com.automation.driver.manager.SafariDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public WebDriver createInstance(String browser){
        WebDriver driver;
        BrowserList browserType = BrowserList.valueOf(browser.toUpperCase());

        driver = switch (browserType){
            case EDGE -> new EdgeDriverManager().createDriver();
            case CHROME -> new ChromeDriverManager().createDriver();
            case SAFARI -> new SafariDriverManager().createDriver();
            case FIREFOX -> new FirefoxDriverManager().createDriver();
        };
        return driver;

    }
}
