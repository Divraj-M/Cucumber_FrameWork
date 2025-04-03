package runnerfile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    plugin = {"pretty",
              "json:target/cucumber-reports/Cucumber.json",
              "html:target/cucumber-reports/Cucumber.html"},
    features = "classpath:Com/feature/datatable.feature",  // Fixed feature file path
    glue = {"Stepdefenition"}  // Ensure step definitions exist here
)
public class datatablerunner extends AbstractTestNGCucumberTests {
}
