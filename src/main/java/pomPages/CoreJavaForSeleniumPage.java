package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPage {

	@FindBy(xpath="//a[text()='X']")
	private WebElement closecookiepopup;
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playicon;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pauseicon;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlist;
	
	public CoreJavaForSeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void closeCookiePopup() {
		closecookiepopup.click();
	}
	
	public void playButton() {
		playicon.click();
	}
	
	public void pauseButton() {
		pauseicon.click();
	}
	
	public void addToWishlistButton() {
		addtowishlist.click();
	}
	
	
}
