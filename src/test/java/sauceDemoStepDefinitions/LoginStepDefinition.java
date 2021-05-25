package sauceDemoStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import sauceDemoPages.LoginPage;
import sauceDemoTestUtil.BrowserUtility;

//And I enter UserName,Password and click on loginButton. 

public class LoginStepDefinition {
	@And("I enter UserName,Password and click on loginButton") 
	public void login() {
		LoginPage page = new LoginPage(BrowserUtility.driver);
		page.userName.sendKeys("standard_user");
		page.password.sendKeys("secret_sauce");
		page.loginButton.click();
		
	}
	//And I enter "<UserName>","<Password>" and click on loginButton
	@And("I enter {string},{string} and click on loginButton") 
	public void loginUsingData(String userName,String password) {
		LoginPage page = new LoginPage(BrowserUtility.driver);
		page.userName.sendKeys(userName);
		page.password.sendKeys(password);
		page.loginButton.click();
		
	}
	
	//Given I open a Chrome Browser and navigate to SauceDemo URL
	//THis should be called only once to init driver. after that use static driver variable to get the driver
	@Given("I open a Chrome Browser and navigate to SauceDemo URL")
	public void openBrowser() {
		BrowserUtility.initWebDriver("Chrome");
	}
	
	@Given("I open a {string} and navigate to SauceDemo URL")
	public void openBrowserUsingTestData(String browserName) {
		BrowserUtility.initWebDriver(browserName);
	}
}
