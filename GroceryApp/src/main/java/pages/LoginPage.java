package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import utilities.FileUploadUtility;
//import utilities.PageUtility;

public class LoginPage
{
	public WebDriver driver;
//	PageUtility pageutility=new PageUtility();                  //for pageutility class
	//FileUploadUtility fileuploadutility=new FileUploadUtility();
	
	
	@FindBy(name="username")WebElement usernamefield;  //declared web elements
	@FindBy(name="password")WebElement passwordfield;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signinButtonField;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashBoard;
	@FindBy(xpath="//div[contains(@class,'alert-dismissible')]")WebElement alertMessage;
	
		
	public LoginPage(WebDriver driver) {   //constructor from LoginTest
		this.driver=driver;
		PageFactory.initElements(driver, this);    //initelements method: used for initializing web elements, this: current class instance driver, driver: local parameter
	}

	public void enterTheUsername(String username)    //parameterised constructor from LoginTest  
	{
		usernamefield.sendKeys(username);
	}
	
	public void enterThePassword(String password)
	{
		passwordfield.sendKeys(password);
	}
	
	public void signinButtonClick()
	{
		signinButtonField.click();
	}
	
//	public void dropDownCountry()
//	{
//		pageutility.selectByVisibleTextMethod("dropdownname", value);
		//fileuploadutility.fileUploadUsingRobotclass(Alertlogin, Constant.APPLE);
	
//	}
	
	public boolean isHomePageDisplayed()
	{
		return dashBoard.isDisplayed();
	}
	
	public boolean isAlertDisplayed()
	{
		return alertMessage.isDisplayed();
	}
}
