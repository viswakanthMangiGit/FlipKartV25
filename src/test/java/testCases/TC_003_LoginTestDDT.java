package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import utilities.DataProviders;

public class TC_003_LoginTestDDT extends BaseClass
{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verify_loginDDT(String email, String password, String exp)
	{
		logger.info("**** Starting TC_003_LoginDDT *****");
		
		try {
	
		//Home page
			HomePage hp=new HomePage(driver);
			hp.clicklnkMyaccount();
			hp.clickLogin(); //Login link under MyAccount
				
			//Login page
			LoginPage lp=new LoginPage(driver);
			lp.setUserName(email);
			lp.setPassword(password);
			lp.clickOnLogin(); //Login button
				
			//My Account Page
			MyAccountPage macc=new MyAccountPage(driver);
			boolean targetPage=macc.isMyAccountPageExists();
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
					macc.clickLogout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
					macc.clickLogout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
		}
			
		logger.info("**** Finished TC_003_LoginDDT *****");
	}

	
}
