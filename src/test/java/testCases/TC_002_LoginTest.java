package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;

public class TC_002_LoginTest extends BaseClass
{
	@Test(groups= {"Sanity","Master"})
	public void veryLogin() 
	{
		logger.info("************TC_002_Login started*********");
		HomePage hp=new HomePage(driver);
		hp.clicklnkMyaccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(p.getProperty("userName"));
		lp.setPassword(p.getProperty("password"));
		lp.clickOnLogin();
		
		MyAccountPage ap=new MyAccountPage(driver);
boolean targetPage=ap.isMyAccountPageExists();
		try {
		Assert.assertEquals(targetPage, true,"Login failed");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("**** Finished TC_002_LoginTest  ****");

		


	}
	
	
	
}
