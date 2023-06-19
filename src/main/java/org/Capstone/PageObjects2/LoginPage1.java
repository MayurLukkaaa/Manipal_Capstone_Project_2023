package org.Capstone.PageObjects2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage1 {
	
	WebDriver driver;

	  public LoginPage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	  
	  @FindBy(xpath="//h2[text()='Login to your account']")
	  public WebElement LoginHeading;
	  
	  @FindBy(name="email")
	  public WebElement LoginEmail;
	  
	  @FindBy (name="password")
	  public WebElement LoginPassword;
	  
	  @FindBy(xpath="//button[text()='Login']")
	  public WebElement LoginButton;
	  
	  public void LogInn( ) throws IOException {
		  
		  FileInputStream data = new FileInputStream("C:\\Users\\Mayur Lukka\\eclipse-workspace\\Capstone_Project_Axis\\src\\main\\java\\Config\\config.properties");
		  Properties p1 = new Properties();
		  p1.load(data);
		  
		  String Login2 = p1.getProperty("Login2");
		  String Passw2 = p1.getProperty("Password2");
		  
		  Assert.assertTrue(LoginHeading.isDisplayed());
		  LoginEmail.sendKeys(Login2);
		  LoginPassword.sendKeys(Passw2);
		  LoginButton.click();
		  
	  }


}
