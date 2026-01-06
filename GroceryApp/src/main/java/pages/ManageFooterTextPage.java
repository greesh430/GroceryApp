package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage {
	public WebDriver driver;
	
	@FindBy(name="username")WebElement usernamefield;  
	@FindBy(name="password")WebElement passwordfield;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signinButtonField;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext']") WebElement managefootertextmoreinfo;
	@FindBy(xpath="//i[contains(@class,'fa-edit')]") WebElement addicon;	
	@FindBy(name="address")WebElement addressfield;
	@FindBy(name="Update")WebElement updatebutton;
	
	public void ManageFooterText(WebDriver driver) {   
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
	
	public void manageFooterTextMoreInfo()
	{
		managefootertextmoreinfo.click();
	}
	
	public void addIcon()
	{
		addicon.click();
	}
	
	public void addressField()
	{
		addressfield.clear();
		addressfield.sendKeys("abc");
	}
	
	public void updateButton()
	{
		updatebutton.click();
	}

}
