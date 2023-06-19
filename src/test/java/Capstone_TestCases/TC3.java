package Capstone_TestCases;

import java.io.IOException;
import java.net.MalformedURLException;
import org.Capstone.BaseConfig.BaseConfigurationsAuto;
import org.Capstone.PageObjects.HomePageAuto;
import org.Capstone.PageObjects2.LoginPage1;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC3 extends BaseConfigurationsAuto {
	
	public HomePageAuto Homeobj;
	public LoginPage1 Loginobj;
	
    WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup2(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		Homeobj=new HomePageAuto(driver);
		Loginobj=new LoginPage1(driver);
	
	}

	
	@Test
	public void DemoScenario() throws IOException
	{
		Homeobj.ClickSignUpOrLogin();
		Loginobj.LogInn();
	}

}
