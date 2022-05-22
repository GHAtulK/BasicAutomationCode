package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameSwitchAndBack {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Sign In']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']")).click();
		
		driver.switchTo().frame(0);
		System.out.println("Frame switched");
		
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("9547678726");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
		driver.switchTo().defaultContent();
		System.out.println("Frame switched back to default");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("mobile");
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}

}
