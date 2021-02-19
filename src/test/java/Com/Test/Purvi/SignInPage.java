package Com.Test.Purvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	WebDriver driver;
	By username = By.id("email");
	By password = By.id("passwd");
	By submitbtn = By.id("SubmitLogin");

	public SignInPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	public void enterUsernameAndPassword() {
		driver.findElement(username).sendKeys("test.test@gmail.com");
		driver.findElement(password).sendKeys("Test@1234");
	}
	
	public void clickOnSignInSubmitbutton() {
		driver.findElement(submitbtn).click();
	}
}
