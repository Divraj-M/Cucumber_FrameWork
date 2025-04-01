package runnerfile;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin={"pretty","html:target/cucumber-reports/Cucumber.html"},features="src/test/resources/Com/feature/sauce.feature",
glue="Stepdefenition")
public class saucedemorunnertestng extends AbstractTestNGCucumberTests{
	
}
