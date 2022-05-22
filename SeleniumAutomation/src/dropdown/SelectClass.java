package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dd1 = driver.findElement(By.id("searchDropdownBox"));
		
		Select s=new Select(dd1);
		Thread.sleep(3000);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("search-alias=computers-intl-ship");
		Thread.sleep(3000);
		s.selectByVisibleText("Sports & Outdoors");
		Thread.sleep(3000);
		
		//s.deselectAll(); This will work only if the drop down can have empty value 
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size()); //this gives the count of all values in drop down
		
		for(WebElement b:allOptions) {
			System.out.println(b.getText()); //this prints all the values in the drop down
		}
		
		driver.close();
		

	}

}
