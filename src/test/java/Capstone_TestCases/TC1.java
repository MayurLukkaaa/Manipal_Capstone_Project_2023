package Capstone_TestCases;

import java.io.IOException;
import java.net.MalformedURLException;
import org.Capstone.BaseConfig.BaseConfigurationsAuto;
import org.Capstone.PageObjects.AccountCreatedAuto;
import org.Capstone.PageObjects.AccountDeletedAuto;
import org.Capstone.PageObjects.EnterInformationAuto;
import org.Capstone.PageObjects.HomePageAuto;
import org.Capstone.PageObjects.LoggedInAuto;
import org.Capstone.PageObjects.SignUpPageAuto;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC1 extends BaseConfigurationsAuto {
	
	public HomePageAuto homeobj;
	public SignUpPageAuto signupobj;
	public EnterInformationAuto infoobj;
	public AccountCreatedAuto createdobj;
	public LoggedInAuto loggedinobj;
	public AccountDeletedAuto deletedobj;
	
    WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		homeobj=new HomePageAuto(driver);
		signupobj=new SignUpPageAuto(driver);
		infoobj=new EnterInformationAuto(driver);
		createdobj=new AccountCreatedAuto(driver);
		loggedinobj=new LoggedInAuto(driver);
		deletedobj=new AccountDeletedAuto(driver);
		
	}

	
	@Test
	public void DemoScenario() throws InterruptedException, IOException
	{
		homeobj.ClickSignUpOrLogin();
		signupobj.SignUp();
		infoobj.CreateNewAccount();
		createdobj.AccountCreated();
		loggedinobj.AccountDeleted();
		deletedobj.AccountDeletedSuccessful();
	}
}
