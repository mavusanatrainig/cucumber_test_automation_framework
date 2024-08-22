import com.automation.constants.Constants;
import com.automation.driver.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@Slf4j
public class Hooks {

    private WebDriver driver;

    @Before
    public void setup (){

        driver = new DriverFactory().createInstance("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        Constants.driver=driver;


    }

    @After
    public void closure(){



        driver.quit();
        Constants.driver.quit();
    }
}
