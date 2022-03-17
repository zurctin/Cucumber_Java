package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//default access modifier/no keyword, VISIBLE TO ANY OTHER CLASS IN THE SAME PACKAGE.

public class LoginPage {
//public is a java access modifier, VISIBLE TO THE WORLD.
//Any class, methods, constructors, interfaces etc., declared as public can be access in any other class.
//Note: If public class needs to be access is in different package, IMPORT is necessary.
//Note: MAIN FUNCTION should always be set to PUBLIC.
	
//	protected WebDriver driver;
//	//protected is a java access modifier, VISIBLE TO 'pageobjectmodel' PACKAGE AND ALL SUBCLASSES in OTHER PACKAGE like 'LoginDemoSteps_POM' where it is used.
//	
//	//private is a java access modifier, VISIBLE IN CLASS ONLY where it is declared.
//	//Note: CLASS and INTERFACE CANNOT be set to PRIVATE
//	//Note: Variables declared as private can be access outside the class,
//	//if public getter method are present in the class.
//	//public getter method returns the value of the variable
//	//public setter method sets the value of the variable.
//	
//	//identifiers
//	private By txt_username = By.id("name");         //By variable name = By.attribute("selector value");
//	private By txt_password = By.id("password");
//	private By btn_login = By.id("login");
//	private By btn_logout = By.id("logout");
//	
//	//parameterized constructor
//	public LoginPage(WebDriver driver) {
//		
//		this.driver = driver;  //use 'this' library to call the global driver declared in the class above
//		
//		if(!driver.getTitle().equals("TestProject Demo")) {		//validation if the page is correct
//			
//			throw new IllegalStateException("This is not Login Page. The current page is"
//			+ driver.getCurrentUrl());
//		}
//	}
//	
//	//methods
//	public void enterUsername(String username) {
//		
//		driver.findElement(txt_username).sendKeys(username);
//	}
//	
//	public void enterPassword(String password) {
//		
//		driver.findElement(txt_password).sendKeys(password);
//	}
//	
//	public void clickLogin() {
//		
//		driver.findElement(btn_login).click();
//	}
//	
//	public void checkLogOutIsDisplayed() {
//		
//		driver.findElement(btn_logout).isDisplayed();
//	}
//
//	//LoginFunction
//	public void loginValidUser(String username, String password) {
//		
//		driver.findElement(txt_username).sendKeys(username);
//		driver.findElement(txt_password).sendKeys(password);
//		driver.findElement(btn_login).click();
//	}
}

