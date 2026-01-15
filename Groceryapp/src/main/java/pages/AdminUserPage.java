package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtilities;
import utilities.WaitUtility;

public class AdminUserPage 
{
	@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'])[1]")
	WebElement adminuser;
	@FindBy(xpath="//a[@onclick='click_button(1)']")
	WebElement newclick;
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//select[@id='user_type']")
	WebElement usertype;
	@FindBy(xpath="//button[@name='Create']")
	WebElement savebutton;
	@FindBy(xpath="//h5 [text()=' Alert!']")
	WebElement alertmessage;
	
	public WebDriver driver;
	PageUtilities pageutilities = new PageUtilities();
	WaitUtility waitutility=new WaitUtility();
	public AdminUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickAdminUser()
	{
		//itutility.WaitForElement(driver, adminuser);
//dminuser.click();
	pageutilities.click(driver, adminuser);
		
	}
	public void clickNew()
	{
		newclick.click();
	}
	
	public void enterUserName(String username1)
	{
		username.sendKeys(username1);
	}
   public void enterPassWord(String password2)
   {
	   password.sendKeys(password2);
   }
   public void selectUserType(String usertype2)
   {
	//pageutilities.selectByVisibleText(adminuser, usertype2);
	   Select select = new Select(usertype);
		select.selectByVisibleText(usertype2);
	   
   }
   
   public void saveButtonClick()
   {
	   savebutton.click();
   }
   
   public boolean alertCheck() 
   {
		String alert = alertmessage.getText();
		System.out.println(alert);
		return alert.contains("Created alert sucessfully");
   }
}
