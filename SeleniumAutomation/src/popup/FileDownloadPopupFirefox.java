package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadPopupFirefox {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		driver.findElement(By.xpath("//a[text()='4.1.4']")).click();
		Robot r = new Robot();
		
		//Mention the order of key press based on how it works manually
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		//Follow the same for key release 
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
