package selenium;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import comun.LeerProperties;

public class SeleniumTest {
public static Logger log = Logger.getLogger(SeleniumTest.class);
static LeerProperties prop = new LeerProperties();

	public static void main(String[] args) {
		//El código de abajo, va y busca la ruta de chromedriver
		String rutaChrome = System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", rutaChrome);
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(option);
//		driver.manage().window().maximize();
		
		//Un "implicitWait" nos sirve para demorar la ejecución
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		
		prop.getSystemProperties();
		
		String url = System.getProperty("URL");
		
		driver.get(url);
		
		WebElement txt_usernameById = driver.findElement(By.id("txtUsername")); //Locator "id" del Username.
		WebElement txt_usernamebyName = driver.findElement(By.name("txtUsername"));
		WebElement txt_usernameByXpath = driver.findElement(By.xpath("//div[@id='divUsername']/input"));
		txt_usernameById.sendKeys("Admin");


		WebElement txt_password = driver.findElement(By.id("txtPassword")); //Locator "password" del Username.
		txt_password.sendKeys("admin123");
		
		WebElement btn_login = driver.findElement(By.id("btnLogin"));
		btn_login.click();
				
		log.info("Todo fue exitoso");
		
		try {
			WebElement link_welcome = driver.findElement(By.xpath("//a[@id='welcome']"));
			
			if(link_welcome.getSize()!=null) {
				System.out.println("El login fue exitoso");
			}
			
		}catch(NoSuchElementException e){
			System.out.println("El login no fue exitoso");
		}
		

	}//main

}//class
