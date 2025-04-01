package runnerfile;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:target/cucumber-reports/Cucumber.html"},features="src/test/resources/Com/feature/Login.feature",
glue="Stepdefenition")
public class loginrunner {
	
	

}
