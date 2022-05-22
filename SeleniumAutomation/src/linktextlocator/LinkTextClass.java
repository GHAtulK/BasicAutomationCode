package linktextlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("identify_email")).sendKeys("9784512354");
		driver.findElement(By.name("did_submit")).click();
		Thread.sleep(3000);
		driver.close();
				
	}

}
