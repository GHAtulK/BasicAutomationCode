package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		WebElement bl1 = driver.findElement(By.xpath("(//h1[@class='draghandle'])[1]"));
		WebElement bl2 = driver.findElement(By.xpath("(//h1[@class='draghandle'])[3]"));
		Actions a = new Actions(driver);
		a.dragAndDrop(bl1, bl2).perform();
		Thread.sleep(3000);
		driver.close();
		
	}

}
