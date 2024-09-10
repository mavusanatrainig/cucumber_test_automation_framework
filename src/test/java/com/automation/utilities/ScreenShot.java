package com.automation.utilities;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.automation.constants.Constants.driver;

public class ScreenShot {

    public static void captureScreenShot(Scenario scenario){

        TakesScreenshot screenshot =(TakesScreenshot) driver;
        final byte[] snap = screenshot.getScreenshotAs(OutputType.BYTES);
        System.out.println(snap);
        scenario.attach(snap,"image/png","screenshot");
    }

    public static void captureScreenShot(Scenario scenario,String description){

        TakesScreenshot screenshot =(TakesScreenshot) driver;
        final byte[] snap = screenshot.getScreenshotAs(OutputType.BYTES);
        scenario.attach(snap,"image/png",description);
    }
}
