package Capstone_TestCases;

import java.io.IOException;
import java.net.MalformedURLException;
import org.Capstone.PageObjects4.ProductPage;
import org.Capstone.PageObjects5.AllProducts;
import org.Capstone.PageObjects5.Review;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mayur.Capstone_Project_Axis.Configurations;

public class TC6_TestNg extends Configurations {
	
	public ProductPage productobj;
	public AllProducts allobj;
	public Review reviewobj;
	WebDriver driver;

    
	@BeforeClass
	public void setup1() throws MalformedURLException
	{
		driver=getDriver();
		
		productobj=new ProductPage(driver);
		allobj=new AllProducts(driver);
		reviewobj=new Review(driver);
	}
	@Test
	public void scenarioDemo() throws InterruptedException, IOException
	{
		productobj.ClickProductPage();
		allobj.PerformReview();
		reviewobj.EnterReview();
	}


}
