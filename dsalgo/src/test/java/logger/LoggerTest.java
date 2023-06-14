package logger;
import org.testng.annotations.Test;
import utilities.LoggerLoad;

public class LoggerTest {
	@Test
	public void tst01_TestingLog() {
	//if want to display info message
	LoggerLoad.info("<-----Testing Info---->");
	//if want to display warn message
	LoggerLoad.warn("<-----Testing warn---->");
	//if want to display error message
	LoggerLoad.error("<-----Testing error---->");
	}
	}


