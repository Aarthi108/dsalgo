package stepsDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;



import utilities.LoggerLoad;
import pageObjects.datastructure;
import pageObjects.signInPage;
import utilities.ConfigFileReader;
import utilities.ExcelReader;

public class datastructure_SD {
	private datastructure data = new datastructure();
	
	@Given("The user is on the {string} after logged in")
	public void the_user_is_on_the_after_logged_in(String string) throws Exception {
	   LoggerLoad.info("the user is in the home page after logged in");
	}

	@When("The user clicks the {string} button in Data Structure Page introduction Panel")
	public void the_user_clicks_the_button_in_data_structure_page_introduction_panel(String string) {
		data.dataGetStart();
	    
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		LoggerLoad.info("The user is on "+ string + "page");
	   
	}

	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() {
	    data.Timecomplex();
	}

	@When("The user clicks {string} button on {string} page")
	public void the_user_clicks_button_on_page(String string, String string2) {
		LoggerLoad.info("the user clicks"+ string + "and "+ string2 );
	   
	}

	@Given("The user is in a page having an tryEditor with a Run button to test")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    
	}

	@When("The user enter valid python code in tryEditor from {string}")
	public void the_user_enter_valid_python_code_in_try_editor_from(String pythoncode) throws InterruptedException {
		data.tryEditor(pythoncode);
	    
	}

	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() throws InterruptedException {
		Thread.sleep(2000);
	   data.Runnbtn();
	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
		
	   
	}

	@When("The user enter python code with invalid syntax in tryEditor from {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_and(String string, Integer int1) {
	    
	}

	@Then("The user should be presented with error message")
	public void the_user_should_be_presented_with_error_message() {
	    
	}

}
