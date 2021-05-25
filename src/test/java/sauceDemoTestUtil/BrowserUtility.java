package sauceDemoTestUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {
	public static WebDriver driver;
	//Method name - camel.
	public static void initWebDriver(String browserName) {
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			//Set the proxy URL
			//WebDriverManager.chromedriver().proxy(proxy)
			driver = new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			//Set the proxy URL
			//WebDriverManager.chromedriver().proxy(proxy)
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//return driver;
	}

}
