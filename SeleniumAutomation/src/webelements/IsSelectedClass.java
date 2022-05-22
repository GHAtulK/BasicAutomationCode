package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@ajaxify=\"/reg/spotlight/\"]")).click();
		WebElement user = driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]"));
		if(user.isSelected())
		{
			System.out.println("Pass: The gender checkbox is selected");
		}
		else
		{
			System.out.println("Fail: The gender checkbox is not selected");
		}
		
		driver.close();
	}

}
