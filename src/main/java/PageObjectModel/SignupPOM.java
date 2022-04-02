package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class SignupPOM {
	public WebDriver driver;
	
	private By firstname=By.xpath("//input[@name='UserFirstName']");
	private By lastname=By.xpath("//input[@name='UserLastName']");
	private By jobtitle=By.xpath("//select[@name='UserTitle']");
	private By workemail=By.xpath("//input[@name='UserEmail']");
	private By phone=By.xpath("//input[@name='UserPhone']");
	private By company=By.xpath("//input[@name='CompanyName']");
	private By employees=By.xpath("//select[@name='CompanyEmployees']");
	private By button=By.xpath("//button[@name='Watch now']");
	
	
	public SignupPOM(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement firstname() {
		return driver.findElement(firstname);
	}
	
	public WebElement lastname() {
		return driver.findElement(lastname);
	}
	
	public WebElement jobtitle() {
	return driver.findElement(jobtitle);
	}
	
	public WebElement workemail() {
		return driver.findElement(workemail);
	}
	
	public WebElement phone() {
		return driver.findElement(phone);
	}
	
	public WebElement company() {
		return driver.findElement(company);
	}
	
	public WebElement employees() {
		return driver.findElement(employees);
	}
	
	public WebElement button() {
		return driver.findElement(button);
	}
	
	
}
