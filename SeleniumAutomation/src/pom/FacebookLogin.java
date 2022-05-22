package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {

	
	//Declaration
	@FindBy(id="email")
	private WebElement usernametb;
	@FindBy(id="pass")
	private WebElement passwordtb;
	@FindBy(name="login")
	private WebElement loginbtn;
	
	//Initialization
	public FacebookLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void user(String name)
	{
		usernametb.sendKeys(name);
	}
	public void pasword(String pwd)
	{
		passwordtb.sendKeys(pwd);
	}
	public void loginbutton()
	{
		loginbtn.click();;
	}	
}
