package sauceDemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	// instead of findelement.by.id. use annotation.
		//public - to be used in other classes
		@FindBy(id = "first-name")
		public WebElement firstName;
		
		//identify x path using annotation
		@FindBy(id = "last-name")
		public WebElement lastName;

		@FindBy(id = "postal-code")
		public WebElement postCode;
		
		//Constructor
		
		public CheckoutPage(WebDriver driver) {
			//Init all values
			PageFactory.initElements(driver, this);
		}

}
