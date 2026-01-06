package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserPage {
	
	public WebDriver driver;
	
	@FindBy(name="username")WebElement usernamefield;  
	@FindBy(name="password")WebElement passwordfield;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signinButtonField;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']") WebElement adminusermoreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newadminuserbutton;
	@FindBy(xpath="//input[@class='form-control']")WebElement enterusername;
	@FindBy(id="password")WebElement enterpassword;
	@FindBy(id="user_type")WebElement usertype;
	@FindBy(name="Create")WebElement savebutton;
	
	public AdminUserPage(WebDriver driver) 
	{
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
	
	public void adminUserMoreInfo()
	{
		adminusermoreinfo.click();
	}
	
	public void newAdminUserAdd()
	{
		newadminuserbutton.click();
	}
	
	public void enterUsername()
	{
		enterusername.sendKeys("admin");
	}
	
	public void enterPassword()
	{
		enterpassword.sendKeys("admin");
	}
	
	public void enterUserType()
	{
		Select select=new Select(usertype);
		select.selectByIndex(1);
	}
	
	public void saveAdminUserInformation()
	{
		savebutton.click();
	}
	
	
	

}
