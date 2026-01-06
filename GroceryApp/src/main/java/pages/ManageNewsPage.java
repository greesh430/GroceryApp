package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;
	
	@FindBy(name="username")WebElement usernamefield;  
	@FindBy(name="password")WebElement passwordfield;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signinButtonField;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']") WebElement managenewsmoreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger'])") WebElement managenewsnewbutton;
	@FindBy(xpath="//textarea[@id='news']") WebElement managenewsaddtext;
	@FindBy(xpath="//button[@class='btn btn-danger']") WebElement managenewssave;
	@FindBy(xpath="//div[contains(@class, 'alert-dismissible']") WebElement managenewsalertmessage;
	
	public ManageNewsPage(WebDriver driver) {   
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
		signinButtonField.click();
	}
	
	public void manageNewsMoreInfo()
	{
		managenewsmoreinfo.click();
	}
	public void manageNewsNewButton()
	{
		managenewsnewbutton.click();
	}
	public void manageNewsAddText()
	{
		managenewsaddtext.sendKeys("hello");
	}
	public void manageNewsSave()
	{
		managenewssave.click();
	}
	public boolean isAlertDisplayed()
	{
		return managenewsalertmessage.isDisplayed();
	}

}

