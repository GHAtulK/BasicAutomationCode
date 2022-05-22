package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().newWindow(WindowType.TAB); //New Tab
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		
		driver.switchTo().newWindow(WindowType.TAB); //New Tab
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("admin");
		
		String parent = driver.getWindowHandle();
		System.out.print("The parent webpage here is "+parent);
		Set<String> child = driver.getWindowHandles();
			
		for(String b:child)
		{
			driver.switchTo().window(b);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}
		
	}

}
