package sauceDemoStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import sauceDemoPages.InventoryPage;
import sauceDemoTestUtil.BrowserUtility;

//When i click on Add to cart on Sauce Labs Backpack
//And click on yourcart logo
public class InventoryStepDef {
    @When("i click on Add to cart on Sauce Labs Backpack")
	public void loadInventory() {
		InventoryPage page = new InventoryPage(BrowserUtility.driver);
		page.addToCart.click();
		
	}
    @And("click on yourcart logo")
	public void clickOnCart() {
		InventoryPage page = new InventoryPage(BrowserUtility.driver);
		page.cartLogo.click();
	}
}
