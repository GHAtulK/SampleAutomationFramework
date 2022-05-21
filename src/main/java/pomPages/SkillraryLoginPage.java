package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {

	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gearsBtn() {
		gearsbtn.click();
	}
	
	public void skillraryDemoApp() {
		skillrarydemoapp.click();
	}
	
	public void searchTextBox(String name) {
		searchtb.sendKeys(name);
	}
	
	public void searchButton() {
		searchbtn.click();
	}
}
