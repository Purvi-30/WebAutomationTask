package Com.Test.Purvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

	WebDriver driver;
	By sign_out = By.className("logout");
	By t_shirts = By.xpath("//ul[@class ='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//following-sibling::li/a[text()='T-shirts']");
	By personal_info = By.xpath("//span[text()='My personal information']");
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	public void validateOnMyAccountPage() {
	driver.findElement(sign_out).isDisplayed();
	}	
	
	public void clickOnTshirts() {
		driver.findElement(t_shirts).click();
	}
	
	public void clickOnPersonalInfo() {
		driver.findElement(personal_info).click();
	}
}
