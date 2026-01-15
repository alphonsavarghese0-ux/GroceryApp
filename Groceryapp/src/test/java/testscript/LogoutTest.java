package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {
	@Test
	public void userIsAbleToLogout() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassWord(password);
		loginpage.buttonClick();

		LogoutPage logout = new LogoutPage(driver);
		logout.selectAdmin();
		logout.clickLogout();
		Boolean bool = logout.signinIsPresent();
		Assert.assertTrue(bool, "User is not able to logout");

	}
}
