package sauceDemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// instead of findelement.by.id. use annotation.
	//public - to be used in other classes
	@FindBy(id = "user-name")
	public WebElement userName;
	
	//identify x path using annotation
	@FindBy(id = "password")
	public WebElement password;

	@FindBy(id = "login-button")
	public WebElement loginButton;
	
	//Constructor
	
	public LoginPage(WebDriver driver) {
		//Init all values
		PageFactory.initElements(driver, this);
	}

}
