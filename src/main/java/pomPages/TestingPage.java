package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	@FindBy(xpath = "(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraining;

	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}
	
	@FindBy(id="mycart")
	private WebElement cart;

	public WebElement getCart() {
		return cart;
	}
	
	@FindBy(xpath = "(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookicon;

	public WebElement getFacebookicon() {
		return facebookicon;
	}
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void addToCart() {
		cart.click();
	}

	public void facebook() {
		facebookicon.click();
	}
}
