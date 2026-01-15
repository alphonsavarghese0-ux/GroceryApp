package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtilities {
private WebDriver driver;
public void selectByVisibleText(WebElement element, String visibleText) 
{
			Select select = new Select(element);
			select.selectByVisibleText(visibleText);
		}

public void click(WebDriver driver, WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", element);

}

}
