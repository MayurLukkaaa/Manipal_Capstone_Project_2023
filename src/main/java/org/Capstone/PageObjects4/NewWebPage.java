package org.Capstone.PageObjects4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewWebPage {
	
	WebDriver driver;

	  public NewWebPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  @FindBy(xpath=" //*[text()=' Signup / Login']")
	  public WebElement ClickSignUpOrLoginButton;
	  
	  public void SignuporLogin() {
		  
		  ClickSignUpOrLoginButton.click();
	  }

}
