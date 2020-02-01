package revisagoogle;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Google {
	String url;
	WebDriver driver;
	

	@Before
	public void Inicar () {
		url = "https://www.google.com.br";	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DIVA\\eclipse-workspace\\RevisaGoogle\\Drivers\\Chrome\\79\\chromedriver.exe");
		driver =new ChromeDriver();
	}

	@After
	public void Finazizar () {
		driver.quit();
			
	}
	
	@Given("^que acesso o site do Google$")
	public void que_acesso_o_site_do_Google() throws Throwable {
		driver.get(url);
	   	}

	@When("^pesquiso por \"([^\"]*)\"$")
	public void pesquiso_por(String termo) throws Throwable {
	  driver.findElement(By.name("q")).sendKeys(termo + Keys.ENTER); 
	}

	@Then("^exibi no titulo da aba \"([^\"]*)\"$")
	public void exibi_no_titulo_da_aba(String resultado) throws Throwable {
	  assertEquals(resultado,driver.getTitle());  
	}


}
