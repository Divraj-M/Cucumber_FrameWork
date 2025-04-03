package Stepdefenition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class datatablestepdef {
	WebDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
@Given("The user is on Orange HRM")
public void the_user_is_on_orange_hrm() {
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@When("User enters valid credentials")
public void user_enters_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	System.out.println("Credentials Entered");
   // List<List<String>> signUpForm=dataTable.asLists(String.class);
	List<Map<String,String>> signUpForm=dataTable.asMaps(String.class,String.class);
	for(Map<String,String> form:signUpForm) {
//    String username=form.get(0).get("Username");
//    String password=form.get(0).get("Password");
	String username=form.get("Username");
    String password=form.get("Password");
    driver.findElement(By.name("username")).sendKeys(username);
    driver.findElement(By.name("password")).sendKeys(password);
    driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).submit();
    String errorMessage=signUpForm.get(0).get("ErrorMessage");
    String actualErrorMessage=driver.findElement(By.xpath("//div[@class=\"orangehrm-login-error\"]//div//div//p")).getText();
    System.out.println("actual error message :"+actualErrorMessage);
    Assert.assertTrue(actualErrorMessage.equalsIgnoreCase(errorMessage));
}
}

@Then("user should be able to login sucessfully and new page open")
public void user_should_be_able_to_login_sucessfully_and_new_page_open() {
}



}
