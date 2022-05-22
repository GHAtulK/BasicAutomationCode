package cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("kr7.atul@gmail.com");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("ka05kc0252");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[name='login']")).click();
		Thread.sleep(3000);
		driver.close();
			
	}

}
