package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	
	@Test(priority=1)
	
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException
	{
		//String username="admin";
		//String password="admin";
		
		String username = ExcelUtility.readStringData(1, 0, "LoginPage");
		String password = ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);		
		loginpage.signinButtonClick();
		boolean homePage = loginpage.isHomePageDisplayed();
		Assert.assertTrue(homePage);     //hard assertion, classname.methodname
	
	}
	
	@Test(priority=2)
	
	public void verifyTheUserIsAbleToLoginUsingInvalidCredentials() throws IOException
	{
		//String username="admins";
		//String password="admins";
		
		String username = ExcelUtility.readStringData(4, 0, "LoginPage");
		String password = ExcelUtility.readStringData(4, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);		
		loginpage.signinButtonClick();
		boolean alert = loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
	}
	
	@Test(priority=3)
	
	public void verifyTheUserIsAbleToLoginUsingValidUsernameAndInvalidPassword() throws IOException
	{	
		//String username="admin";
		//String password="admins";
		
		String username = ExcelUtility.readStringData(2, 0, "LoginPage");
		String password = ExcelUtility.readStringData(2, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);		
		loginpage.signinButtonClick();
		boolean alert = loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
	}
	
@Test(priority=4)
	
	public void verifyTheUserIsAbleToLoginUsingInValidUsernameAndValidPassword() throws IOException
	{	
		//String username="admins";
		//String password="admin";
	
	String username = ExcelUtility.readStringData(3, 0, "LoginPage");
	String password = ExcelUtility.readStringData(3, 1, "LoginPage");
	
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);		
		loginpage.signinButtonClick();
		boolean alert = loginpage.isAlertDisplayed();
		Assert.assertTrue(alert);
	}


}

