package org.Capstone.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HomePageAuto {
	
	WebDriver driver;

	  public HomePageAuto(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  @FindBy(xpath="//*[text()=' Home'][@style='color: orange;']")
	   public WebElement HomePage;

	  @FindBy(xpath="//*[text()=' Signup / Login']")
	  public WebElement SignupOrLogin;
	  
	  
	   public void ClickSignUpOrLogin() 
	  {
		   Assert.assertEquals(HomePage.isDisplayed(), true);
		   
		   SignupOrLogin.click();
	   }
	}

