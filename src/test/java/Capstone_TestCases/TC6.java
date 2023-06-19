package Capstone_TestCases;

import java.io.IOException;
import java.net.MalformedURLException;
import org.Capstone.BaseConfig.BaseConfigurationsAuto;
import org.Capstone.PageObjects4.ProductPage;
import org.Capstone.PageObjects5.AllProducts;
import org.Capstone.PageObjects5.Review;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC6 extends BaseConfigurationsAuto{
	
	public ProductPage productobj;
	public AllProducts allobj;
	public Review reviewobj;
    WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup2(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		productobj=new ProductPage(driver);
		allobj=new AllProducts(driver);
		reviewobj=new Review(driver);
	}

	
	@Test
	public void DemoScenario() throws IOException 
	{
		productobj.ClickProductPage();
		allobj.PerformReview();
		reviewobj.EnterReview();
	}

	
	

}
