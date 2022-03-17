package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePage_PageFactory;
import pagefactory.LoginPage_PageFactory;

public class LoginDemoSteps_PageFactory {

//	WebDriver driver = null;
//	LoginPage_PageFactory login;
//	HomePage_PageFactory home;
//	
//	@Given("Browser is Open")
//	public void browser_is_Open() {
//		
//		System.out.println("I am inside LoginDemoSteps_PageFactory class ");
//		System.out.println("Inside step -Browser is open");
//		
//		//firefox working
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
////		//edge working
////		String projectPath = System.getProperty("user.dir");  //to access CucumberJava project even it has been open in different paths
////		System.out.println("Project path is: " +projectPath);
////		System.setProperty("webdriver.edge.driver",
////				projectPath+"/src/test/resources/drivers/msedgedriver.exe");
////		
////		driver = new EdgeDriver();
//	
//		//chrome
//		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christina.Cruz\\eclipse-workspace\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver.exe");
//		//driver = new ChromeDriver();
//
////		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
////		driver.manage().window().maximize();
//
//	}
//
//	@And("User is on login page")
//	public void user_is_on_login_page() {
//		
//		driver.navigate().to("https://example.testproject.io/web/");
//
//	}
//
//	@When("^User enters (.*) and (.*)") //if parameterized, put ^ to avoid error regarding 0 gherkin step,
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException{
//		
//		login = new LoginPage_PageFactory(driver);
//		
//		login.enterUsername(username);
//		login.enterPassword(password);
//		
//		//driver.findElement(By.id("name")).sendKeys(username);
//		//driver.findElement(By.id("password")).sendKeys(password);
//		
//		Thread.sleep(2000);  //2000ms = 2sec, this is to pause for 2sec before executing the next step 
//
//	}
//	
//	@And("User clicks on login")
//	public void user_clicks_on_login() {
//
//		login.clickLogin();
//		//driver.findElement(By.id("login")).click();
//		
//	}
//
//	@Then("User is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//		home = new HomePage_PageFactory(driver);
//		
//		home.checkLogoutIsDisplayed();
//		//driver.findElement(By.id("logout")).isDisplayed();
//	
//		Thread.sleep(2000);
//		driver.quit();  //driver.close causes error
//	}
	
}
