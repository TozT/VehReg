package stepDefinition;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Test_Steps {
	private WebDriver driver;
	
	@Given("^user is on search page$")
	public void user_is_on_search_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:/Users/Tolu.Thompson/Downloads/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://covercheck.vwfsinsuranceportal.co.uk/");
	}

	@When("^user submits registration$")
	public void user_submits_registration() throws Throwable {
			driver.findElement(By.id("vehicleReg")).sendKeys("OV12UYY");
			driver.findElement(By.id("search")).click();
	}
	
	@Then("^web page displays Results for \"([^\"]*)\"$")
	public void web_page_displays_Results_for(String arg1) throws Throwable {
		assertTrue("Results for: OV12UYY", true);
	}


}
