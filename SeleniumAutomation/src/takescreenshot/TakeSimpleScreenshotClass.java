package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSimpleScreenshotClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ram = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./photo/amazon.png");
		FileUtils.copyFile(ram, dest);
		driver.close();
		
	}

}
