package org.Capstone.PageObjects5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Review {
	
	WebDriver driver;

	  public Review(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  @FindBy(xpath="//*[text()='Write Your Review']")
	  public WebElement ReviewMsg;
	  
	  @FindBy(id="name")
	  public WebElement NameReview;
	  
	  @FindBy(id="email")
	  public WebElement EmailReview;
	  
	  @FindBy(id="review")
	  public WebElement WriteReview;
	  
	  @FindBy(id="button-review")
	  public WebElement SubmitReview;
	  
	  @FindBy(xpath = "//span[text()='Thank you for your review.']")
	   public WebElement Thankyou;
	  
	  
	  
	  public void EnterReview() throws IOException
	  {
		  
		  FileInputStream data = new FileInputStream("C:\\Users\\Mayur Lukka\\eclipse-workspace\\Capstone_Project_Axis\\src\\main\\java\\Config\\config.properties");
		  Properties p1 = new Properties();
		  p1.load(data);
		  
		  String NameRev = p1.getProperty("name");
		  String EmailRev = p1.getProperty("Login1");
		  String Reviews = p1.getProperty("review");
		  
		  ReviewMsg.isDisplayed();
		  NameReview.sendKeys(NameRev);
		  EmailReview.sendKeys(EmailRev);
		  WriteReview.sendKeys(Reviews);
		  SubmitReview.click();
		  Assert.assertTrue(Thankyou.isDisplayed());
	  }

}
