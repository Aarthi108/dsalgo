package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FacDrivers.DriverFactory;
import utilities.ConfigFileReader;
import org.openqa.selenium.JavascriptExecutor;


public class arraypage {
	
	
	public static WebDriver driver = DriverFactory.getDriver();;
	
	String homePageurl=ConfigFileReader.gethomePage();
	String arrayPageurl =ConfigFileReader.arrayPageURL();
	String arrayinphython =ConfigFileReader.ArraysinPythonpageurl();
	String arrayinphythontryEditor =ConfigFileReader.tryEditorURL();
	String arraylistpage =ConfigFileReader.arraylisturl();
	String arraybasicoperationpage =ConfigFileReader.arraybasicoperationutl();
	String arrayaplicationspage =ConfigFileReader.arrayapplicationurl();
	String arraypracticepage =ConfigFileReader.arraypracticepageurl();
	String arryauestionpage =ConfigFileReader.arrayquestionurl();
//	String QuestionFindNumberswithEvenNumberofDigits =ConfigFileReader.ArrayQNumberswithEvenNumberofDigitsurl();
	String QuestionSquaresofaSortedArrayurlpage =ConfigFileReader.QuestionSquaresofaSortedArrayurl();
	@FindBy(id="id_username")WebElement Username;
	@FindBy(id="id_password")WebElement currentpassword;
	@FindBy(xpath = "//input[@value='Login']")WebElement loginBtn;
	@FindBy(xpath = "//a[@href ='array']")WebElement arraygetstarted;
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
	@FindBy(xpath="//div//pre[@id=\"output\"]")WebElement output;
	
	public arraypage() {
    	
		PageFactory.initElements(driver,this);
	}
	public void homeredirect()
	{
		driver.get(arrayPageurl);
	}
	public void arrayGetStarted()
	{
		arraygetstarted.click();
	}
	public void Arraypython()
	{
		driver.get(arrayinphython);
	}
	public void Tryherebtn()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		tryHereBtn.click();
	}
	public void tryeditor(String pythoncode)
	{
		arraytextbar.sendKeys(pythoncode);;
	}
	
	public void runbtn()
	{
		Runbutton.click();
	}

	public void output()
	{
		output.getText();
	}
	
	public void ArrayUsingList()
	{
		driver.get(arraylistpage);
	}
	public String fetchErrorMessage()
	{
		String errorMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMessage;
	}
	public void Basic_Operations_In_Lists()
	{
		driver.get(arraybasicoperationpage);
		
	}
	public void Applications_of_Array()
	{
		driver.get(arrayaplicationspage);
	}
	public void practice_questions()
	{
		driver.get(arraypracticepage);
	}
	public void Search_the_array()
	{
		Searchthearray.click();
	}
	
}
