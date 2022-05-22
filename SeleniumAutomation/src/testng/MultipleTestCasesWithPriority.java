package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleTestCasesWithPriority {

	@Test //priority is 0 here
	public void video()
	{
		Reporter.log("video", true);
	}
	
	@Test(priority = 1)
	public void calls()
	{
		Reporter.log("calls", true);
	}
	
	@Test(priority = 1)
	public void chats()
	{
		Reporter.log("chats", true);
	}
	
	@Test(priority = -1)
	public void settings()
	{
		Reporter.log("settings", true);
	}
	
	
	
}
