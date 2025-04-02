package runnerfile;
import io.cucumber.testng.CucumberOptions; import
io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(plugin={"pretty",
		  "json:target/cucumber-reports/Cucumber.json",
		  "html:target/cucumber-reports/Cucumber.html"},features=
		  "src/test/resources/Com/feature/outline.feature",
		  glue={"Stepdefenition"},tags= ("@InvalidCredentials1"))
public class outlinerunner extends
AbstractTestNGCucumberTests{

}
