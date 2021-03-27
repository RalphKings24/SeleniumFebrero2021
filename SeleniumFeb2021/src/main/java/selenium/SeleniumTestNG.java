package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import comun.LeerProperties;

public class SeleniumTestNG {
	
	static LeerProperties prop = new LeerProperties();
	static WebDriver driver;
	static String path = System.getProperty("user.dir");
	
	@BeforeTest
	public void startWebDriver() {
		
	}

}
