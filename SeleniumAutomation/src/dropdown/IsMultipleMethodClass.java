package dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethodClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement dd1 = driver.findElement(By.id("month"));
		Select s=new Select(dd1);
		if(s.isMultiple())
		{
			System.out.println("This is a multi select dropdown");
		}
		else
		{
			System.out.println("This is a single select dropdown");
		}
		List<WebElement> allOptions = s.getOptions();
		//Collections.sort(allOptions);
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("The number of dropdown options present is "+allOptions.size()); 
		System.out.println("The list of months without sorting is:");
		for(WebElement b:allOptions) {
			String str=b.getText();
			System.out.println(str);
			al.add(str);
		}
		Collections.sort(al);
		System.out.println("The list of months after sorting is:");
		for(Object str1:al)	{
			System.out.println(str1);
		}
		driver.close();
				
	}

}
