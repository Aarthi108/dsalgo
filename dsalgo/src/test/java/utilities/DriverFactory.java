package utilities;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.LoggerLoad;



public class DriverFactory {
//	 private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	 public static WebDriver driver;
	 public static WebDriverWait wait;
	 public DriverFactory() {
	        // Private constructor to prevent instantiation
	    }
	    public static WebDriver launchbrowser(String browser) {
	    	
	    	if (driver == null) {
	    	if (browser.equalsIgnoreCase("firefox")) {
				LoggerLoad.info("Testing on firefox");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			} else if (browser.equalsIgnoreCase("chrome")) {
				LoggerLoad.info("Testing on chrome");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("edge")) {
				LoggerLoad.info("Testing on Edge");
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
//	      
	        }
			else {
                throw new IllegalArgumentException("Invalid browser name: " + browser);
            }
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.manage().deleteAllCookies();
	        driver.manage().window().maximize();
	        wait =new WebDriverWait(driver,Duration.ofSeconds(20));
			
	    	}
			return driver;
	    }
	        
	       
	    

	    public static WebDriver getDriver() {
	    	 if (driver == null) {
	    	        // Specify the desired browser
	    	    }
	        return driver;
	    }
	    public static void closeallDriver() {
	    	{
	    	    if (driver != null) {
	    	        driver.quit();
	    	        driver = null;
	    	    }
	    	}
//		driver.quit();
		}
	   
	
			
//		public static WebDriver driver;
//		public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
//		
//		public static Properties prop = new Properties();
//		public static FileReader file;
//		public static WebDriverWait Wait;
////		public static FileReader locate;
//	
//			
//			public static WebDriver launchbrowser(String browser)
//			{
//				switch (browser.toLowerCase()) {
//			    case "chrome":
//			        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\eclipse-workspace\\dsalgo\\src\\test\\resources\\drivers\\chrome1driver.exe");
//			        WebDriverManager.chromedriver().setup();
//			        driver = new ChromeDriver();
////			        WebDriver driver = DriverFactory.launchbrowser(browser);
////			        DriverFactory.getDriver();
//			        tlDriver.set(driver);
//			        
//			        break;
//			        
//			    case "edge":
//			        System.setProperty("webdriver.edge.driver", "C:\\Users\\sures\\eclipse-workspace\\dsalgo\\src\\test\\resources\\drivers\\msedgedriver.exe");
//			        WebDriverManager.edgedriver().setup();
//			        driver = new EdgeDriver();
////			        WebDriver driver2 = DriverFactory.launchbrowser(browser);
////			        DriverFactory.getDriver();
//			        tlDriver.set(driver);
//			        
//			        break;
//			    default:
//			        System.out.println("Please pass the correct browser: " + browser);
//			        break;
//			}
//	
//			getDriver().manage().deleteAllCookies();
//			getDriver().manage().window().maximize();
//     		return getDriver();
//
//			
//			
//		}
//		public static WebDriver getDriver() {
//			System.out.println("Driver Returned:" + tlDriver.get());
//			return tlDriver.get();
//			
//		}

	}









