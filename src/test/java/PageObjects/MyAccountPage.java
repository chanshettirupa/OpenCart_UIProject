package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement HeadingMsg;
	
	public boolean isMyaccountPageExist() {
		try {
			
			return (HeadingMsg.isDisplayed());
		}
		catch(Exception e) {
			return false;
		}
		
	}

}
