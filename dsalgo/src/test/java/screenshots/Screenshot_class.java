package screenshots;
import java.io.File;
import java.io.IOException;
import java.sql.Time;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.messages.types.Timestamp;

public class Screenshot_class {
	public static void takescreeenshot(String stepname) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev");
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		String TCName = "TC_001";
		String dir = System.getProperty("user.dir");
//		Timestamp timestamp = new Time(System.currentTimeMillis());
		String path = dir + "/src/test/resources/screenshots/"+TCName+"/screenshot_"+stepname+"_"+".jpeg";
		
		
		File destFile = new File(path);
		
		FileUtils.copyFile(srcFile, destFile);
		
	}
	
	public static void main(String[] args) throws IOException
	{
		
	takescreeenshot("SeleniumHomePage");
	
		
	

}
}
