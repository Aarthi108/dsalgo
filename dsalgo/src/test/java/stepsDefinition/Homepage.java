package stepsDefinition;

import java.util.Properties;

import org.testng.Assert;

import FacDrivers.DriverFactory;
import utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.homepage;
import utilities.ConfigFileReader;


public class Homepage {
	
	private homepage portalLink = new homepage();

	
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() { 
//	 ConfigFileReader configFileReader = new ConfigFileReader();
//     String url = configFileReader.getProperty("url");
//     LoggerLoad.info("----User is on"+url+"Page----");
        portalLink.openPortalLink();	
	}
	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string)  {
		LoggerLoad.info("user clicks get started button"+ string + "got alert message");
		portalLink.getstarted();
		
	   
	}
	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
     
		portalLink.reDirectedHome();
     
	     
	}
	
	@Given("The user opens home page link")
	public void the_user_opens_home_page_link() throws InterruptedException {

		LoggerLoad.info("user is on home page");
		
	}
	
	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String option) throws InterruptedException {
	   portalLink.GetStartedLinksHome(option);
    }
    @Then("The user get warning message {string}")
    public void the_user_get_warning_message(String string) {
    	 String actualMessage = portalLink.Errormessage();
         Assert.assertEquals(actualMessage,"You are not logged in");
    	 System.out.println(string);
        
    }
    

    @When("The user click on dropdown link {string} without login")
    public void the_user_click_on_dropdown_link_without_login(String option)throws InterruptedException {
    	portalLink.dropdown(option);
    }
    @Then("The user gets warning message {string}")
    public void the_user_gets_warning_message(String string) {
    	 portalLink.Errormessage();
//         Assert.assertEquals(actualMessage,"You are not logged in");
    	 System.out.println(string);
        
    }

    @When("The user click {string} button signIn")
    public void the_user_click_button_signIn(String string) throws InterruptedException {
    	portalLink.SignInpage(string);
        
    }

    @Then("The user should redirected to signIn page")
    public void the_user_should_redirected_to_sign_in_page() {
    	LoggerLoad.info("user is Redirected to Sign In page");
        
    }
    @When("The user click {string} button Register")
    public void the_user_click_button_Register(String string) throws InterruptedException {
    	
       portalLink.Registerpage(string); 
    }

    @Then("The user should redirected to Register page")
    public void the_user_should_redirected_to_Register_page() {
    	LoggerLoad.info("user is Redirected to register page");
    }
    

}
