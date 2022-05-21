package testscripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddToCart;
import pomPages.SkillraryDemoPage;
import pomPages.SkillraryLoginPage;

public class TestCase01 extends BaseClass {
	
	@Test
	public void tc01() {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsBtn();
		s.skillraryDemoApp();
		
		SkillraryDemoPage d = new SkillraryDemoPage(driver);
		driverutil.switchTabs(driver);
		driverutil.mouseHover(driver, d.getCoursetab());
		d.seleniumTrainingTab();
		
		AddToCart a = new AddToCart(driver);
		driverutil.doubleClick(driver, a.getAddbtn());
		a.addtocartBtn();
		driverutil.alertPopup(driver);
	}

}
