package sauceDemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	@FindBy(id = "checkout")
	public WebElement checkOut;
	
	
	public CartPage(WebDriver driver) {
		// Init all values
		PageFactory.initElements(driver, this);
	}

}
