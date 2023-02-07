package OrangeHRMTestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import OrangeHRMBaseClass.BaseClass;

public class TC01_VerifyLoginFunctionality extends BaseClass 
{
	@Test
	public void verify_login_functionality() throws IOException
	{
		
		// Actual validation for this test case is started here.
		
		
		System.out.println("apply validation using assertion");
		
		String ExpTitle= "OrangeHRM";
		
		String ActualTitle = new String(driver.getTitle());
		
		
		Assert.assertEquals(ActualTitle, ExpTitle);
		OrangeHRMUtilityClass.ScreenshotClass.GetScreenshot(driver, ActualTitle);
		
		
		
		
		
		
		
		
		
	}
	
	

}
