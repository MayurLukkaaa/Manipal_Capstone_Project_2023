package Capstone_TestCases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.Capstone.PageObjects.HomePageAuto;
import org.Capstone.PageObjects2.LoginPage1;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mayur.Capstone_Project_Axis.Configurations;

public class TC3_TestNg extends Configurations {
	
	public HomePageAuto Homeobj;
	public LoginPage1 Loginobj;
	WebDriver driver;

    
	@BeforeClass
	public void setup1() throws MalformedURLException
	{
		driver=getDriver();
		
		Homeobj=new HomePageAuto(driver);
		Loginobj=new LoginPage1(driver);
	}
	@Test
	public void scenarioDemo() throws InterruptedException, IOException
	{
		Homeobj.ClickSignUpOrLogin();
		Loginobj.LogInn();
	}

}

