package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Test.Purvi.HomePage;
import Com.Test.Purvi.IdentityPage;
import Com.Test.Purvi.MyAccountPage;
import Com.Test.Purvi.SignInPage;
import DataProvider.ConfigFileReader;
import Com.Test.Purvi.*;
import io.cucumber.java.en.*;

public class WebAutomationTask {
	WebDriver driver;
	ConfigFileReader configFileReader;
	HomePage homepage;
	SignInPage signinpage;
	MyAccountPage myaccountpage;
	IdentityPage identitypage;
	TShirtPage tshirtpage;

	@Given("browser is open")
	public void browser_is_open() {
		configFileReader= new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver",configFileReader.getDriverPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("user enters Automation Practice Demo website URL")
	public void user_enters_automation_practice_demo_website_url() {
		driver.get(configFileReader.getApplicationUrl());
	}
		
	@When("user clicks on Sign in tab")
	public void user_clicks_on_sign_in_tab() {
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		homepage = new HomePage(driver);
		homepage.clickOnSignInButton();
	}

	@And("user enters email address and password for a registered user")
	public void user_enters_email_address_and_password_for_a_registered_user() {
		signinpage = new SignInPage(driver);
		signinpage.enterUsernameAndPassword();
	}

	@And("user clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
		signinpage.clickOnSignInSubmitbutton();
	}
	
	@Then("user is redirected to MyAccount Page")
	public void user_is_redirected_to_my_account_page() {
		myaccountpage = new MyAccountPage(driver);
		myaccountpage.validateOnMyAccountPage();
	}

	@And("user clicks on T-Shirts tab")
	public void user_clicks_on_t_shirts_tab() {
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		myaccountpage.clickOnTshirts();
	}
	
	@When("user clicks on Add to Cart button for the selected T-Shirt")
	public void user_clicks_on_add_to_cart_button_for_the_selected_t_shirt() {
		tshirtpage = new TShirtPage(driver);
		tshirtpage.clickOnAddToCartBtn();		
	}

	@And("user clicks on Proceed to checkout button on a window pop-up")
	public void user_clicks_on_proceed_to_checkout_button_on_a_window_pop_up() {
	}

	@Then("user is redirected to Summary page")
	public void user_is_redirected_to_summary_page() {
	}

	@And("user clicks on Proceed to checkout button on the page")
	public void user_clicks_on_proceed_to_checkout_button_on_the_page() {
	}

	@Then("user is redirected to Address page")
	public void user_is_redirected_to_address_page() {
	}

	@Then("user is redirected to Shipping Page")
	public void user_is_redirected_to_shipping_page() {
	}

	@And("user selects the checkbox to agree terms of service")
	public void user_selects_the_checkbox_to_agree_terms_of_service() {
	}

	@Then("user is redirected to Payment Page")
	public void user_is_redirected_to_payment_page() {
	}

	@And("user selects the option of Pay by check by clicking on it")
	public void user_selects_the_option_of_pay_by_check_by_clicking_on_it() {
	}

	@And("user clicks on I confirm my order button")
	public void user_clicks_on_i_confirm_my_order_button() {
	}

	@And("user recieved a message of order completion")
	public void user_recieved_a_message_of_order_completion() {
	}

	@Then("user clicks on back to orders button on the page")
	public void user_clicks_on_back_to_orders_button_on_the_page() {
	}

	@And("user can find the order details under Order History tab")
	public void user_can_find_the_order_details_under_order_history_tab() {
	}

	@And("browser is closed")
	public void browser_is_closed() {
		driver.close();
	}

	@And("user clicks on My Personal Information button")
	public void user_clicks_on_my_personal_information_button() {
		myaccountpage.clickOnPersonalInfo();
	}
	

	@When("user enters new value for First name field")
	public void user_enters_new_value_for_first_name_field() {
		identitypage = new IdentityPage(driver);
		identitypage.changeFirstName();
	}

	@And("user enters the current password and clicks on save button")
	public void user_enters_the_current_password_and_clicks_on_save_button() {
		identitypage.enterPasswdAndClickSave();
	}

	@Then("success message is recieved.")
	public void success_message_is_recieved() {
		identitypage.verifySuccessMessage();
	}


}
