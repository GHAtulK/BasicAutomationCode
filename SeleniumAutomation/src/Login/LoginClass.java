package Login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("kr7.atul@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("ka05kc0252");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		//driver.close();	
	}

}
