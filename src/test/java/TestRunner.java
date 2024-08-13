import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = { "json:target/cucumber.json","pretty",
                "html:target/cucumber-reports/cucumber.html" },
        features = "src/test/resources/features",
        tags="@smoke"
)
public class TestRunner {
}
