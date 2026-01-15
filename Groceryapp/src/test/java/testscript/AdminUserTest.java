package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base
{
	@Test
public void adminUser() throws IOException
{
	String username = ExcelUtility.getStringData(1, 0, "LoginPage");
	String password = ExcelUtility.getStringData(1, 1, "LoginPage");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterTheUserName(username);
	loginpage.enterThePassWord(password);
	loginpage.buttonClick();
	
	//String username1=ExcelUtility.getStringData(1,0,"AdminUser");
	//String password2=ExcelUtility.getStringData(1,1,"AdminUser");
	//String usertype=ExcelUtility.getStringData(1,2,"AdminUser");
	String username1="fabindia";
	String password2="fabindia";
	String usertype="Admin";
	
	AdminUserPage adminuserpage=new AdminUserPage(driver);
	adminuserpage.clickAdminUser();
	adminuserpage.clickNew();
	adminuserpage.enterUserName(username1);
	adminuserpage.enterPassWord(password2);
	adminuserpage.selectUserType(usertype);
	adminuserpage.saveButtonClick();
	boolean bool=adminuserpage.alertCheck();
	Assert.assertTrue(bool, "User not created sucessfully");
	
}
}
