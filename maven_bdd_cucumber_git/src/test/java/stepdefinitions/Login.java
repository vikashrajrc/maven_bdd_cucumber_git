package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;

public class Login {

	ChromeOptions options = new ChromeOptions();

	WebDriver driver = new ChromeDriver(options);

	LoginPage loginpage = new LoginPage(driver);

	@Given("User is on sauce demo login page")
	public void user_is_on_sauce_demo_login_page() {
		driver.get("https://www.saucedemo.com/v1/");
	}

	@When("User enters valid credentials with {string} and {string}")
	public void user_enters_valid_credentials_with_and(String username, String password) {
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		loginpage.clickLoginBtn();
	}

	@Then("User should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
		Assert.assertTrue(loginpage.verifyLoginSuccess());
		driver.quit();
	}

}
