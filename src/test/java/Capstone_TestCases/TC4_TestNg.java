package Capstone_TestCases;

import java.net.MalformedURLException;


import org.Capstone.PageObjects3.CartPage;
import org.Capstone.PageObjects3.Homepage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Mayur.Capstone_Project_Axis.Configurations;

public class TC4_TestNg extends Configurations {
	
	public Homepage homeobj;
	public CartPage cartobj;
	WebDriver driver;

    
	@BeforeClass
	public void setup1() throws MalformedURLException
	{
		driver=getDriver();
		
		homeobj=new Homepage(driver);
		cartobj=new CartPage(driver);
	}
	@Test
	public void scenarioDemo() throws InterruptedException
	{
		homeobj.testcase4();
		cartobj.RemoveCart();
	}

}
