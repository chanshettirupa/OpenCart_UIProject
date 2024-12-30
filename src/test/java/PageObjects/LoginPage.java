package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
	}

	@FindBy(xpath="//input[@name='email']")
	WebElement emailTxt;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwdTxt;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginBtn;
	
	public void setEmail(String email) {
		emailTxt.sendKeys(email);
	}
	
	public void setPassword(String password) {
		pwdTxt.sendKeys(password);
	}
	
	public void login()
	{
		loginBtn.click();
	}
}
