package org.Capstone.PageObjects1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDeletedMsg {
	
	WebDriver driver;

	  public AccountDeletedMsg(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  @FindBy(xpath="//*[text()=' Logout']")
	  public WebElement Logout;
	  
	  
	  
	  public void AccountDeletedSuccessfully()
	  {
		  Logout.click();
		  
	  }


}
