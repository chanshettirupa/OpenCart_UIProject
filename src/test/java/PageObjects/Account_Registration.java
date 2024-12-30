package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account_Registration extends BasePage {

	public Account_Registration(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement ctn;
	
	//input[@name='agree']
	@FindBy(xpath="//label[@class='form-check-label']/following-sibling::input")
	WebElement agreeToggleBtn;
	
	@FindBy(xpath="//div[@id='content']/h1")
	WebElement conformationMsg;
	
	public void setFirstName(String name) {
		firstName.sendKeys(name);
	}
	public void setLasttName(String name) {
		lastName.sendKeys(name);
	}
	public void setEmail(String mail) {
		email.sendKeys(mail);
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void continueBtn() {
		ctn.click();
	}
	public void agreeBtn() {
		agreeToggleBtn.click();
	}
	public String getConformationMsg() {
		try {
			return (conformationMsg.getText());
		}
		catch(Exception e) {
			return (e.getMessage());
		}
	}
	
}

