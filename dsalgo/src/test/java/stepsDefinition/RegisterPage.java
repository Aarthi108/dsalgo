package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import utilities.LoggerLoad;

import pageObjects.registerpage;
import pageObjects.homepage;
import utilities.ConfigFileReader;
import utilities.ExcelReader;
public class RegisterPage {
	
	private registerpage Register = new registerpage();
	private homepage portalLink = new homepage();
	String Excelpath=ConfigFileReader.getexcelfilepath();
	static String username;
	static String password;
	
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
//		 ConfigFileReader configFileReader = new ConfigFileReader();
//	     String registerpageurl = configFileReader.getProperty("registerpageurl");
//	     LoggerLoad.info("----User is on"+registerpageurl+"Page----");
	     Register.openregisterpage();	
	}

	@When("The user clicks {string} button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty(String string) {
           Register.clickformsubmit();
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String warn) {
		String uwmsg = Register.verifyUserWarnMsg();
	    assertEquals(uwmsg, warn);
		
	}

	@When("The user clicks {string} button after entering {string} with other fields empty")
	public void the_user_clicks_button_after_entering_with_other_fields_empty(String string , String username) {
		Register.SetUserName(username);
		Register.clickformsubmit();
	   
	}

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_password_textbox(String Warn1) {
		String pwmsg =Register.verifyPassWarnMsg();
		assertEquals(pwmsg, Warn1);
	}

	@When("The user clicks {string} button after entering {string} and {string} with Password Confirmation field empty")
	public void the_user_clicks_button_after_entering_and_with_password_confirmation_field_empty(String string, String username, String password) {
	   Register.SetUserName(username);
	   Register.setPWd(password);
	   Register.clickformsubmit();
	}

	@Then("It should display an error {string} below Password Confirmation textbox")
	public void it_should_display_an_error_below_password_confirmation_textbox(String warn2) {
		 String cpwmsg = Register.verifyConPassWarnMsg();
		   assertEquals(cpwmsg, warn2);
		
	}

	@When("The user enters a valid existing {string} with {string} and {string}")
	public void the_user_enters_a_valid_existing_with_and(String username, String password, String pwdconfim) {
		Register.SetUserName(username);
		   Register.setPWd(password);
		   Register.setPWDComfim(pwdconfim);
		   Register.clickformsubmit();
	   
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String Warn1) {
		String pwmsg =Register.verifyErrorMsg();
		assertEquals(pwmsg, Warn1);
	}


	@When("The user enters a valid {string} and {string} and {string}")
	public void the_user_enters_a_valid_and_and(String username, String password, String pwdconfim) {
		Register.SetUserName(username);
		   Register.setPWd(password);
		   Register.setPWDComfim(pwdconfim);
		   Register.clickformsubmit();
	}

	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String string) {
		LoggerLoad.info("User is Redirected to the Homepage with the message"+string );
	    
	}

	

	

}
