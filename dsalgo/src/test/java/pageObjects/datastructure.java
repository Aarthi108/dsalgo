package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FacDrivers.DriverFactory;
import utilities.ConfigFileReader;

import org.openqa.selenium.JavascriptExecutor;

public class datastructure {
	
	
	public static WebDriver driver = DriverFactory.getDriver();;
	String homePageurl=ConfigFileReader.gethomePage();
	@FindBy(id="id_username")WebElement Username;
	@FindBy(id="id_password")WebElement currentpassword;
	@FindBy(xpath = "//input[@value='Login']")WebElement loginBtn;
	@FindBy(xpath = "//a[@href ='data-structures-introduction']")WebElement datagetstarted;
	@FindBy(xpath = "//ul/a[@href ='time-complexity']")WebElement TimeCompexitylink;
	@FindBy(xpath = "//div/a[text() ='Try here>>>']")WebElement tryHereBtn;
	@FindBy(xpath ="//form/div/div/div/textarea")WebElement  datatextbar ;
	@FindBy(xpath ="//button[text()='Run']")WebElement  Runbutton ;
	@FindBy(xpath = "//*[@href=\"/home\"]") WebElement homePageReDirected;
	@FindBy(xpath="//div//pre[@id=\"output\"]")WebElement output;
	
	
	@FindBy(xpath = "//div[2][@class='col' ]//a[text()='Get Started']")WebElement arraygetstarted;
	
//	@BeforeMethod
//	@Test
//	public void data()
//	{
//		
//		driver = new ChromeDriver();
//		driver.get("https://dsportalapp.herokuapp.com/");
//		driver.get("https://dsportalapp.herokuapp.com/login");
//		PageFactory.initElements(driver, this);
//		Username.sendKeys("Aarthi");
//		currentpassword.sendKeys("@@Rthi1996");
//		loginBtn.click();
//	}
	 public datastructure() {
	    	
			PageFactory.initElements(driver,this);
		}
//	public void redirectedtohome() throws Exception {
//		Thread.sleep(2000);
//		String actualname =homePageReDirected.getText();
//	    String expectedname ="NumpyNinja";
//	    Assert.assertEquals(actualname, expectedname);
		
		
//	}
	 public void homeredirect()
		{
			driver.get(homePageurl);
		}
	public void dataGetStart()
	{
		datagetstarted.click();
	}
	public void Timecomplex()
	{
		TimeCompexitylink.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		tryHereBtn.click();
	}
	
	public void tryEditor(String pythoncode) throws InterruptedException
	{
		Thread.sleep(2000);
		datatextbar.sendKeys(pythoncode);
	}
	public void Runnbtn()
	{
		Runbutton.click();
	}
	public void output()
	{
		output.getText();
	}
	public String Fetcherrormessage()
	{
	String errorMessage=driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	return errorMessage;
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

}
