package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage

{
	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;
	@FindBy(xpath = "//div[contains@class,'alert-dismissible']")
	WebElement alert;

	public WebDriver driver;
	WaitUtility waitutility = new WaitUtility();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterTheUserName(String username2) {
		username.sendKeys(username2);
	}

	public void enterThePassWord(String password2) {
		password.sendKeys(password2);
	}

	public void buttonClick() {
		// waitutility.WaitForElement(driver, signin);
		signin.click();
	}

}
