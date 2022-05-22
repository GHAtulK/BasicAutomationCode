package navigationapi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForwardBackRefresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//to navigate to other application
		driver.navigate().to("https://www.facebook.com/");
		
		//to ad 3 seconds delay
		Thread.sleep(3000);
		
		//going back
		driver.navigate().back();
		
		Thread.sleep(3000);
		//going forward		
		driver.navigate().forward();
		Thread.sleep(3000);
		//refresh the screen
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.close();		
	}

}
