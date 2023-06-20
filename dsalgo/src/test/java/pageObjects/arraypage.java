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

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import utilities.Utility_Methods;


public class arraypage {
	
	
	public static WebDriver driver = DriverFactory.getDriver();;
	Utility_Methods util=new Utility_Methods();
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
	@FindBy(xpath="//textarea[@tabindex='0']")WebElement  arraytextbar ;
	@FindBy(xpath ="//button[text()='Run']")WebElement  Runbutton ;
	@FindBy(xpath ="//li//a[text()='Arrays Using List']")WebElement ArraysUsingList  ;//li//a[text()='']
	@FindBy(xpath ="//li//a[text()='Basic Operations in Lists']")WebElement BasicOperationsInLists;
	@FindBy(xpath ="//li//a[text()='Applications of Array']")WebElement ApplicationsofArray;
	@FindBy(xpath="//a[text()='Practice Questions']")WebElement practicequestions  ;
	@FindBy(xpath="//a[text()='Search the array']")WebElement Searchthearray ;
	@FindBy(xpath="//a[text()='Max Consecutive Ones']")WebElement MaxConsecutiveOnes;
	@FindBy(xpath="//a[text()='Find Numbers with Even Number of Digits']")WebElement FindNumbersEvenNoOfDigits;
	@FindBy(xpath="//a[text()='Squares of  a Sorted Array']")WebElement SquaresOfSortedArray;
	@FindBy(xpath ="//input[@type='submit']")WebElement Submit;
	@FindBy(xpath="//div//pre[@id=\"output\"]")WebElement output;
	@FindBy (id="answer_form") WebElement answerform;
	
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
	public void tryeditor(String PythonCode) throws InterruptedException
	{
		Thread.sleep(2000);
		arraytextbar.sendKeys(PythonCode);;
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
	public String getPageTitle()
	{
		String Title=driver.getTitle();
		return Title;
	}
	public String fetchOutput()
	{
		util.waitForElement(output);
		String Result = output.getText();
		return Result;
	}
	public void  navigateTo(String pagename)
	{
		String urlName= ConfigFileReader.geturl(pagename);
		driver.get(urlName);
	}
	public void enterPracticeQuestions(String sheetname, int rownumber) throws InvalidFormatException, IOException 
	{
		util.waitForElement(answerform);
		String code=Utility_Methods.getCodefromExcel(sheetname, rownumber);
		util.enterPythonCodeForPractice(code, arraytextbar);
		
	}
	public String getActualResult()
	{
		//util.waitForElement(output);
		return output.getText();
	}
	public void MaxConsecutiveOne()
	{
		MaxConsecutiveOnes.click();
    }
	public void FindNumbersEvenNoOfDigits ()
	{
		FindNumbersEvenNoOfDigits.click();
	}
	public void SquaresOfSortedArray()
	{
		SquaresOfSortedArray.click();
	}
	public void clickSubmitButton()
	{
		Submit.click();
	}
	public String getExpectedResult(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException
	{
		String expectedResult=Utility_Methods.getResultfromExcel(sheetName, rowNumber);
		return expectedResult;
	}
	
	
}
