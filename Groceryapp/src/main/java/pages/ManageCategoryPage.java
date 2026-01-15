package pages;

import java.lang.invoke.ConstantBootstraps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtilities;
import utilities.PageUtilities;

public class ManageCategoryPage 
{
@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category'])[2]")
WebElement managecategory;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Category/add']")
WebElement newbutton;
@FindBy(xpath="//input[@id='category']")
WebElement entercategory;
@FindBy(xpath="//input[@type='file']")
WebElement file;

public WebDriver driver;
PageUtilities pageutilities= new PageUtilities();
FileUploadUtilities fileuploadutilities=new FileUploadUtilities();

public ManageCategoryPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void selectManageCategory()
{
	managecategory.click();
}

public void selectNewButton()
{
	newbutton.click();
}
public void enterTheCategory(String item)
{
	entercategory.sendKeys(item);
}
public void chooseFile()
{
	fileuploadutilities.fileUploadUsingSendKeys(file,Constant.CARROTIMAGE);
}

}
