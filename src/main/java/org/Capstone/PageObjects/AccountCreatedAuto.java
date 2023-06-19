package org.Capstone.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class AccountCreatedAuto {
	
	WebDriver driver;

	  public AccountCreatedAuto(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  @FindBy(xpath="//*[text()='Account Created!']")
	  public WebElement AccountCreatedHeading;
	  
	  @FindBy(xpath="//*[text()='Continue']")
	  public WebElement ContinueButton;
	  
	  public void AccountCreated()
	  {
		  Assert.assertTrue(AccountCreatedHeading.isDisplayed());
		  ContinueButton.click();
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		  
		  ContinueButton.click();
		  
	  }
	  
}  


