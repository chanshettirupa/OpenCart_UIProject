package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import TestBase.BaseClass;

public class TC02_LoginTest extends BaseClass{
	
	@Test
	public void verifyLogin() {
		logger.info("***************Login Functionality**************");
		
		try {
			
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickOnLogin();
			
			LoginPage lp= new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			
			MyAccountPage myAc = new MyAccountPage(driver);
			boolean result=myAc.isMyaccountPageExist();
			Assert.assertTrue(result);
		}
		catch(Exception e) {
			Assert.fail();
		}
		
		logger.info("***************Login Functionality End**************");
	}

}
