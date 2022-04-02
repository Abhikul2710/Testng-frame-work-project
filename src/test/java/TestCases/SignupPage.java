package TestCases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModel.SignupPOM;
import Resources.BaseClass;
import Resources.constants;

public class SignupPage extends BaseClass {

	@BeforeTest
	public void urlsignup() throws IOException {
		driver=Initializedriver();
		driver.get("https://www.salesforce.com/in/form/demo/overview-demo/?d=7010M000002IWwe&internal=true");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void signupdetails() throws InterruptedException {
		
	
		SignupPOM obj = new SignupPOM(driver);
		Thread.sleep(1000);
		obj.firstname().sendKeys(constants.firstname);
		Thread.sleep(1000);
		obj.lastname().sendKeys(constants.lastname);
		Thread.sleep(1000);
		Select s = new Select(obj.jobtitle());
		s.selectByIndex(7);
		Thread.sleep(1000);
		obj.workemail().sendKeys(constants.workemail);
		Thread.sleep(1000);
		obj.phone().sendKeys(constants.phone);
		Thread.sleep(1000);
		obj.company().sendKeys(constants.company);
		Thread.sleep(1000);
		Select s1 = new Select(obj.employees());
		s1.selectByIndex(5);
		Thread.sleep(1000);
		obj.button().click();
		
	}
	
}
