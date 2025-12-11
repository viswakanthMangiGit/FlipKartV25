package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	//WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	//locators
	@FindBy(xpath="//input[@id='input-email']") 
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@id='input-password']") 
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement linkLogin;
	
	//Action Methods
	
	public void setUserName(String user) 
	{
		txtUserName.sendKeys(user);
	}
	public void setPassword(String pwd) 
	{
		txtPassword.sendKeys(pwd);
	}
	public void clickOnLogin() 
	{
		linkLogin.click();
	}
	
}
