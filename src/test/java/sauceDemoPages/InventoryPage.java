package sauceDemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	public WebElement addToCart;
	
	@FindBy(className = "shopping_cart_link")
	public WebElement cartLogo;

	public InventoryPage(WebDriver driver) {
		// Init all values
		PageFactory.initElements(driver, this);
	}

}
