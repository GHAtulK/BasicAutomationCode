package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectMethodClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dd1 = driver.findElement(By.id("cars"));
		
		Select s=new Select(dd1);
		Thread.sleep(3000);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("299");
		Thread.sleep(3000);
		s.selectByVisibleText("More Than INR 500 ( 55 ) ");
		Thread.sleep(3000);
		
		System.out.println(s.isMultiple());
		
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		driver.close();
	}

}
