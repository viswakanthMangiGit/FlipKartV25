package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Locators
//Action Methods

public class HomePage extends BasePage
{
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		super(driver);
		
	}
	//Locators
	@FindBy(xpath="//span[normalize-space()='My Account']") 
	WebElement lnkMyaccount;
	

@FindBy(xpath="//span[normalize-space()='My Account']") 
 WebElement myAccount;
@FindBy(xpath="//a[normalize-space()='Register']") 
WebElement lnkRegister;

@FindBy(xpath="//a[normalize-space()='Login']") 
WebElement lnklogin;


//Action Methods
public void clicklnkMyaccount() 
{
	lnkMyaccount.click();
}
public void clicklnkRegister() 
{
	lnkRegister.click();
}
public void clickLogin() {
	lnklogin.click();
}
	
}