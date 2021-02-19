package Com.Test.Purvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IdentityPage {
	
	WebDriver driver;
	By fName = By.id("firstname");
	By currPass = By.id("old_passwd");
	By savebtn = By.name("submitIdentity");
	By successMsg = By.xpath("//p[@class = 'alert alert-success']");
	
	public IdentityPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	public void changeFirstName() {
	driver.findElement(fName).sendKeys("two");
	}	
	
	public void enterPasswdAndClickSave() {
		driver.findElement(currPass).sendKeys("Test@1234");
		driver.findElement(savebtn).click();
		}	

	public void verifySuccessMessage() {
		driver.findElement(successMsg).isDisplayed();
		
	}

}
