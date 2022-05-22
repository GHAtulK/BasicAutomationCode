package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicReportConsolePrint {

	@Test
	public void tc1()
	{
			Reporter.log("Hello Selenium", true);
			Reporter.log("Hello Java", false);
	}
}
