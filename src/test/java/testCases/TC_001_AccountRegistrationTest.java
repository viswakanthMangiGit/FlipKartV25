package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import pageObject.HomePage;
import pageObject.RegisterPage;

public class TC_001_AccountRegistrationTest extends BaseClass
{
	@Test(groups= {"Regression","Master"})
	public void verify_account_registration() 
	{
		logger.info("********HomePage Test Started**********");
		try {
		HomePage hp=new HomePage(driver);
		hp.clicklnkMyaccount();
		hp.clicklnkRegister();
		
		//Register 
		logger.info("********RegisterPage Test Started**********");
		
		RegisterPage rp=new RegisterPage(driver);
		rp.setFirstname(randomeString());
		rp.setLastname(randomeString());
		rp.setEmail(randomeString()+"@gmail.com");
		rp.setTelephone(randomeNumber());
		String passw=randomAlphaNumeric();
		rp.setPassword(passw);
		rp.setConfirmPassword(passw);
		rp.checkPolicy();
		rp.clickContinue();
		String confmsg=rp.getConfirmationMsg();
		if(confmsg.equals("Your Account Has Been Created!")) 
		{
			Assert.assertTrue(true);
			
		}
		else 
		{
			logger.error("Failed test");
			logger.debug("Test Debug");
			Assert.assertTrue(false);
		}
		//Assert.assertEquals(confmsg, "Your Account Has Been Created!!");
		}
		catch(Exception e) 
		{
			Assert.fail();
			
		}
		
		
	}

	

}
