package runnerfile;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin={"pretty",
		  "json:target/cucumber-reports/Cucumber.json",
		  "html:target/cucumber-reports/Cucumber.html"},features=
		  "src/test/resources/Com/feature/datatable.feature",
		  glue={"Stepdefenition"})
public class datatablerunner extends AbstractTestNGCucumberTests{

}
