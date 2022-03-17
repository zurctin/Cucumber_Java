package pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PageFactory {
	
//	//locator of ALL OBJECTS in the page using @FindBy
//	@FindBy(id = "name")
//	@CacheLookup  //for 
//	WebElement txt_username;
//	
//	@FindBy(id = "password")
//	WebElement txt_password;
//	
//	@FindBy(id = "login")
//	WebElement btn_login;
//
//	@FindBy(partialLinkText = "Tin")
//	List<WebElement> myLinks;
//	
//	@FindBy(how = How.ID, using = "name")
//	WebElement abc;
//	
//	WebDriver driver;
//	
//	//constructor
//	public LoginPage_PageFactory(WebDriver driver) {
//		
//		this.driver = driver;  //this.driver gets the value in L19, equals to driver gets the value in driver parameter in L22
//		//PageFactory.initElements(driver, this); //Whenever this constructor is called, all the declared locators above will be called. 
//		
//		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30); //timeout in SECONDS for a WebElement can be assigned to the Object page class
//		PageFactory.initElements(factory, this);
//		//The above code will wait for maximum of 30 seconds until the elements specified by annotations is loaded. 
//		//If the element is not found in the given time interval, it will throw ‘NoSuchElementException' exception.
//	}
//	
//	//methods/actions of all objects
//	public void enterUsername(String username) {
//		
//		txt_username.sendKeys(username);
//	}
//	
//	public void enterPassword(String password) {
//		
//		txt_password.sendKeys(password);
//	}
//	
//	public void clickLogin() {
//		
//		btn_login.click();
//	}


}
