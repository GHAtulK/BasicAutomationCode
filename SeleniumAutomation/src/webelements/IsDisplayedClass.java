package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement user = driver.findElement(By.id("twotabsearchtextbox"));
		if(user.isDisplayed())
		{
			System.out.println("Pass: Search box is visible");
			user.sendKeys("Computer");
			Thread.sleep(3000);
		}
		else
		{
			System.out.println("Fail: Search box is not visible");
		}
		
		driver.close();
	}

}
