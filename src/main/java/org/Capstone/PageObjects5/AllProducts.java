package org.Capstone.PageObjects5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class AllProducts {
	

	WebDriver driver;

	  public AllProducts(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  @FindBy(xpath="//*[text()=' Products'][@style='color: orange;']")
	   public WebElement AllProduct;
	  
	  @FindBy(xpath="(//*[text()='View Product'])[1]")
	  public WebElement ClickViewProduct;
	  
	  public void PerformReview() {
		  
		  Assert.assertEquals(AllProduct.isDisplayed(), true);
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,450)", "");
	        
		  ClickViewProduct.click();
	  }
	  
	  
	  

}
