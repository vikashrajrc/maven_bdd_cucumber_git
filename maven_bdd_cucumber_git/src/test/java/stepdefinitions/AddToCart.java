package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AddToCartPage;
import pageobjects.LoginPage;

public class AddToCart {

	ChromeOptions options = new ChromeOptions();

	WebDriver driver = new ChromeDriver(options);

	AddToCartPage addtocartpage = new AddToCartPage(driver);

	LoginPage loginpage = new LoginPage(driver);

	@Given("User is logged into saucedemo app with valid creds {string} and {string}")
	public void user_is_logged_into_saucedemo_app_with_valid_creds_and(String user, String pass) {

		driver.get("https://www.saucedemo.com/v1/");
		loginpage.enterUsername(user);
		loginpage.enterPassword(pass);
		loginpage.clickLoginBtn();

	}

	@Given("User is on the dashboard page")
	public void user_is_on_the_dashboard_page() {

		loginpage.verifyLoginSuccess();
	}

	@When("User click on the Add to Cart button for any item")
	public void user_click_on_the_add_to_cart_button_for_any_item() {
		addtocartpage.clickAddToCartBtn();

	}

	@Then("Verify that item should be added to the cart successfully")
	public void verify_that_item_should_be_added_to_the_cart_successfully() {

		Assert.assertTrue(addtocartpage.verifyBadge());

		Assert.assertTrue(addtocartpage.verifyRemoveBtn());
	}

	@Then("Close the browser")
	public void close_the_browser() {
		driver.quit();
	}

}
