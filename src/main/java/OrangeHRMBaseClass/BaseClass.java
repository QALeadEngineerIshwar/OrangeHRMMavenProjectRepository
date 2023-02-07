package OrangeHRMBaseClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import OrangeHRMPOMClass.LoginPagePOMClass;

public class BaseClass 
{
	Logger log= Logger.getLogger("OrangHRMMavenProject");   // put project name inside the bracket
	
	
	//1. 
	
	public WebDriver driver;
	
	//2. @BeforeMethod annotation is used with one setup() method
	
	@BeforeMethod
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Babarao Kishan Mise\\eclipse-workspace\\OrangeHRMMavenProject\\Driver\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		
		PropertyConfigurator.configure("log4j.properties");    // put file name in bracket which we created. 
		log.info("Browser is opened");
		
		
		driver.manage().window().maximize();
		log.info("Browser is maximize");
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		log.info("URL is opened");
		
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		
		// Note: we have to create object of pom class 
		// and call the login functionality methods(senusername,sendpassword,clickonloginbutton)
		
		
		LoginPagePOMClass LPPC = new LoginPagePOMClass (driver);
		LPPC.sendusername();
		log.info("username is entered");
		
		LPPC.sendpassword();
		log.info("password is entered");
		
		
		LPPC.clickonloginbutton();
		log.info("clicked on login button");
		
		
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		log.info("quit from the current browser");
	}
	
	
	
	
	
	

}
