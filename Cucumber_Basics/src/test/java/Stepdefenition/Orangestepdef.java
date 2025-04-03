//package Stepdefenition;
//
//import static org.testng.Assert.assertEquals;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.*;
//
//public class Orangestepdef {
//	WebDriver driver;
//	@Before
//	public void setup()
//	{
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	}
//	
//	@Given("User is on Home Screen")
//	public void user_is_on_home_screen() {	
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
//	}
//
//	@When("User enters UserName as {string} and Password as {string}")
//	public void user_enters_user_name_as_and_password_as(String user, String pass) {
//		System.out.println("User name entered :");
//		driver.findElement(By.name("username")).sendKeys(user);
//		System.out.println("password entered :");
//		driver.findElement(By.name("password")).sendKeys(pass);
//		System.out.println("click the login");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	   
//	}
//	@Then("User should see the Dashboard page as {string}")
//	public void user_should_see_the_dashboard_page_as(String dash) {
//		String act1="Dashboard";
//		assertEquals(act1, dash);
//	}
//
//	@Then("Verify the Quick launch options as {string}")
//	public void verify_the_quick_launch_options_as(String launch) 
//	{
//		String act="";
//		String exp=launch;
//		switch(launch)
//		{
//		case "Assign Leave":
//			act=driver.findElement(By.xpath("//div//p[text()=\"Assign Leave\"]")).getText();
//			break;
//		case "Leave List":
//			act=driver.findElement(By.xpath("//div//p[text()=\"Leave List\"]")).getText();
//			break;
//		case "Timesheets":
//			act=driver.findElement(By.xpath("//div//p[text()=\"Timesheets\"]")).getText();
//			break;
//		case "Apply Leave":
//			act=driver.findElement(By.xpath("//div//p[text()=\"Apply Leave\"]")).getText();
//			break;
//		case "My Leave":
//			act=driver.findElement(By.xpath("//div//p[text()=\"My Leave\"]")).getText();
//			break;
//		case "My Timesheet":
//			act=driver.findElement(By.xpath("//div//p[text()=\"My Timesheet\"]")).getText();
//			break;
//		
//		}
//		assertEquals(act, exp);		
//	    
//	}
//	@After
//	public void teardown()
//	{
//		driver.quit();
//	}
//}
