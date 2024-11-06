package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsTest {
	
	WebDriver driver;
	loginpage login;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C://Work/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//System.out.println("in login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		
		login = new loginpage(driver);
		login.enterUsername();
		login.enterPassword();
	}

	@And("Clicks on Login button")
	public void clicks_on_login_button() {
		login.clickLogin();
	}

	@Then("user navigated to home page")
	public void user_navigated_to_home_page() {
	}

}
