package medicarePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import medicareBase.TestBase;

public class SignUpPage extends TestBase{
	
	@FindBy(id = "signup")  WebElement SignUpLink ; //*[@id='signup']
	@FindBy( id = "firstName") WebElement FirstName;  //input[@id='firstName']
	@FindBy(id = "lastName") WebElement LastName;    //input[@id='lastName']
	@FindBy( id = "email") WebElement Emailid;	//input[@id='email']
	@FindBy(id = "contactNumber") WebElement ContactNumber;  //input[@id='contactNumber']
	@FindBy( id = "password") WebElement PasswordSignUp;  //input[@id='password']
	@FindBy( id = "confirmPassword") WebElement ConfirmPassword;  //input[@id='confirmPassword']
	@FindBy( id = "role1") WebElement UserRole;   //input[@id='role1']
	@FindBy( id = "role2") WebElement SupplierRole;  //input[@id='role2']
	@FindBy( xpath = "//button[@name='_eventId_billing']") WebElement NextBilling;  //button[@name='_eventId_billing']
	
	@FindBy( id = "addressLineOne") WebElement AddressLineOne; 
	@FindBy( id = "addressLineTwo") WebElement AddressLineTwo;
	@FindBy( id = "city") WebElement City;
	@FindBy( id = "postalCode") WebElement PostalCode;
	@FindBy( id = "state") WebElement State;
	@FindBy( id = "country") WebElement Country;
	@FindBy( xpath = "//button[@name='_eventId_confirm']") WebElement NextConfirm;
	//Personal Info
	@FindBy( xpath = "//h3[contains(text(),'Name')]/strong") WebElement expNameEl;
	@FindBy( xpath = "//h4[contains(text(),'Email')]/strong") WebElement expEmailEl;
	@FindBy( xpath = "//h4[contains(text(),'Contact')]/strong") WebElement expContactEl;
	@FindBy( xpath = "//h4[contains(text(),'Role')]/strong") WebElement expRoleEl;
	//Billing Address
	@FindBy( xpath = "//h4[contains(text(),'Billing Address')]/parent::div/following-sibling::div/div[1]/p[1]") WebElement expAddr1El;
	@FindBy( xpath = "//h4[contains(text(),'Billing Address')]/parent::div/following-sibling::div/div[1]/p[2]") WebElement expAddr2E2;
	@FindBy( xpath = "//h4[contains(text(),'Billing Address')]/parent::div/following-sibling::div/div[1]/p[3]") WebElement expCityZipEl;
	@FindBy( xpath = "//h4[contains(text(),'Billing Address')]/parent::div/following-sibling::div/div[1]/p[4]") WebElement expStateEl;
	@FindBy( xpath = "//h4[contains(text(),'Billing Address')]/parent::div/following-sibling::div/div[1]/p[5]") WebElement expCountryEl;
	
	@FindBy( xpath = "//a[(text()='Confirm')]") WebElement ConfirmBtn;
	@FindBy( xpath = "//h1[text()='Welcome!']") WebElement HeadingSignUp;
	
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void SignUpNewUserValidate() throws InterruptedException {
		SignUpLink.click();
		FirstName.sendKeys("kavita");
		LastName.sendKeys("singh");
		Emailid.sendKeys("abc@xyz.com");
		ContactNumber.sendKeys("9611784575");
		PasswordSignUp.sendKeys("abc@123");
		ConfirmPassword.sendKeys("abc@123");
		Thread.sleep(5000);
		UserRole.click();
		NextBilling.click();
		Thread.sleep(5000);
		AddressLineOne.sendKeys("2239 148th Ave NE");
		AddressLineTwo.sendKeys("highlands");
		City.sendKeys("Bellevue");
		PostalCode.sendKeys("98007");
		State.sendKeys("WA");
		Country.sendKeys("USA");
		Thread.sleep(5000);
		NextConfirm.click();
		Thread.sleep(5000);
		ConfirmBtn.click();
	
	}
	
	public void SelectRadioButton(String Role) {
		if(Role.equals("User")) {
			if(!UserRole.isSelected()) {
				UserRole.click();
			}
		}

		if(Role.equals("Supplier")) {
			if(!SupplierRole.isSelected()) {
				SupplierRole.click();
			}
		}
	}
	
	

}
