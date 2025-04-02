package runnerfile;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin={"pretty","json:target/cucumber-reports/Cucumber.json"},features="src/test/resources/Com/feature/sauce.feature",
glue={"Stepdefenition"}
/* ,tags =("not @Invalid-1") */
)
public class saucedemorunnertestng extends AbstractTestNGCucumberTests{
	
}
