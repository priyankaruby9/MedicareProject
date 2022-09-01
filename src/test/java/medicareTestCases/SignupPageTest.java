package medicareTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import medicareBase.TestBase;
import medicarePages.SignUpPage;

public class SignupPageTest extends TestBase {
	
	SignUpPage signuppage;
	
	public SignupPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		signuppage = new SignUpPage();		
	}
	
	@Test
	
	public void SignUpPageHeadingTitle() throws InterruptedException {
		signuppage.SignUpNewUserValidate();
		Thread.sleep(5000);	
		WebElement Heading = driver.findElement(By.xpath("//h1[text()='Welcome!']"));
		String ActualHeading = Heading.getText();
		String ExpHeading = "Welcome!";
		Assert.assertEquals(ActualHeading, ExpHeading);
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
