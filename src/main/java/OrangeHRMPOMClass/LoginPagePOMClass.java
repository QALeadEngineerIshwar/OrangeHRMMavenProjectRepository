package OrangeHRMPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass 
{
	
	
	//1.
	
	WebDriver driver;
	
	
	//2.
	
	@FindBy(xpath="//input[@name=\"username\"]")WebElement username;
	@FindBy(xpath="//input[@name=\"password\"]")WebElement password;
	@FindBy(xpath="//button[@type=\"submit\"]")WebElement loginbutton;
	
	
	//3.
	
	public void sendusername()
	{
		username.sendKeys("Admin");
	}
	
	public void sendpassword()
	{
		password.sendKeys("admin123");
	}
	
	public void clickonloginbutton()
	{
		loginbutton.click();
	}
	
	
	//4. constructor created
	
	public LoginPagePOMClass(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

}
