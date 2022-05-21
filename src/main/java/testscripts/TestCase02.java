package testscripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase02 extends BaseClass {
	
	@Test
	public void tc02() throws IOException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsBtn();
		s.skillraryDemoApp();
		
		SkillraryDemoPage sd = new SkillraryDemoPage(driver);
		driverutil.switchTabs(driver);
		driverutil.dropDown(sd.getCoursedropdown(), p.getPropertyFileData("coursedropdown"));

		TestingPage t = new TestingPage(driver);
		driverutil.dragDrop(driver, t.getSeleniumtraining(), t.getCart());
		Point fb = t.getFacebookicon().getLocation();
		int x = fb.getX();
		int y = fb.getY();
		
		driverutil.scrollBar(driver, x, y);
		t.facebook();
	}

}
