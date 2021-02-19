package Com.Test.Purvi;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TShirtPage {
		WebDriver driver;
		
		By sign_in = By.className("login");
		By img = By.className("//a[@class='product_img_link']//following-sibling::img[@class='replace-2x img-responsive']");
		By add_to_cart_btn = By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']//following-sibling::span");
		
		public TShirtPage(WebDriver driver) {
			this.driver = driver;	
		}
		
		public void clickOnAddToCartBtn() {
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement Element = driver.findElement(img);
			//js.executeScript("arguments[0].scrollIntoView(true);", Element);
			Actions actions = new Actions(driver);
			actions.moveToElement(Element);
			actions.perform();
			driver.findElement(add_to_cart_btn).click();
			
		}
	}
