import com.automation.constants.Constants;
import com.automation.driver.factory.DriverFactory;
import com.automation.listeners.TestListener;
import com.automation.utilities.Reports;
import com.aventstack.extentreports.model.Report;
import io.cucumber.java.After;
import io.cucumber.java.Before;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.log4j.Logger;
import io.cucumber.java.hu.De;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Hooks {

    private WebDriver driver;
    private RemoteWebDriver remoteWebDriver;

    @Before
    public void setup () throws MalformedURLException {
        TestListener listener =  new TestListener();
            log.info("Initialize web driver");
            ChromeOptions options = new ChromeOptions();
            options.setScriptTimeout(Duration.ofSeconds(60));
            options.setAcceptInsecureCerts(true);


            driver = new DriverFactory().createInstance(Constants.configuration.get("browser"));
            //driver = new RemoteWebDriver(new URL("http://192.168.1.106:4444"),options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get(Constants.configuration.get("url"));

        EventFiringDecorator<WebDriver> decorator = new EventFiringDecorator<>(listener);

        WebDriver decorateDriver = decorator.decorate(driver);


            Constants.driver = decorateDriver;




    }

    @After
    public void closure(){

        List<String> list = new ArrayList<>();
        list.add("target/cucumber.json");

        Reports reports = new Reports(list);
        //reports.createCucumberRepor();

        log.info("Close driver successfully");
        driver.quit();
        Constants.driver.quit();
    }
}
