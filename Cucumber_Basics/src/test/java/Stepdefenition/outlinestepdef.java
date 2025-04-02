package Stepdefenition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class outlinestepdef {
	WebDriver driver;
	@Given("User is on Home Screen")
	public void user_is_on_home_screen() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enters UserName as {string} and Password as {string}")
	public void user_enters_user_name_as_and_password_as(String user, String pass) {
		System.out.println("User name entered :");
		driver.findElement(By.name("username")).sendKeys(user);
		System.out.println("password entered :");
		driver.findElement(By.name("password")).sendKeys(pass);
		System.out.println("click the login");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("User should be able to see an {string}")
	public void user_should_be_able_to_see_an(String error) {
		
		System.out.println("error msg :"+error);
		if(error.equalsIgnoreCase("Invalid credentials"))
		{
			String act=driver.findElement(By.className("oxd-text oxd-text--p oxd-alert-content-text")).getText();
			Assert.assertEquals(error, act);
		}
		else if(error.equalsIgnoreCase("Required"))
		{
			String act=driver.findElement(By.tagName("span")).getText();
			Assert.assertEquals(error, act);
		}
		
	   
	}




}
