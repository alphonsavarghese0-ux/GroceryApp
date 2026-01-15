package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base

{
	@Test
	public void alertPresent() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 0, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassWord(password);
		loginpage.buttonClick();

		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.moreInfo();
		managenewspage.newButtonClick();
		managenewspage.enterTheNews("Vaccancies Available");
		managenewspage.clickSaveButton();
		boolean bool = managenewspage.checkAlert();
		Assert.assertTrue(bool, "Alert is not available");

	}

}
