package org.Capstone.PageObjects4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AllProductsPage {
	
	WebDriver driver;


	  public AllProductsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  @FindBy(xpath="//*[text()=' Products'][@style='color: orange;']")
	   public WebElement AllPro;
	  
	  @FindBy(xpath="//*[@id='search_product']")
	  public WebElement SearchBar;
	  
	  @FindBy(id="submit_search")
	  public WebElement SearchButton;
	  
	  @FindBy(xpath="//*[text()='Searched Products']")
	  public WebElement SearchedProductHeading;
	  
//	  @FindBy(xpath="(//*[contains(text(),'Dress')])[3]")
//	  public WebElement Dress1;
//	  
//	  @FindBy(xpath="(//*[contains(text(),'Dress')])[5]")
//	  public WebElement Dress2;
//	  
//	  @FindBy(xpath="(//*[text()='Sleeves Top and Short - Blue & Pink']")
//	  public WebElement Dress3;
//	  
//	  @FindBy(xpath="//*[text()='Sleeveless Unicorn Patch Gown - Pink']")
//	  public WebElement Dress4;
//	  
//	  
//	  @FindBy(xpath="(//*[contains(text(),'Dress')])[7]")
//	  public WebElement Dress5;
//	  
//	  @FindBy(xpath="(//*[contains(text(),'Dress')])[9]")
//	  public WebElement Dress6;
//	  
//	  @FindBy(xpath="(//*[contains(text(),'Dress')])[11]")
//	  public WebElement Dress7;
//	  
//	  @FindBy(xpath="(//*[contains(text(),'Dress')])[13]")
//	  public WebElement Dress8;
//	  
//	  @FindBy(xpath="(//*[contains(text(),'Dress')])[15]")
//	  public WebElement Dress9;
	  
	 
	  
	  @FindBy(xpath="(//*[text()='Add to cart'])[1]")
	  public WebElement Addcart1;
	  

	  @FindBy(xpath="(//*[text()='Add to cart'])[3]")
	  public WebElement Addcart2;
	  

	  @FindBy(xpath="(//*[text()='Add to cart'])[5]")
	  public WebElement Addcart3;
	  
	  @FindBy(xpath="(//*[text()='Add to cart'])[7]")
	  public WebElement Addcart4;
	  
	  @FindBy(xpath="(//*[text()='Add to cart'])[9]")
	  public WebElement Addcart5;
	  
	  @FindBy(xpath="(//*[text()='Add to cart'])[11]")
	  public WebElement Addcart6;
	  
	  @FindBy(xpath="(//*[text()='Add to cart'])[13]")
	  public WebElement Addcart7;
	  
	  @FindBy(xpath="(//*[text()='Add to cart'])[15]")
	  public WebElement Addcart8;
	  
	  @FindBy(xpath="(//*[text()='Add to cart'])[17]")
	  public WebElement Addcart9;
	  
	  @FindBy(xpath="//button[text()='Continue Shopping']")
	  public WebElement ContinueButton;
	  
	  @FindBy(xpath="//*[text()=' Cart']")
	  public WebElement Cartbutton;
	  
	  public void AllProducts()
	  {
		Assert.assertEquals(AllPro.isDisplayed(), true);
		SearchBar.sendKeys("dress");
		SearchButton.click();
		Assert.assertTrue(SearchedProductHeading.isDisplayed());
		
		Actions act = new Actions(driver);
		
		JavascriptExecutor jsq = (JavascriptExecutor) driver;
        jsq.executeScript("window.scrollBy(0,500)", "");
		
		act.moveToElement(Addcart1).click().build().perform();;
		ContinueButton.click();
		
		act.moveToElement(Addcart2).click().build().perform();
		ContinueButton.click();
		
		act.moveToElement(Addcart3).click().build().perform();
		ContinueButton.click();
		
		JavascriptExecutor jst = (JavascriptExecutor) driver;
        jst.executeScript("window.scrollBy(0,600)", "");
		
		act.moveToElement(Addcart4).click().build().perform();
		ContinueButton.click();
		
		act.moveToElement(Addcart5).click().build().perform();
		ContinueButton.click();
		
		act.moveToElement(Addcart6).click().build().perform();
		ContinueButton.click();
		
		JavascriptExecutor jss = (JavascriptExecutor) driver;
        jss.executeScript("window.scrollBy(0,550)", "");
		
		act.moveToElement(Addcart7).click().build().perform();
		ContinueButton.click();
		
		act.moveToElement(Addcart8).click().build().perform();
		ContinueButton.click();
		
		act.moveToElement(Addcart9).click().build().perform();
		ContinueButton.click();
		
		JavascriptExecutor jsb = (JavascriptExecutor) driver;
        jsb.executeScript("window.scrollBy(0,-1600)", "");
		
		Cartbutton.click();
	  }

	  
	  

}
