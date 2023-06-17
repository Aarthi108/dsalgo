package stepsDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.arraypage;
import utilities.ConfigFileReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;
import utilities.Utility_Methods;

public class arraypage_SD {
	
	Utility_Methods util=new Utility_Methods();
	arraypage array=new arraypage();
	
	static String PythonCode;
	static String Output;
	static String ExpectedResult,ExpectedError,expMsg;
	String Excelpath=ConfigFileReader.getexcelfilepath();

@When("user clicks on Array getstarted")
public void user_clicks_on_array_getstarted() {
    array.arrayGetStarted();
}

@Then("User should be redirected to {string} page")
public void user_should_be_redirected_to_page(String string) {
   LoggerLoad.info("The array is redirected to"+string);
}

@Given("User is on {string} after logged in")
public void user_is_on_after_logged_in(String string) {
	LoggerLoad.info("The user is on "+string);
}

@When("User clicks on Arrays in Python link")
public void user_clicks_on_arrays_in_python_link() {
    array.Arraypython();
}

@When("User clicks on {string} button in {string}")
public void user_clicks_on_button_in(String string, String string2) {
   array.Tryherebtn();
}

@Then("User should be redirected to a page having an tryEditor with a Run button to test")
public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	LoggerLoad.info("User is redirected to a page having Try Editor with a run button to test");
//	String title=array.getPageTitle();
//	LoggerLoad.info("Page Title is " +title);
//	String expectedTitle="Assessment";
//	assertEquals(title,expectedTitle,"User is redirected to Try Editor page");
}

@When("User enters valid Python code from sheet {string} and {int}")
public void user_enters_valid_python_code_from_sheet_and(String SheetName, Integer RowNumber) throws RuntimeException, IOException {
	LoggerLoad.info("User is on Try Editor page");
	ExcelReader reader = new ExcelReader();

	List<Map<String, String>> testdata = reader.getData(Excelpath, SheetName);
	PythonCode = testdata.get(RowNumber).get("PythonCode");
	ExpectedResult=testdata.get(RowNumber).get("Output");
	LoggerLoad.info("Expected Result is "+ExpectedResult);

	LoggerLoad.info("User enters PythonCode as \" " + PythonCode);
	if ( PythonCode!= null )
		array.tryeditor(PythonCode);
}

@When("User clicks on Run button")
public void user_clicks_on_run_button() {
    array.runbtn();
}

@Then("User should be able to see the output")
public void user_should_be_able_to_see_the_output() {
    array.output();
}

@When("User enters invalid Python code from sheet {string} and {int}")
public void user_enters_invalid_python_code_from_sheet_and(String SheetName , Integer RowNumber ) throws EncryptedDocumentException, IOException {
	LoggerLoad.info("User is on Try Editor page");
	ExcelReader reader = new ExcelReader();

	List<Map<String, String>> testdata = reader.getData(Excelpath, SheetName);
	PythonCode = testdata.get(RowNumber).get("PythonCode");
	ExpectedResult=testdata.get(RowNumber).get("Output");
	LoggerLoad.info("Expected Result is "+ExpectedResult);

	LoggerLoad.info("User enters PythonCode as \" " + PythonCode);
	if ( PythonCode!= null )
		array.tryeditor(PythonCode);
}

@Then("User should be able to see error message")
public void user_should_be_able_to_see_error_message() {
    
}

@When("User clicks on Arrays Using List link")
public void user_clicks_on_arrays_using_list_link() {
   array.ArrayUsingList();
}

@Then("User should be able to see error message in an Alert")
public void user_should_be_able_to_see_error_message_in_an_alert() {
	LoggerLoad.info("User gets the error message in an Alert");
	String fetchError = array.fetchErrorMessage();
	String ExpectedError="NameError: name 'hello' is not defined on line 1";
	LoggerLoad.info("Displayed Error Message  is "+fetchError);
	assertEquals(fetchError,ExpectedError,"Invalid Syntax error message");
}

@When("User clicks on Basic Operations in Lists link")
public void user_clicks_on_basic_operations_in_lists_link() {
    array.Basic_Operations_In_Lists();
}

@Then("User should be able to see error message in an Alert box")
public void user_should_be_able_to_see_error_message_in_an_alert_box() {
	LoggerLoad.info("User gets the error message in an Alert");
	String fetchError = array.fetchErrorMessage();
	String ExpectedError="NameError: name 'hello' is not defined on line 1";
	LoggerLoad.info("Displayed Error Message  is "+fetchError);
	assertEquals(fetchError,ExpectedError,"Invalid Syntax error message");
}

@When("User clicks on Applications of Array link")
public void user_clicks_on_applications_of_array_link() {
   array.Applications_of_Array();
}

@Then("User should be able to see an error message in an Alert")
public void user_should_be_able_to_see_an_error_message_in_an_alert() {
	LoggerLoad.info("User gets the error message in an Alert");
	String fetchError = array.fetchErrorMessage();
	String ExpectedError="NameError: name 'hello' is not defined on line 1";
	LoggerLoad.info("Displayed Error Message  is "+fetchError);
	assertEquals(fetchError,ExpectedError,"Invalid Syntax error message");
}

@When("User clicks on Practice Questions link")
public void user_clicks_on_practice_questions_link() {
    array.practice_questions();
}

@When("User clicks on Search the Array link")
public void user_clicks_on_search_the_array_link() {
   
}

@Then("User should be redirected to Questions page contains a tryEditor with Run and Submit buttons")
public void user_should_be_redirected_to_questions_page_contains_a_try_editor_with_run_and_submit_buttons() {
    
}

@Given("User is on {string} page of {string} after logged in")
public void user_is_on_page_of_after_logged_in(String string, String string2) {
    
}

@When("User enters valid Python code from sheet {string} and {int} for the PracticeQuestions")
public void user_enters_valid_python_code_from_sheet_and_for_the_practice_questions(String string, Integer int1) {
    
}

@Then("User should be able to see the Result")
public void user_should_be_able_to_see_the_result() {
   
}

@When("User clicks on Submit button")
public void user_clicks_on_submit_button() {
   
}

@Then("User should get success submission message")
public void user_should_get_success_submission_message() {
   ;
}

@When("User clicks on Max Consecutive Ones link")
public void user_clicks_on_max_consecutive_ones_link() {
    
}

@When("User clicks on Find Numbers with Even Number of Digits link")
public void user_clicks_on_find_numbers_with_even_number_of_digits_link() {
    
}

@When("User clicks on Squares of a Sorted Array link")
public void user_clicks_on_squares_of_a_sorted_array_link() {
    
}


}
