package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver){
		super(driver);
	}
	
	//span[text()='My Account']
	//span[normalize-space()='My Account']
	//(//span[@class='d-none d-md-inline'])[3]
	@FindBy(xpath="(//i[@class='fa-solid fa-caret-down'])[2]")
	WebElement my_account;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement register;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement login;
	
	public void clickMyAccount() {
		my_account.click();
	}
	
	public void clickOnRegister() {
		register.click();
	}
	
	public void clickOnLogin()
	{
		login.click();
	}
}
