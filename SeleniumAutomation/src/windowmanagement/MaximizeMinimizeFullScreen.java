package windowmanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeMinimizeFullScreen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		//to maximize
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

		//to enter full screen mode
		driver.manage().window().fullscreen();
		Thread.sleep(3000);

		//to minimize
		driver.manage().window().minimize();
		Thread.sleep(3000);

		driver.close();
	}

}
