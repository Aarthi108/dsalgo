package pageObjects;

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





public class homepage {

	public static WebDriver driver = DriverFactory.getDriver();
	String url =ConfigFileReader.applicationUrl();
	String homePageurl=ConfigFileReader.gethomePage();
	@FindBy(xpath= "//button[@class='btn']") WebElement getstartedBtn;
	@FindBy(xpath = "//*[@href=\"/home\"]") WebElement homePageReDirected;
	@FindBy(xpath = "//button[@class='btn']")WebElement getstarted;
	@FindBy(xpath = "//div[1][@class='col' ]//a[text()='Get Started']")WebElement datagetstarted;
	@FindBy(xpath = "//html//body/div[2]")WebElement ErrorMessage;
	@FindBy(xpath = "//div[2][@class='col' ]//a[text()='Get Started']")WebElement arraygetstarted;
	@FindBy(xpath = "//div[3][@class='col' ]//a[text()='Get Started']")WebElement Linkedgetstarted;
	@FindBy(xpath = "//div[4][@class='col' ]//a[text()='Get Started']")WebElement Stackgetstarted;
	@FindBy(xpath = "//div[5][@class='col' ]//a[text()='Get Started']")WebElement Queuegetstarted;
	@FindBy(xpath = "//div[6][@class='col' ]//a[text()='Get Started']")WebElement Treegetstarted;
	@FindBy(xpath = "//div[7][@class='col' ]//a[text()='Get Started']")WebElement Graphgetstarted;
	@FindBy(xpath = "//a[@href='#' and text()='Data Structures']")WebElement HomeDropDwn;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[1]")WebElement ArrayDropDwn;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[2]")WebElement LinkedListDropDwn;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[3]")WebElement StackDropDwn;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[4]")WebElement QueueDropDwn;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[5]")WebElement TreeDropDwn;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[6]")WebElement GraphDropDwn;
    @FindBy(xpath = "//ul//a[@href='/login']")WebElement SignBtn;
	@FindBy(xpath = "//ul//a[@href='/register']")WebElement RegisterBtn;
	public static Properties prop = new Properties();
	
	public homepage() {
	
		PageFactory.initElements(driver,this);
	}
	
//	public homepage(WebDriver driver) {
//	    homepage.driver = driver;
//	}
	
	public String getportalTitle() {
		return driver.getTitle();
	}
	
	public void openPortalLink()
	{
		driver.get(url);
	}
	public void getstarted()
		{
		getstartedBtn.click();
	}
	
	public void reDirectedHome()
	{	  String actualname =homePageReDirected.getText();
	        String expectedname ="NumpyNinja";
	        Assert.assertEquals(actualname, expectedname);
	        //Verifying error message (type2)
	        //Assert.assertTrue(actualerror.contains("Invalid coupon."));
	}
	public String Errormessage()
	{
		String ErroeMessage = ErrorMessage.getText();
//		Assert.assertTrue(ErroeMessage.contains("You are not logged in"));
		return ErroeMessage;
	}
	
	public void GetStartedLinksHome(String option) throws InterruptedException
	{  
  
   	TimeUnit.SECONDS.sleep(3);
      switch(option) {
      case "Data Structures-Introduction":
      LoggerLoad.info("click " + datagetstarted.getText() + "link on  DataStructures ");
      datagetstarted.click();
      break;
      case "Array":
    	  LoggerLoad.info("click"+arraygetstarted.getText()+"link on Array" );
    	  arraygetstarted.click();
    	  break;
      case "Linked List":
    	  LoggerLoad.info("click"+Linkedgetstarted.getText()+"link on Array" );
    	  Linkedgetstarted.click();
    	  break;
      case "Stack":
    	  LoggerLoad.info("click"+Stackgetstarted.getText()+"link on Array" );
    	  Stackgetstarted.click();
    	  break;
    	  
      case "Queue":
    	  LoggerLoad.info("click"+Queuegetstarted.getText()+"link on Array" );
    	  Queuegetstarted.click();
    	  break;
      case "Tree":
    	  LoggerLoad.info("click"+Treegetstarted.getText()+"link on Array" );
    	  Treegetstarted.click();
    	  break;
      case "Graph":
    	  LoggerLoad.info("click"+Graphgetstarted.getText()+"link on Array" );
    	  Graphgetstarted.click();
    	  break;
      }
	}
      
      public void dropdown(String option) throws InterruptedException
		{
    	  TimeUnit.SECONDS.sleep(3);
		HomeDropDwn.click();
		switch(option) {
		case "Array":
			LoggerLoad.info("click"+ArrayDropDwn.getText()+"dropdown on Array");
			ArrayDropDwn.click();
		case "Linked List":
			LoggerLoad.info("click"+LinkedListDropDwn.getText()+"dropdown on Array");
			LinkedListDropDwn.click();
		case "Queue":
			LoggerLoad.info("click"+QueueDropDwn.getText()+"dropdown on Array");
			QueueDropDwn.click();
		case "Tree":
			LoggerLoad.info("click"+TreeDropDwn.getText()+"dropdown on Array");
			TreeDropDwn.click();
		case "Graph":
			LoggerLoad.info("click"+GraphDropDwn.getText()+"dropdown on Array");
			GraphDropDwn.click();
		case "Stack":
			LoggerLoad.info("click"+StackDropDwn.getText()+"dropdown on Array");
			StackDropDwn.click();
		}
		}
		
		public void SignInpage (String string) throws InterruptedException
		{
			TimeUnit.SECONDS.sleep(5);
			SignBtn.click();
			TimeUnit.SECONDS.sleep(5);
			driver.navigate().back();
					
		}
		
		public void Registerpage (String string) throws InterruptedException
		{
			TimeUnit.SECONDS.sleep(5);
			RegisterBtn.click();
			TimeUnit.SECONDS.sleep(5);
			driver.navigate().back();
		}
		
	}
	


