
import com.automation.constants.Constants;
import io.cucumber.testng.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

import java.util.Map;
import java.util.Objects;


@CucumberOptions(
        plugin={ "json:target/cucumber.json","pretty",
                "html:target/cucumber-reports/cucumber.html" },
//        glue={"com.automation.stepdefinitions"},
        features="src/test/resources/features",
        tags="@login"
)
@Slf4j
public class TestRunnerTestng extends AbstractTestNGCucumberTests {



    @BeforeClass(alwaysRun = true)
    @Override
    public void setUpClass(ITestContext context) {
        super.setUpClass(context);

        XmlTest currentXml = context.getCurrentXmlTest();
        Map<String,String> params = currentXml.getAllParameters();
        Constants.configuration = params;
        params.forEach((k,v)->log.info(k +":" +v));


    }
}
