
  package runnerfile; import io.cucumber.testng.CucumberOptions; import
  io.cucumber.testng.AbstractTestNGCucumberTests;
  
  @CucumberOptions(plugin={"pretty",
  "json:target/cucumber-reports/Cucumber.json",
  "html:target/cucumber-reports/Cucumber.html"},features=
  "src/test/resources/Com/feature/sauce.feature",
  glue={"Stepdefenition"},monochrome=true,dryRun=false ,tags
  =("not @Invalid-1") ) public class saucedemorunnertestng extends
  AbstractTestNGCucumberTests{
  
  }
 