import com.automation.constants.Constants;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hooks {



    @Before
    public void setup (){

        Constants.driver = new ChromeDriver();
        Constants.driver.get("https://parabank.parasoft.com/parabank/index.htm");

    }

    @After
    public void closure(){
        Constants.driver.close();
        Constants.driver.quit();
    }
}
