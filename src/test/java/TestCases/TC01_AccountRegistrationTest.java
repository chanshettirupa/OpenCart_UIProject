package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.Account_Registration;
import PageObjects.HomePage;
import TestBase.BaseClass;

public class TC01_AccountRegistrationTest extends BaseClass{
	
	public WebDriver driver;

	@Test
	public void verify_account_registration() {
		
		try {
			logger.info("*********** Straing Test Case ************");
			
			HomePage homeobj = new HomePage(driver);
			homeobj.clickMyAccount();
			homeobj.clickOnRegister();
			logger.info("Home Page");
			
			Account_Registration accobj = new Account_Registration(driver);
			accobj.setFirstName("Abc");
			accobj.setLasttName("Xyz");
			accobj.setEmail("Abc1@gmail.com");
			accobj.setPassword("pass@123");
			accobj.agreeBtn();
			accobj.continueBtn();
			logger.info("Registraion Page");
			
			String msg = accobj.getConformationMsg();
			Assert.assertEquals(msg,"Your Account Has Been Created!");
		}
		catch(Exception e) {
			logger.error("Test Failed...");
			logger.debug("Debug the logs");
			//Assert.fail();
		}
	}
}
