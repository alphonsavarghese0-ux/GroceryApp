package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base
{
@Test
	public void VerifyUserIsAbleToEnterContact() throws IOException
	{
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassWord(password);
		loginpage.buttonClick();
		
		//String phone=ExcelUtility.getStringData(1, 0, "Contact");
		//String mail=ExcelUtility.getStringData(1, 1, "Contact");
		//String address=ExcelUtility.getStringData(1, 2, "Contact");
		//String time=ExcelUtility.getStringData(1, 3, "Contact");
		//String limit=ExcelUtility.getStringData(1, 4, "Contact");
		String phone="9876";
		String mail="xyzx@gmail.com";
		String address="btnbtb";
		String time="4PM";
		String limit="65";
		
		ManageContactPage managecontactpage=new ManageContactPage(driver);
		
		managecontactpage.selectManageContact(driver);
		managecontactpage.clickAction();
		managecontactpage.enterThePhoneNumber(phone);
		managecontactpage.enterTheEmail(mail);
		managecontactpage.enterTheAdress(address);
		managecontactpage.enterTheDeliveryTime(time);
		managecontactpage.enterTheChargeLimit(limit);
		managecontactpage.clickUpdate();
	}
}
