package reflex;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prueba1 {
	static WebDriver driver1;

	@BeforeAll
	static void setURL() {
		driver1 = new FirefoxDriver();
		
	}

	@Test
	void test1() {
		driver1.get("http://localhost:3000/");
//		WebElement usuarioBox = driver1.findElement(By.id("usuario"));        
//        WebElement passwordBox = driver1.findElement(By.id("password"));
//        
//        usuarioBox.sendKeys("Elena1234");
//        passwordBox.sendKeys("Contra1234.");
//        
//        
//        WebElement submitButton = driver1.findElement(By.id("enviar"));
//        submitButton.click();
//        
//        // Resultado esperado: Login Correcto
//        WebElement loginCorrecto = driver1.findElement(By.id("login"));
//        String textoLogin = loginCorrecto.getText();
//        assertEquals("LOGIN CORRECTO", textoLogin);
        
	}


}
