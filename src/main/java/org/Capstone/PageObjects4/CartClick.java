package org.Capstone.PageObjects4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartClick {
	
	WebDriver driver;

	  public CartClick(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  @FindBy(xpath="//*[text()=' Cart']")
	  public WebElement CartLbl;
	  
	  public void ClickonCart()
	  {
		  CartLbl.click();
	  }

}
