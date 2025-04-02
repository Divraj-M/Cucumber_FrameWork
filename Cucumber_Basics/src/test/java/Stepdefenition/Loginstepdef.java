package Stepdefenition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdef {
	WebDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Given("I am in the orange HRM login page")
	public void i_am_in_the_orange_hrm_login_page() {
		
		
	}
	@BeforeStep

	public void stepbefore()
	{
		System.out.println("in the before step");
	}
	@AfterStep
	public void stepafter()
	{
		System.out.println("in the after step");
	}
	@When("user provides the valid user ID")
	public void user_provides_the_valid_user_id() {
	    driver.findElement(By.name("username")).sendKeys("Admin");;
	   
	}

	@When("user provides clid password")
	public void user_provides_clid_password() {
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}

	@Then("I should see a dashboard text in the home page")
	public void i_should_see_a_dashboard_text_in_the_home_page() {
		WebElement dashboard = driver.findElement(By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]"));
		String str = "OrangeHRM";
		String org = driver.getTitle();
        assertEquals(org,str);
		
		
	}
	

}
