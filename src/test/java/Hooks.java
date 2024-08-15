import com.automation.constants.Constants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private WebDriver driver;

    @Before
    public void setup (){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Constants.driver=driver;
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

    }

    @After
    public void closure(){



        driver.quit();
        Constants.driver.quit();
    }
}
