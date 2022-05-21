package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;
import genericLib.BaseClass;
import pomPages.CoreJavaForSeleniumPage;
import pomPages.SearchResultPage;
import pomPages.SkillraryLoginPage;

public class TestCase03 extends BaseClass {

	@Test
	public void tc03() throws IOException, InterruptedException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.searchTextBox(p.getPropertyFileData("name"));
		s.searchButton();
		
		SearchResultPage srp = new SearchResultPage(driver);
		srp.corejavaforseleniumSearchResult();
		
		CoreJavaForSeleniumPage cjs = new CoreJavaForSeleniumPage(driver);
		cjs.closeCookiePopup();
		driverutil.switchFrames(driver);
		cjs.playButton();
		Thread.sleep(10000);
		cjs.pauseButton();
		driverutil.switchBackFrame(driver);
		cjs.addToWishlistButton();
		Thread.sleep(5000);
	}
}
