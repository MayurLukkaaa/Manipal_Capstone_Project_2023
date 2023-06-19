package org.Capstone.PageObjects3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage {
	
	WebDriver driver;

	  public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  @FindBy(xpath="//*[text()=' Cart'][@style='color: orange;']")
	   public WebElement Cartpage;
	  
	  @FindBy(xpath="//i[@class='fa fa-times'][1]")
	  public WebElement Remove1;
	  
	  @FindBy(xpath="//i[@class='fa fa-times'][1]")
	  public WebElement Remove2;
	  
	  @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
	  public WebElement Remove3;
	  
	  @FindBy(xpath = "(//a[@class='cart_quantity_delete'])[1]")
	  public WebElement Remove4;
	  
	  @FindBy(xpath = "//a[@class='cart_quantity_delete']")
	  public WebElement Remove5;
	  
	  @FindBy (xpath="//*[text()='Cart is empty!']")
	  public WebElement EmptyCart;
	  
	  public void RemoveCart() throws InterruptedException
	  {
		  Assert.assertEquals(Cartpage.isDisplayed(), true);
		  Remove1.click();
		  Thread.sleep(2000);
		  Remove2.click();
		  Thread.sleep(2000);
		  Remove3.click();
		  Thread.sleep(2000);
		  Remove4.click();
		  Thread.sleep(2000);
		  Remove5.click();
		  
		  Assert.assertTrue(EmptyCart.isDisplayed());
	  }
	  

}
