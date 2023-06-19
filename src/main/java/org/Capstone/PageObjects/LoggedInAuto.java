package org.Capstone.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoggedInAuto {
	

	WebDriver driver;

	  public LoggedInAuto(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  @FindBy(xpath=" //*[text()=' Logged in as ']")
	  public WebElement LoggedInHeading;
	  
	  @FindBy(xpath="//*[text()=' Delete Account']")
	  public WebElement DeleteAccountButton;
	  
	  public void AccountDeleted()
	  {
		  Assert.assertTrue(LoggedInHeading.isDisplayed());
		  
		  DeleteAccountButton.click();
	  }
}
