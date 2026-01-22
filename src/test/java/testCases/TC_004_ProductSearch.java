package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import pageObject.HomePage;
import pageObject.SearchPage;

public class TC_004_ProductSearch extends BaseClass
{
	@Test(groups= {"Master"})
	public void verify_pruductSearch()  {
		logger.info(" Starting TC_004_SearchProductTest ");

		try {
			
			HomePage hm=new HomePage(driver);
			
			//hm.enterProductName("iPhone");
			hm.enterProductName("mac");
			
			hm.clickSearch();
			
			SearchPage sp=new SearchPage(driver);
			sp.isProductExist("MacBook");

			Assert.assertEquals(sp.isProductExist("MacBook"),true);

		} catch (Exception e) {
			Assert.fail();
		}

		logger.info(" Finished TC_004_SearchProductTest ");
		//Hai 
		//Hello
		//Hai
		//hello

	}

}
