package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;
import utilities.WaitUtility;

public class LogoutPage {
	@FindBy(xpath = "//a[@class='nav-link' and @data-toggle='dropdown']")
	WebElement adminclick;
	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/logout'])[1]")
	WebElement logout;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signintextcheck;
	public WebDriver driver;

	PageUtilities pageutilities = new PageUtilities();
	WaitUtility waitutility = new WaitUtility();

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectAdmin() {
		waitutility.waitForElementToBeClickable(driver, adminclick);
		adminclick.click();
	}

	public void clickLogout() {
		waitutility.waitForElementToBeClickable(driver, logout);
		pageutilities.click(driver, logout);
	}

	public Boolean signinIsPresent() {
		return signintextcheck.isDisplayed();

	}

}
