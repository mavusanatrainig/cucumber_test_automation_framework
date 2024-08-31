import com.automation.constants.Constants;
import com.automation.driver.factory.DriverFactory;
import com.automation.listeners.TestListener;
import io.cucumber.java.After;
import io.cucumber.java.Before;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.log4j.Logger;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

import java.time.Duration;

@Slf4j
public class Hooks {

    private WebDriver driver;

    @Before
    public void setup () {
        TestListener listener =  new TestListener();
            log.info("Initialize web driver");
            driver = new DriverFactory().createInstance(Constants.configuration.get("browser"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get(Constants.configuration.get("url"));

        EventFiringDecorator<WebDriver> decorator = new EventFiringDecorator<>(listener);

        WebDriver decorateDriver = decorator.decorate(driver);


            Constants.driver = decorateDriver;




    }

    @After
    public void closure(){


        log.info("Close driver successfully");
        driver.quit();
        Constants.driver.quit();
    }
}
