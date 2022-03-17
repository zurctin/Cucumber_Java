package StepForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksSteps {

//	WebDriver driver = null;
//
//	@Before(order=0) //this will be executed BEFORE EVERY SCENARIO in the feature
//	public void browserSetup() {
//		
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is " + projectPath);
//
//		System.setProperty("webdriver.firefox.bin","C:/Users/Christina.Cruz/AppData/Local/Mozilla Firefox/firefox.exe");
//		System.setProperty("webdriver.gecko.driver", projectPath + "/src/test/resources/drivers/geckodriver.exe");
//		driver = new FirefoxDriver();
//		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 	//needs to finish 30seconds waiting time for page to load
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);   //needs to finish 30 seconds 
//		driver.manage().window().maximize();
//
//	}
//	
//	@Before(order=1)
//	public void browserSetup1() {
//		System.out.println("browserSetup1");
//	}
//
//	@After(order=-1)  //this Hook will execute AFTER EVERY SCENARIO in the FEATURE
//	public void teardown() {
//		System.out.println("I am inside teardown");
//		driver.close();   // It closes the the browser window on which the focus is set
//		//driver.quit();  //It basically calls driver.dispose method which in turn closes all the browser windows and ends the WebDriver session gracefully
//	}
//
//	@After(order=-2) 
//	public void teardown1() {
//		System.out.println("teardown1");
//	}
//
//	
//	@BeforeStep
//	public static void beforeSteps() {
//		
//		System.out.println(" I am inside before step");
//	}
//	
//	@AfterStep
//	public static void afterSteps() {
//		
//		System.out.println(" I am inside after step");
//	}
//	
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//	   
//	}
//
//	@When("user enters valid username and password")
//	public void user_enters_valid_username_and_password() {
//	    
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//	   
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//	    
//	}
//

}
