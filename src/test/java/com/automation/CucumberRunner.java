package com.automation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        tags = ""
)
@RunWith(Cucumber.class)
public class CucumberRunner {
}
