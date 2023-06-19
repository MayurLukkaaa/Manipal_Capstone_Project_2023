package org.Capstone.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AccountDeletedAuto {
	
	WebDriver driver;

	  public AccountDeletedAuto(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  @FindBy(xpath="//*[text()='Account Deleted!']")
	  public WebElement AccountDeletedHeading;
	  
	  @FindBy(xpath="//*[text()='Continue']")
	  public WebElement ContinueButton1;
	  
	  public void AccountDeletedSuccessful() throws InterruptedException
	  {
		  Assert.assertTrue(AccountDeletedHeading.isDisplayed());
		  Thread.sleep(1000);
		  ContinueButton1.click();
	  }

}
