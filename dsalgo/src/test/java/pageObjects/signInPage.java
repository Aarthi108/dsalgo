package pageObjects;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

import allhooks.hooks;
import utilities.DriverFactory;
import utilities.LoggerLoad;
import utilities.ConfigFileReader;

public class signInPage {
	
	
	public static WebDriver driver = DriverFactory.getDriver();
	String signinurl = ConfigFileReader.getSigninPage();
	@FindBy(xpath="//a[2][@href='/register']")WebElement registerbtn;
	@FindBy(id="id_username")WebElement Username;
	@FindBy(id="id_password")WebElement currentpassword;
	@FindBy(xpath = "//input[@value='Login']")WebElement loginBtn;
	@FindBy(xpath = "//ul//a[@href='/logout']")WebElement logoutBtn;
	@FindBy(xpath = "//div[contains(text(),'Invalid Username and Password')]")
	WebElement alertMsg;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[2]/a[1]")
	WebElement registerlink;
	@FindBy(xpath = "//div[contains(text(),'You are logged in')]")
	WebElement successLogin;
	 public static Properties prop = new Properties();
	 public static ConfigFileReader configFileReader = new ConfigFileReader();

		
	    public signInPage() {
	    	
			PageFactory.initElements(driver,this);
		}
	    
	    public void getLoginurl() {
			driver.get(signinurl);
		}
	
	public void SetUserName(String Usernam)
	{
		Username.sendKeys(Usernam);
		
	}
	public void setPWd(String currentpass)
	{
		currentpassword.sendKeys(currentpass);
	}
	
	public void login()
	{
		loginBtn.click();
	}
	public String successAlert() {
		String successMsg = successLogin.getText();
		return successMsg;
	}

	public String invalidAlert() {
		String alertMessage = alertMsg.getText();
		return alertMessage;
	}

	public String validateUsernamefield(String validationMessge) {
		String message = Username.getAttribute("validationMessage");
		System.out.println("message");
		return message;

	}

	public String validatePasswordfield(String validationMessge) {
		String message = currentpassword.getAttribute("validationMessage");
		System.out.println("message");
		return message;

	}

	public void register() {
		registerlink.click();
	}

	public String register_page() {
		String title = driver.getTitle();
		return title;
	}

	}
