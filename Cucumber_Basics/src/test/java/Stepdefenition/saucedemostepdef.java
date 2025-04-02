package Stepdefenition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class saucedemostepdef {
	

    WebDriver driver;
    @Before()
    public void setup()
    {
    	
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.saucedemo.com");
    	
    }
//    @Before("@edge")
//    public void edge()
//    {
//    	driver=new EdgeDriver();
//    	driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get("https://www.saucedemo.com");
//    	
//    }
    @Before("@firefox")
    public void firefox()
    {
    	driver=new FirefoxDriver();
    	driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.saucedemo.com");
    	
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
    
    
	@Given("Iam in the SauseDemo Login Page")
	public void iam_in_the_sause_demo_login_page() {
		System.out.println("In the Sauce demo login page ");
	  
		  
	}

	@When("The user provides the Username")
	public void the_user_provides_the_username() {
		driver.findElement(By.name("user-name")).sendKeys("standard_user");

	}

	@When("The User provides the Passowrd")
	public void the_user_provides_the_passowrd() {
		 driver.findElement(By.name("password")).sendKeys("secret_sauce");
	}

	@When("Clicking on the login button")
	public void clicking_on_the_login_button() {
		 driver.findElement(By.xpath("//input[@type='submit']")).click();  

	}

	@Then("I want to verify that i am logged in or not")
	public void i_want_to_verify_that_i_am_logged_in_or_not() {
	   String org = driver.getTitle();
	   String Exp = "Swag Labs";
	   assertEquals(org, Exp);
	}




@When("The user provides invalid the Username")
public void the_user_provides_invalid_the_username() {
	driver.findElement(By.name("user-name")).sendKeys("tandard_user");

}

@Then("i want to see error message")
public void i_want_to_see_error_message() {
	WebElement error = driver.findElement(By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']"));
	String Expected = error.getText();
	String Orginal = "Epic sadface: Username and password do not match any user in this service";
	assertEquals(Orginal, Expected);
}

@When("The User provides invalid the Passowrd")
public void the_user_provides_invalid_the_passowrd() {
	 driver.findElement(By.name("password")).sendKeys("Sec");

}

@When("The user provides no username")
public void the_user_provides_no_username() {
	driver.findElement(By.name("user-name"));

}
@Then("i want to see error message of No username")
public void i_want_to_see_error_message_of_no_username() {
	WebElement error = driver.findElement(By.xpath("//h3[text()='Epic sadface: Username is required']"));
	String Expected = error.getText();
	String Orginal = "Epic sadface: Username is required";
	assertEquals(Orginal, Expected);
	


}

@When("The User provides no Passowrd")
public void the_user_provides_no_passowrd() {
	 driver.findElement(By.name("password"));

}




@Then("i want to see error message of no Password")
public void i_want_to_see_error_message_of_no_password() {
	WebElement error = driver.findElement(By.xpath("//h3[text()='Epic sadface: Password is required']"));
	String Expected = error.getText();
	String Orginal = "Epic sadface: Password is required";
	assertEquals(Orginal, Expected);
}
 
@After
public void teardown()
{
	driver.close();
}



}