import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Parameters;


public class TestRunnerTestng extends AbstractTestNGCucumberTests {
    @Parameters("environment")
    public void setup(){

    }


}
