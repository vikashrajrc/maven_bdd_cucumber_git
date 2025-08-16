package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(id = "user-name")
	WebElement txt_username;

	@FindBy(id = "password")
	WebElement txt_password;

	@FindBy(id = "login-button")
	WebElement btn_login;

	@FindBy(className = "product_label")
	WebElement lbl_status;

	public void enterUsername(String u) {
		txt_username.sendKeys(u);
	}

	public void enterPassword(String p) {
		txt_password.sendKeys(p);
	}

	public void clickLoginBtn() {
		btn_login.click();
	}

	public boolean verifyLoginSuccess() {
		return lbl_status.isDisplayed();
	}

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
