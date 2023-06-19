package Capstone_TestCases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.Capstone.PageObjects1.LoginPage;
import org.Capstone.PageObjects4.AllProductsPage;
import org.Capstone.PageObjects4.CartClick;
import org.Capstone.PageObjects4.NewWebPage;
import org.Capstone.PageObjects4.ProductPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mayur.Capstone_Project_Axis.Configurations;

public class TC5_TestNg extends Configurations {
	
	public ProductPage productobj;
	public AllProductsPage allproductobj;
	public NewWebPage newpageobj;
	public LoginPage loginobj;
	public CartClick cartobj;
	WebDriver driver;

    
	@BeforeClass
	public void setup1() throws MalformedURLException
	{
		driver=getDriver();
		
		productobj=new ProductPage(driver);
		allproductobj=new AllProductsPage(driver);
		newpageobj= new NewWebPage(driver);
		loginobj= new LoginPage(driver);
		cartobj= new CartClick(driver);
	}
	@Test
	public void scenarioDemo() throws InterruptedException, IOException
	{
		productobj.ClickProductPage();
		allproductobj.AllProducts();
		newpageobj.SignuporLogin();
		loginobj.LogIn();
		cartobj.ClickonCart();
	}

}
