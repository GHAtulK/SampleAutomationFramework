package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoPage {

	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	public SkillraryDemoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void seleniumTrainingTab() {
		seleniumtraining.click();
	}

	//Getters method as we are doing mouse hover on course tab
	public WebElement getCoursetab() {
		return coursetab;
	}
	
	@FindBy(name="addresstype")
	private WebElement coursedropdown;

	public WebElement getCoursedropdown() {
		return coursedropdown;
	}
	
}
