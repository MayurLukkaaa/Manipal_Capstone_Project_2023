package Capstone_TestCases;

import java.io.IOException;
import java.net.MalformedURLException;
import org.Capstone.PageObjects.AccountCreatedAuto;
import org.Capstone.PageObjects.AccountDeletedAuto;
import org.Capstone.PageObjects.EnterInformationAuto;
import org.Capstone.PageObjects.HomePageAuto;
import org.Capstone.PageObjects.LoggedInAuto;
import org.Capstone.PageObjects.SignUpPageAuto;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mayur.Capstone_Project_Axis.Configurations;

public class TC1_TestNg extends Configurations {
	

	public HomePageAuto homeobj;
	public SignUpPageAuto signupobj;
	public EnterInformationAuto infoobj;
	public AccountCreatedAuto createdobj;
	public LoggedInAuto loggedinobj;
	public AccountDeletedAuto deletedobj;
	WebDriver driver;

    
	@BeforeClass
	public void setup1() throws MalformedURLException
	{
		driver=getDriver();
		
		homeobj=new HomePageAuto(driver);
		signupobj=new SignUpPageAuto(driver);
		infoobj=new EnterInformationAuto(driver);
		createdobj=new AccountCreatedAuto(driver);
		loggedinobj=new LoggedInAuto(driver);
		deletedobj=new AccountDeletedAuto(driver);
	}
	@Test
	public void scenarioDemo() throws InterruptedException, IOException
	{
		homeobj.ClickSignUpOrLogin();
		signupobj.SignUp();
		infoobj.CreateNewAccount();
		createdobj.AccountCreated();
		loggedinobj.AccountDeleted();
		deletedobj.AccountDeletedSuccessful();
	}

	}

