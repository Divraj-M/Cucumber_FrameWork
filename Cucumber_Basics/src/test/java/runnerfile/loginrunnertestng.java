package runnerfile;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin={"pretty","html:target/cucumber-reports/Cucumber.html"},features="src/test/resources/Com/feature/Login.feature",
glue="Stepdefenition")
public class loginrunnertestng extends AbstractTestNGCucumberTests{
	

}
