package selenium;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import comun.LeerProperties;

public class SeleniumTest {
public static Logger log = Logger.getLogger(SeleniumTest.class);
static LeerProperties prop = new LeerProperties();
static WebDriver driver;
static String path = System.getProperty("user.dir");

	public static void main(String[] args) {
		// El código de abajo, va y busca la ruta de chromedriver 
		//   C:\\Git\\SeleniumFebrero2021\\SeleniumFeb2021 +  \\chromedriver\\chromedriver.exe
//		String rutaChrome = System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe";
//		
//		System.setProperty("webdriver.chrome.driver", rutaChrome);  //¿Qué browser vamos a usar?
//		
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--start-maximized");
//		option.addArguments("--incognito");
//		
//		WebDriver driver = new ChromeDriver(option);
////		driver.manage().window().maximize();
//		
//		//Un "implicitWait" nos sirve para demorar la ejecución
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
//		
		
		
//		>>> "Forma para abrir los 3 browser:"		
		prop.getSystemProperties();
		
		String url = System.getProperty("URL");
		
		//driver.get(url);
		driver = startDriver(url); 
		
		WebElement txt_usernameById = driver.findElement(By.id("txtUsername")); //Locator byId.
		txt_usernameById.sendKeys("Admin");
		
		WebElement txt_usernamebyName = driver.findElement(By.name("txtUsername")); //Locator byName.
		WebElement txt_usernameByXpath = driver.findElement(By.xpath("//input[@name='txtUsername']")); //Locator by XPath
		WebElement txt_usernameByCSS = driver.findElement(By.cssSelector("input[name = 'txtPassword']"));  //Locator byCSS 
		
		WebElement txt_passwordCSS = driver.findElement(By.cssSelector("input#txtUsername"));
		WebElement link_forgotpasswordLinkText = driver.findElement(By.linkText("Forgot your password?")); //Locator bylinkText


		WebElement txt_password = driver.findElement(By.id("txtPassword"));
		txt_password.sendKeys("admin123");
		
		
		WebElement btn_login = driver.findElement(By.id("btnLogin")); //Encuntra el botón login
		btn_login.click(); //Click en botón login
				
		log.info("Todo fue exitoso!");
		
		try {
			WebElement link_welcome = driver.findElement(By.xpath("//a[@id='welcome']"));
			
			if(link_welcome.getSize()!=null) {
				System.out.println("El login fue exitoso");
			}
			
		}catch(NoSuchElementException e){
			System.out.println("El login no fue exitoso.");
		}
		

	}//main
	
	//>>> Obtener un nombre Random:
	//public static String randomName() {
		//String[] people = new String[] {"Sergio", "Ivan", "Julio", "Alberto", "Edna", "Carlos"	
		//};
	//}
	
	public static WebDriver startDriver(String url) {
		try {
		
		prop.getSystemProperties();
		String browser = System.getProperty("BROWSER");
		
		switch(browser) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", path + "\\chromedriver\\chromedriver.exe");			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--start-maximized");
			option.addArguments("--incognito");
			driver = new ChromeDriver(option);
			driver.get(url);
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", path + "\\firefoxdriver\\geckodriver.exe"); //NOTA: Descargar el driver "gecko"
			FirefoxOptions foption = new FirefoxOptions();
			foption.addArguments("--start-maximized");
			foption.addArguments("--incognito");
			driver = new FirefoxDriver(foption);
			driver.get(url);
			break;
			
		case "edge":
			System.setProperty("webdriver.edge.driver", path + "\\edgedriver\\msedgedriver.exe"); //NOTA: Descargar el driver "edge"
			EdgeOptions eoption = new EdgeOptions();
			eoption.addArguments("--start-maximized");
			eoption.addArguments("--incognito");
			driver = new EdgeDriver(eoption);
			driver.get(url);
			break;
			
		default: System.out.println("El driver [" + browser + "] no esta configurado para funcionar en este proyecto");
			
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("El driver no puede ser inicializado");
		}
		return driver;
	};//Fin método "startDriver"

}//class
