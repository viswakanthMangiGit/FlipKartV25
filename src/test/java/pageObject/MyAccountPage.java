package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyAccountPage extends BasePage
{
	//Constructor
public MyAccountPage(WebDriver driver) {
		super(driver);
		
	}


	
//locator
	
	@FindBy(xpath="//div/h2[.='My Account']") 
	WebElement msgMyAccoutn;
	
	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	WebElement lnkLogout;
	
	

	//Action Methods
	
	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try {
			return (msgMyAccoutn.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

	public void clickLogout() {
		lnkLogout.click();

	}
 
}
