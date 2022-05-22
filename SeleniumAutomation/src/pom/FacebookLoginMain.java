package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginMain {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FacebookLogin fb = new FacebookLogin(driver);
		driver.navigate().refresh(); //this is used to refresh the page
		
		fb.user("admin");
		fb.pasword("manager");
		fb.loginbutton();
		
	}

}
