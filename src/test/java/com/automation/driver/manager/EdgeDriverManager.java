package com.automation.driver.manager;

import com.automation.driver.factory.Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager implements Factory {
    @Override
    public WebDriver createDriver() {
        return new EdgeDriver();
    }
}
