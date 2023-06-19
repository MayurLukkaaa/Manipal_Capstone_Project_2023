package Capstone_TestCases;

import java.io.IOException;
import java.net.MalformedURLException;
import org.Capstone.BaseConfig.BaseConfigurationsAuto;
import org.Capstone.PageObjects1.LoginPage;
import org.Capstone.PageObjects4.AllProductsPage;
import org.Capstone.PageObjects4.CartClick;
import org.Capstone.PageObjects4.NewWebPage;
import org.Capstone.PageObjects4.ProductPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC5 extends BaseConfigurationsAuto {
	
	
	public ProductPage productobj;
	public AllProductsPage allproductobj;
	public NewWebPage newpageobj;
	public LoginPage loginobj;
	public CartClick cartobj;
    WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup2(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		productobj=new ProductPage(driver);
		allproductobj=new AllProductsPage(driver);
		newpageobj= new NewWebPage(driver);
		loginobj= new LoginPage(driver);
		cartobj= new CartClick(driver);
	}

	
	@Test
	public void DemoScenario() throws IOException 
	{
		productobj.ClickProductPage();
		allproductobj.AllProducts();
		newpageobj.SignuporLogin();
		loginobj.LogIn();
		cartobj.ClickonCart();
	}



}
