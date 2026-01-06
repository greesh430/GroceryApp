package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	public WebDriver driver;
	
	@FindBy(name="username")WebElement usernamefield;  
	@FindBy(name="password")WebElement passwordfield;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signinbuttonfield;
	@FindBy(xpath="//a[@class='nav-link']")WebElement adminbutton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logoutbutton;
	
	
	public void LoginPage(WebDriver driver) {   
		this.driver=driver;
		PageFactory.initElements(driver, this);    
	}

	public void enterTheUsername(String username)    
	{
		usernamefield.sendKeys(username);
	}
	
	public void enterThePassword(String password)
	{
		passwordfield.sendKeys(password);
	}
	
	public void signinButtonClick()
	{
		signinbuttonfield.click();
	}
	
	public void clickOnAdminButton()
	{
		adminbutton.click();
	}
	
	public void clickOnLogOutButton()
	{
		logoutbutton.click();
	}
	
	public boolean isSignInButtonDisplayed()
	{
		return signinbuttonfield.isDisplayed();
	}

}
