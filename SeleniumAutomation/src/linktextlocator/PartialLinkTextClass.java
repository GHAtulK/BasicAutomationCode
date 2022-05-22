package linktextlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextClass {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/login.php?type=log");
	Thread.sleep(3000);
	driver.findElement(By.id("loginClick")).click();
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Return to")).click();
	Thread.sleep(3000);
	driver.close();
	
}
}