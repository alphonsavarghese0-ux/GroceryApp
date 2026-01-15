package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class ManageContactPage 
{
	@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact'])[2]")
	WebElement managecontact;
	@FindBy(xpath="//a[@role='button']")
	WebElement actionclick;
	@FindBy(xpath="//input[@id='phone']")
	WebElement enterphonenumber;
	@FindBy(xpath="//input[@id='email']")
	WebElement entermail;
	@FindBy(xpath="//textarea[@name='address']")
	WebElement enteraddress;
	@FindBy(xpath="//textarea[@name='del_time']")
	WebElement deliverytime;
	@FindBy(xpath="//input[@id='del_limit']")
	WebElement chargelimit;
	@FindBy (xpath="//button[@name='Update']")
	WebElement update;
	
	public WebDriver driver;
	PageUtilities pageutilities= new PageUtilities();
	
	public ManageContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectManageContact(WebDriver driver2)
	{
		managecontact.click();
		//pageutilities.click(driver2, managecontact);
	}
	
	public void clickAction()
	{
		actionclick.click();
	}
	public void enterThePhoneNumber(String phone)
	{
		enterphonenumber.clear();
		enterphonenumber.sendKeys(phone);
	}
	
	public void enterTheEmail(String mail)
	{
		entermail.clear();
		entermail.sendKeys(mail);
	}
	
	public void enterTheAdress(String address)
	{
		enteraddress.clear();
		enteraddress.sendKeys(address);
	}
	
	public void enterTheDeliveryTime(String time)
	{
		deliverytime.clear();
		deliverytime.sendKeys(time);
	}
	public void enterTheChargeLimit(String limit)
	{
		chargelimit.clear();
		chargelimit.sendKeys(limit);
	}
	public void clickUpdate()
	{
		update.click();
	}

}
