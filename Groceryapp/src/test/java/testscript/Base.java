package testscript;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import constant.Constant;



public class Base 
{
	public WebDriver driver;
	FileInputStream fileinputstream;
	Properties properties;
	@BeforeMethod
	public void initializebrowser()
	
	{
		try
		{
			properties=new Properties();
			fileinputstream=new FileInputStream(Constant.FILEINPUTSTREAM);
			properties.load(fileinputstream);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		driver = new ChromeDriver();
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
	}

	// @AfterMethod
	public void closebrowser() {
		// driver.close();
		driver.quit();
	}

	}
	


