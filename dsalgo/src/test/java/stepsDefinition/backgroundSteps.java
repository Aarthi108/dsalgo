//package stepsDefinition;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.arraypage;
//import pageObjects.homepage;
//import pageObjects.datastructure;
//import pageObjects.signInPage;
//import utilities.LoggerLoad;
//import static org.testng.Assert.assertEquals;
//
//public class backgroundSteps {
//	
//		signInPage signin = new signInPage();
//		homepage home =new homepage();
//		arraypage array=new arraypage();
//		datastructure data=new datastructure();
//		
//	
//		@Given("The user is on Signin page of background DS Algo portal")
//		public void the_user_is_on_signin_page_of_ds_algo_portal() {
//			LoggerLoad.info("User Is on Login Page");
//			signin.getLoginurl();
//		    
//		}
//
//		@When("The user enter valid {string} and {string} in the background")
//		public void the_user_enter_valid_and(String username, String password) {
//			LoggerLoad.info("User Enters username and password");
//			signin.SetUserName(username);
//			signin.setPWd(password);
//			
//		   
//		}
//
//		@When("The user click on login button in the background")
//		public void the_user_click_on_login_button() {
//			signin.login();
//		   
//		}
//
//		@Then("The user redirected to homepage in the background")
//		public void the_user_redirected_to_homepage() {
//			
//			home.homeurl();
//			LoggerLoad.info("User redirected to HomePage");
//		    
//		}
//		@Given("The user is on Home page after logged in")
//		public void the_user_is_on_home_page_after_logged_in() {
//			String Title = home.getTitleofPage();
//			LoggerLoad.info("Title of current page is " + Title);
//		    
//		}
//		@Then("User redirected to {string} page")
//		public void user_redirected_to_page(String string) {
//			LoggerLoad.info("The User redirected to " + string + "Page");
//		String title = data.getTitle();
//			LoggerLoad.info("Title of the Current Page is " + title);
//			assertEquals(title, string);
//		}
//
//	}


