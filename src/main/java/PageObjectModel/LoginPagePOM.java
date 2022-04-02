package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePOM {    
//One last try
	public WebDriver driver;   //This driver doesn't have scope
	
		private By username=By.xpath("//input[@id='username']");
		private By password=By.xpath("//input[@id='password']");
		private By login=By.xpath("//input[@id='Login']");
	

	public LoginPagePOM(WebDriver driver2) {   
			this.driver=driver2;
		}

	public WebElement Enterusername() {
		return driver.findElement(username);
	}
	
	public WebElement Enterpassword() {
		return driver.findElement(password);
	}
	
	public WebElement clicklogin() {
		return driver.findElement(login);
	}
	
}
