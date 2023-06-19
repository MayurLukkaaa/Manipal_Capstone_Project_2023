package Capstone_TestCases;

import java.io.IOException;
import java.net.MalformedURLException;
import org.Capstone.BaseConfig.BaseConfigurationsAuto;
import org.Capstone.PageObjects.HomePageAuto;
import org.Capstone.PageObjects.LoggedInAuto;
import org.Capstone.PageObjects1.AccountDeletedMsg;
import org.Capstone.PageObjects1.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC2 extends BaseConfigurationsAuto {
	
	public HomePageAuto homeObj;
	public LoginPage loginObj;
	public LoggedInAuto loggedinObj;
	public AccountDeletedMsg deletedObj;
	
	
    WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup2(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		homeObj=new HomePageAuto(driver);
		loginObj=new LoginPage(driver);
		loggedinObj=new LoggedInAuto(driver);
		deletedObj=new AccountDeletedMsg(driver);
		
	}

	
	@Test
	public void DemoScenario() throws IOException
	{
		homeObj.ClickSignUpOrLogin();
		loginObj.LogIn();
		loggedinObj.AccountDeleted();
		deletedObj.AccountDeletedSuccessfully();
		
	}

}
