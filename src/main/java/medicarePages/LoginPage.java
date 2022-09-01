package medicarePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import medicareBase.TestBase;

public class LoginPage extends TestBase{
	
	//PageFactory OR
	@FindBy(id = "login")
	WebElement LoginPage;
	
	@FindBy(id = "username")
	WebElement Email;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement LoginBtn;
	
	//Initializing Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un , String pwd) {
		LoginPage.click();
		Email.sendKeys(un);
		Password.sendKeys(pwd);
		LoginBtn.click();
		return new HomePage();
	}
}
