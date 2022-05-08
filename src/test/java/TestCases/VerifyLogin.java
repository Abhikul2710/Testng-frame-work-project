package TestCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPagePOM;
import Resources.BaseClass;
import Resources.constants;

public class VerifyLogin extends BaseClass {


	@Test(dataProvider="demo")
	public void credentials(String username,String 	password) {
		
		
		LoginPagePOM obj =new LoginPagePOM(driver);
		obj.Enterusername().sendKeys(username);
		obj.Enterpassword().sendKeys(password);
		obj.clicklogin().click();
		
	}
	
	
	@DataProvider
	public Object[][] demo(){
		
		Object[][] data = new Object[2][2];
	
		//correct username and password
		data[0][0]=constants.username1;
		data[0][1]=constants.password1;
				
		//incorrect username and password
		data[1][0]=constants.username2;
		data[1][1]=constants.password2;
		return data;
		
		
	}

}
