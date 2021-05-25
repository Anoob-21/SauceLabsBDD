package sauceDemoStepDefinitions;

import io.cucumber.java.en.And;
import sauceDemoPages.CheckoutPage;
import sauceDemoPages.LoginPage;
import sauceDemoTestUtil.BrowserUtility;

public class CheckoutStepDef {

	@And("i Enter FirstName,LastName,ZipCode") 
	public void checkOut() {
		CheckoutPage page = new CheckoutPage(BrowserUtility.driver);
		page.firstName.sendKeys("TFname");
		page.lastName.sendKeys("TLname");
		page.postCode.sendKeys("Tpostcode");
		
	}
}
