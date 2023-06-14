package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;


public class arraypage {
	
	public static WebDriver driver;
	@FindBy(id="id_username")WebElement Username;
	@FindBy(id="id_password")WebElement currentpassword;
	@FindBy(xpath = "//input[@value='Login']")WebElement loginBtn;
	@FindBy(xpath = "//div[2][@class='col' ]//a[text()='Get Started']")WebElement arraygetstarted;
	@FindBy(xpath = "//ul//a[@href='arrays-in-python']")WebElement  ArraysInPython ;
	@FindBy(xpath = "//div/a[text() ='Try here>>>']")WebElement tryHereBtn;
	@FindBy(xpath = "//div[@class ='CodeMirror-sizer']")WebElement  arraytextbar ;
	@FindBy(xpath ="//button[text()='Run']")WebElement  Runbutton ;
	@FindBy(xpath ="//li//a[text()='Arrays Using List']")WebElement ArraysUsingList  ;//li//a[text()='']
	@FindBy(xpath ="//li//a[text()='Basic Operations in Lists']")WebElement BasicOperationsInLists;
	@FindBy(xpath ="//li//a[text()='Applications of Array']")WebElement ApplicationsofArray;
	@FindBy(xpath ="//a[@href='/array/practice']']")WebElement practicequestions  ;
	@FindBy(xpath ="//div//a[@href='/question/1']")WebElement Searchthearray ;
	@FindBy(xpath ="//div//a[@href='/question/2']")WebElement MaxConsecutiveOnes;
	@FindBy(xpath ="//div//a[@href='/question/3']")WebElement FindNumbersEvenNoOfDigits;
	@FindBy(xpath ="//div//a[@href='/question/4']")WebElement SquaresOfSortedArray;
	@FindBy(xpath ="//input[@type='submit']")WebElement Submit;
	@BeforeMethod
	@Test
	public void arraylaunch()
	{
		
		driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.get("https://dsportalapp.herokuapp.com/login");
		PageFactory.initElements(driver, this);
		Username.sendKeys("Aarthi");
		currentpassword.sendKeys("@@Rthi1996");
		loginBtn.click();
	}
	
	@Test
	public void array()
	{
		arraygetstarted.click();
		ArraysInPython.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		tryHereBtn.click();
	}

}
