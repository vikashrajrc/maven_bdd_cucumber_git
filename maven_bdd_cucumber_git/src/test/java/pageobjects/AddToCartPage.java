package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	WebDriver driver;

	@FindBy(xpath = "//div[@class='inventory_list']//div[1]//div[3]//button[1]")
	WebElement btn_addToCart;

	@FindBy(xpath = "//span[@class='fa-layers-counter shopping_cart_badge']")
	WebElement badge_addToCart;

	@FindBy(xpath = "//button[normalize-space()='REMOVE']")
	WebElement btn_remove;

	public void clickAddToCartBtn() {
		btn_addToCart.click();
	}

	public boolean verifyBadge() {
		return badge_addToCart.isDisplayed();
	}

	public boolean verifyRemoveBtn() {
		return btn_remove.isDisplayed();
	}

	public AddToCartPage(WebDriver driver) {
		
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

}
