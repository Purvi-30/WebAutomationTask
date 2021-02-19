package Com.Test.Purvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By sign_in = By.className("login");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;	
	}
	
	public void clickOnSignInButton() {
		driver.findElement(sign_in).click();
	}
}
