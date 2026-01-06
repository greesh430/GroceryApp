package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LogoutPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base{

@Test

public void VerifyUserIsAbleToLogOut() throws IOException
{
	String username = ExcelUtility.readStringData(1, 0, "LoginPage");
	String password = ExcelUtility.readStringData(1, 1, "LoginPage");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterTheUsername(username);
	loginpage.enterThePassword(password);		
	loginpage.signinButtonClick();
	
	LogoutPage logoutpage=new LogoutPage();
	logoutpage.clickOnAdminButton();
	logoutpage.clickOnLogOutButton();
	logoutpage.isSignInButtonDisplayed();
}
}

