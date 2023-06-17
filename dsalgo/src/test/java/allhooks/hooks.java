
//my code
package allhooks;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import FacDrivers.DriverFactory;
import utilities.ConfigFileReader;
import utilities.LoggerLoad;

public class hooks {
    private static DriverFactory baseclass;
    public static WebDriver driver;
    
    	
    @Before
    public static void setUp() throws Throwable{
    	if(driver==null ) {
    	LoggerLoad.info("Loading Config file");
		ConfigFileReader.configFileRead();
		String browser = ConfigFileReader.browserType();
    
    	LoggerLoad.info("<-----Testing beforeclass---->");

    	 DriverFactory.launchbrowser(browser);
         driver = DriverFactory.getDriver();
         LoggerLoad.info("Initializing " + browser + " driver");
    	}
       
    }
    @AfterStep
    public void tearDown(Scenario scenario) {
        if (driver != null) {
            if (scenario.isFailed()) {
                // Take screenshot or perform any necessary cleanup for failed scenario
            }
        }
    }

//    @After
//    public static void after() throws InterruptedException {
//		LoggerLoad.info("Closing Driver");
//		//Thread.sleep(5000);
//		DriverFactory.closeallDriver();
//	}
           
        }
    
    


		
		

				
