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

import FacDrivers.DriverFactory;
import allhooks.hooks;
import utilities.LoggerLoad;
import utilities.ConfigFileReader;

public class registerpage {
	
	public static WebDriver driver = DriverFactory.getDriver();
	String registerurl =ConfigFileReader.getRegisterPage();
	String signinurl = ConfigFileReader.getSigninPage();
	@FindBy(xpath = "//ul//a[@href='/register']")WebElement RegisterBtn;//input[@type='submit']
	@FindBy(xpath = "//input[@type='submit']")WebElement formSubmitBtn;
	@FindBy(id="id_username")WebElement username;
	@FindBy(id="id_password1")WebElement password;
	@FindBy(id="id_password2")WebElement password2;
    @FindBy(xpath = "//ul//a[@href='/login']")WebElement SignBtn;
    @FindBy(id="id_password")WebElement currentpassword;//input[@value='Login']
    @FindBy(xpath = "//input[@value='Login']")WebElement loginBtn;
    @FindBy (xpath="//div[@class='alert alert-primary']" ) WebElement errorMsg;
    
    
    public static Properties prop = new Properties();
	
    public registerpage() {
    	
		PageFactory.initElements(driver,this);
	}
    public void openregisterpage() {
 	   driver.get(registerurl);
    }
   
	public void homeregisterbutton ()
	{
	   RegisterBtn.click();
	}
	public void clickformsubmit()
	{
		LoggerLoad.info("Click Register Button");
		formSubmitBtn.click();
	}
	public void SetUserName(String srtingUN)
	{
		username.sendKeys(srtingUN);
		
	}
	public void setPWd(String stringpwd)
	{
		password.sendKeys(stringpwd);
	}
	public void  setPWDComfim(String stringpedconfim)
	{
		password2.sendKeys(stringpedconfim);
		
	}
	public String verifyErrorMsg1() {
		LoggerLoad.info("verify the error message");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String emsg=errorMsg.getText();
		LoggerLoad.warn(emsg); //error message
		return emsg;
	}
	public String verifyUserWarnMsg() {
		LoggerLoad.info("verify the warn message");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String uwmsg=username.getAttribute("validationMessage");
		LoggerLoad.warn(uwmsg);//user warning message
		return uwmsg;
	}
	public String verifyPassWarnMsg() {
		LoggerLoad.info("verify the warn message");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String pwmsg=password.getAttribute("validationMessage");
		LoggerLoad.warn(pwmsg);//password warning message
		return pwmsg;
	}
	public String verifyConPassWarnMsg() {
		LoggerLoad.info("verify the warn message");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String cpwmsg=password2.getAttribute("validationMessage");
		LoggerLoad.warn(cpwmsg);//conform password warning message
		return cpwmsg;
	}
	public String verifyErrorMsg() {
		LoggerLoad.info("verify the error message");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String emsg=errorMsg.getText();
		LoggerLoad.warn(emsg); //error message
		return emsg;
	}
	

		
		}
	

