package Capstone_TestCases;

import java.net.MalformedURLException;
import org.Capstone.BaseConfig.BaseConfigurationsAuto;
import org.Capstone.PageObjects3.CartPage;
import org.Capstone.PageObjects3.Homepage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC4 extends BaseConfigurationsAuto{
	
	public Homepage homeobj;
	public CartPage cartobj;
    WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup2(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		homeobj=new Homepage(driver);
		cartobj=new CartPage(driver);
	}

	
	@Test
	public void DemoScenario() throws InterruptedException 
	{
		homeobj.testcase4();
		cartobj.RemoveCart();
	}


}
