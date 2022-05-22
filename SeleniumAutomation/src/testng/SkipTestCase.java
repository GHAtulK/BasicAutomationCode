package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipTestCase {

	@Test //priority is 0 here
	public void video()
	{
		Reporter.log("video", true);
	}
	
	@Test(priority = 1, enabled = false)
	public void calls()
	{
		Reporter.log("calls", true);
	}
	
	@Test(priority = 1)
	public void chats()
	{
		Reporter.log("chats", true);
	}
	
	@Test(priority = -1, enabled = false)
	public void settings()
	{
		Reporter.log("settings", true);
	}
	
}
