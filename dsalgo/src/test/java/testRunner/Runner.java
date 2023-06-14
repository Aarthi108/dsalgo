package testRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.junit.Cucumber;
	
@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:reports/htmlreport.html"}, //reporting purpose
			monochrome=false,  //console output color
//			tags = "@tag", //tags from feature file
			features = {"C:\\Users\\sures\\eclipse-workspace\\dsalgo\\src\\test\\resources\\feature"}, //location of feature files
			glue= {"stepsDefinition","allhooks"}) //location of step definition files


	public class Runner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    }
		

}
