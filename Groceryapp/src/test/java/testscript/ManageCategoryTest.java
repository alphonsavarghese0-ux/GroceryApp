package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base
{
	@Test
public void verifyUserIsAbleToAddCategory() throws IOException
{
	String username = ExcelUtility.getStringData(1, 0, "LoginPage");
	String password = ExcelUtility.getStringData(1, 1, "LoginPage");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterTheUserName(username);
	loginpage.enterThePassWord(password);
	loginpage.buttonClick();
	
	String item="Vegetables";
	ManageCategoryPage managecategorypage=new ManageCategoryPage(driver);
	managecategorypage.selectManageCategory();
	managecategorypage.selectNewButton();
	managecategorypage.enterTheCategory(item);
	managecategorypage.chooseFile();
}
}
