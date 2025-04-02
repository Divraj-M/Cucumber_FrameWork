package runnerfile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin={"pretty",
		  "json:target/cucumber-reports/Cucumber.json",
		  "html:target/cucumber-reports/Cucumber.html"},features=
		  "src/test/resources/Com/feature/Orangeopt.feature",
		  glue={"Stepdefenition"})
public class Orangerunner extends
AbstractTestNGCucumberTests{

}
