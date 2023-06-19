package Capstone_TestCases;

import java.io.IOException;
import java.net.MalformedURLException;
import org.Capstone.PageObjects.HomePageAuto;
import org.Capstone.PageObjects.LoggedInAuto;
import org.Capstone.PageObjects1.AccountDeletedMsg;
import org.Capstone.PageObjects1.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Mayur.Capstone_Project_Axis.Configurations;

public class TC2_TestNg extends Configurations {
	
	public HomePageAuto homeObj;
	public LoginPage loginObj;
//	public LoggedInAuto loggedinObj;
	public AccountDeletedMsg deletedObj;
	WebDriver driver;

    
	@BeforeClass
	public void setup1() throws MalformedURLException
	{
		driver=getDriver();
		
		homeObj=new HomePageAuto(driver);
		loginObj=new LoginPage(driver);
//		loggedinObj=new LoggedInAuto(driver);
		deletedObj=new AccountDeletedMsg(driver);
	}
	@Test
	public void scenarioDemo() throws InterruptedException, IOException
	{
		homeObj.ClickSignUpOrLogin();
		loginObj.LogIn();
//		loggedinObj.AccountDeleted();
		deletedObj.AccountDeletedSuccessfully();
	}

}
