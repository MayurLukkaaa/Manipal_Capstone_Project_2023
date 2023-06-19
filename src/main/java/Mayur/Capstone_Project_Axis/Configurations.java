package Mayur.Capstone_Project_Axis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configurations {
	
	public WebDriver getDriver()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayur Lukka\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.automationexercise.com/");
	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	return driver;

	}
}
