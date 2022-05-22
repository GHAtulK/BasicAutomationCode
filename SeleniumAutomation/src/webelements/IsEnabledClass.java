package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.globalglaze.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement user = driver.findElement(By.xpath("//a[@class=\"show-popup\"]"));
		if(user.isEnabled())
		{
			System.out.println("The Forgot Password link is enabled");
			user.click();
			Thread.sleep(3000);
		}
		else
		{
			System.out.println("The Forgot Password link is disabled");
		}
		
		driver.close();
	}

}
