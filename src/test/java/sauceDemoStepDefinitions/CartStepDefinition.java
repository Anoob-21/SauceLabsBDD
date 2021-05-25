package sauceDemoStepDefinitions;

import io.cucumber.java.en.And;
import sauceDemoPages.CartPage;
import sauceDemoPages.LoginPage;
import sauceDemoTestUtil.BrowserUtility;

public class CartStepDefinition {
	
	@And("click on checkout") 
	public void cartCheckOut() {
		CartPage page = new CartPage(BrowserUtility.driver);
		page.checkOut.click();
		
		
	}

}
