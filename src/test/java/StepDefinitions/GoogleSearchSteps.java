package StepDefinitions;

//import java.io.File;
//import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxBinary;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

//	WebDriver driver = null;   //import the library for Webdriver
	 

//	@Given("Browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside Step-Browser is open");
//		
//		//firefox working
////		System.setProperty("webdriver.firefox.bin",
////                "C:/Users/Christina.Cruz/AppData/Local/Mozilla Firefox/firefox.exe");
////		System.setProperty("webdriver.gecko.driver",
////				"C:/Users/Christina.Cruz/eclipse-workspace/CucumberJava/src/test/resources/drivers/geckodriver.exe");
////		driver = new FirefoxDriver();
//		
//		//edge working
//		String projectPath = System.getProperty("user.dir");  //to access CucumberJava project even it has been open in different paths
//		System.out.println("Project path is: " +projectPath);
//		System.setProperty("webdriver.edge.driver",
//				projectPath+"/src/test/resources/drivers/msedgedriver.exe");
//		
//		driver = new EdgeDriver();
//	
//		//chrome
//		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christina.Cruz\\eclipse-workspace\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
//		//driver = new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		
//	}
//
//	@Given("User is on Google Search page")
//	public void user_is_on_Google_Search_page() {
//		System.out.println("Inside step-User is on google search page");
//		
//		driver.navigate().to("https://www.google.com/");
//	}
//
//	@When("User enters a text in the search box")
//	public void user_enters_a_text_in_the_search_box() throws InterruptedException {
//		System.out.println("Inside step-user enters a text in search box");
//
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//		
//		Thread.sleep(2000);
//	}
//
//	@When("click Enter")
//	public void click_Enter() throws InterruptedException {
//		System.out.println("Inside step- hits enter ");
//		
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		
//		Thread.sleep(2000);
//	}
//
//	@Then("User is navigated to Search Results")
//	public void user_is_navigated_to_Search_Results() {
//		System.out.println("User is navigated to search results");
//		
//		driver.getPageSource().contains("Online Courses");
//	//	driver.close();
//	//	driver.quit();
//	}


}
