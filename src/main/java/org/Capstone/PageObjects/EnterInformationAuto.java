package org.Capstone.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;

public class EnterInformationAuto {
	
	WebDriver driver;

	  public EnterInformationAuto(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	  @FindBy(xpath="//*[text()='Enter Account Information']")
	  public WebElement EnterAccountInfo;
	  
	  @FindBy(id="id_gender1")
	  public WebElement Title;

	  @FindBy(id="password")
	  public WebElement PasswordSignUp;
	  
	  @FindBy(name="days")
	  public WebElement dobDay;
	  
	  @FindBy(name="months")
	  public WebElement dobMonth;
	  
	  @FindBy(name="years")
	  public WebElement dobYear;
	  
	  @FindBy(xpath="//label[text()='Sign up for our newsletter!']")
	  public WebElement NewsLetter;
	  
	  @FindBy(xpath="//label[text()='Receive special offers from our partners!']")
	  public WebElement SpecialOffers;
	  
	  @FindBy(id="first_name")
	  public WebElement FirstName;
	  
	  @FindBy(id="last_name")
	  public WebElement LastName;
	  
	  @FindBy(id="company")
	  public WebElement Company;
	  
	  @FindBy(id="address1")
	  public WebElement Address1;
	  
	  @FindBy(id="address2")
	  public WebElement Address2;
	  
	  @FindBy(id="country")
	  public WebElement CountryDropDown;
	  
	  @FindBy(id="state")
	  public WebElement State;
	  
	  @FindBy(id="city")
	  public WebElement City;
	  
	  @FindBy(id="zipcode")
	  public WebElement ZipCode;
	  
	  @FindBy(id="mobile_number")
	  public WebElement MobileNumber;
	  
	  @FindBy(xpath="//button[text()='Create Account']")
	  public WebElement CreateAccountButton;
	  
	  public void CreateNewAccount() throws IOException 
	  {
		  
		  FileInputStream data = new FileInputStream("C:\\Users\\Mayur Lukka\\eclipse-workspace\\Capstone_Project_Axis\\src\\main\\java\\Config\\config.properties");
		  Properties p1 = new Properties();
		  p1.load(data);
		  
		  String pass = p1.getProperty("password");
		  String FirstN = p1.getProperty("FirstName");
		  String LastN = p1.getProperty("LastName");
		  String Comp = p1.getProperty("Company");
		  String Add1 = p1.getProperty("Address1");
		  String Add2 = p1.getProperty("Address2");
		  String Stat = p1.getProperty("State");
		  String Cit = p1.getProperty("City");
		  String Zip = p1.getProperty("ZipCode");
		  String Mobile = p1.getProperty("MobileNumber");
		  
		  Title.click();
		  
		  PasswordSignUp.sendKeys(pass);
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,250)", "");
		  
		  Select day = new Select(dobDay);
		  day.selectByVisibleText("29");
		  
		  Select month = new Select(dobMonth);
		  month.selectByVisibleText("June");
		  
		  Select year = new Select(dobYear);
		  year.selectByVisibleText("1998");
		  
		  NewsLetter.click();
		  SpecialOffers.click();
		  
		  FirstName.sendKeys(FirstN);
		  LastName.sendKeys(LastN);
		  Company.sendKeys(Comp);
		  Address1.sendKeys(Add1);
		  Address2.sendKeys(Add2);
		  
		  JavascriptExecutor jsq = (JavascriptExecutor) driver;
	        jsq.executeScript("window.scrollBy(0,250)", "");
		  
		  Select country = new Select(CountryDropDown);
		  country.selectByVisibleText("India");
		  
		  State.sendKeys(Stat);
		  City.sendKeys(Cit);
		  ZipCode.sendKeys(Zip);
		  MobileNumber.sendKeys(Mobile);
		  
		  JavascriptExecutor jsw = (JavascriptExecutor) driver;
	        jsw.executeScript("window.scrollBy(0,250)", "");
		  
		  CreateAccountButton.click();
	  }
	 
}
