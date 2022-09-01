package medicarePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import medicareBase.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(id = "userModel")
	WebElement UserNameLabel;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName(){
		return UserNameLabel.isDisplayed();
	}

}
