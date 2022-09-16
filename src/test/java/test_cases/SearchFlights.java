package test_cases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.HomePage_Flight;
import pages.PageBase;

public class SearchFlights extends TestBase {

	HomePage_Flight homePage_Flight;

	@Test(priority = 2, groups = "smoke", description = "Search for Flight")
	public void SearchForFlights() throws InterruptedException, AWTException {
		homePage_Flight = new HomePage_Flight(driver);
		homePage_Flight.loginToApplication();
		// take screenshot after successful login
		PageBase.captureScreenshot(driver, "LoginPage");
		// assert if application start correctly
		PageBase.assertToObjectExistWithGetText(driver, "Hi Shady");
	}

}
