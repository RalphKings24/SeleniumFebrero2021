package vacaciones;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import comun.Base;

public class PeticionVacaciones extends Base{
	
	public static Logger Logger = Logger.getLogger(PeticionVacaciones.class);
	String path = System.getProperty("user.dir");
	WebDriver driver;
	
	@BeforeTest
	public void leerDatos() {
		
	}
	
	@Test(enabled = true, priority = 1)
	public void pedirVacionesCorrectamente() {
		driver = startWebdriver();
		page.getPage(Login.class).loginError(user, password, mensajeError);
	}
	
}
