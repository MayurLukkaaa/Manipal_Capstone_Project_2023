package org.Capstone.PageObjects1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	WebDriver driver;

	  public LoginPage(WebDriver driver)
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
	  
	  public void LogIn() throws IOException {
		  
		  FileInputStream data = new FileInputStream("C:\\Users\\Mayur Lukka\\eclipse-workspace\\Capstone_Project_Axis\\src\\main\\java\\Config\\config.properties");
		  Properties p1 = new Properties();
		  p1.load(data);
		  
		  String Login = p1.getProperty("Login1");
		  String Passw = p1.getProperty("Password1");
		  
		  Assert.assertTrue(LoginHeading.isDisplayed());
		  LoginEmail.sendKeys(Login);
		  LoginPassword.sendKeys(Passw);
		  LoginButton.click();
		  
	  }

}
