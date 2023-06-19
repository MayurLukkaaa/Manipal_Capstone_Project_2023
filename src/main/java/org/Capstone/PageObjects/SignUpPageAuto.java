package org.Capstone.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SignUpPageAuto {
	
	WebDriver driver;

	  public SignUpPageAuto(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='New User Signup!']")
	  public WebElement NewUserSignUpHeading;
	  
	  @FindBy(xpath="//input[@name='name']")
	  public WebElement NameSignUp;
	  
	  @FindBy (xpath="(//input[@name='email'])[2]")
	  public WebElement EmailSignUp;
	  
	  @FindBy(xpath="//button[text()='Signup']")
	  public WebElement SignUpButton;
	  
	  
	  public static String email() {
	    	
	    	String emailAddress = "";
	    	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	    	while (emailAddress.length() < 5) {
	    	    int character = (int) (Math.random() * 26);
	    	    emailAddress += alphabet.substring(character, character + 1);
	    	emailAddress += Integer.valueOf((int) (Math.random() * 99)).toString();
	    	emailAddress += "@" + "gmail"+".com";
	   
	    }
	    	return emailAddress;
	    	}
	  
	  
	  public void SignUp( ) throws IOException {
		  
		  String EmailAddress = email();
		  
		  FileInputStream data = new FileInputStream("C:\\Users\\Mayur Lukka\\eclipse-workspace\\Capstone_Project_Axis\\src\\main\\java\\Config\\config.properties");
		  Properties p1 = new Properties();
		  p1.load(data);
		  
		  String n = p1.getProperty("name");
		  
  
		  Assert.assertTrue(NewUserSignUpHeading.isDisplayed());
		  NameSignUp.sendKeys(n);
		  EmailSignUp.sendKeys(EmailAddress);
		  SignUpButton.click();
		  
	  }

}
