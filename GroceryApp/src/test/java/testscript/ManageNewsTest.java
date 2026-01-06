package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{

@Test

public void verifyUserIsAbleToClickManageNewsAndEnterText() throws IOException
{
	LoginPage loginpage=new LoginPage(driver);
	//String username="admin";
	//String password="admin";
			
	String username = ExcelUtility.readStringData(1, 0, "LoginPage");
	String password = ExcelUtility.readStringData(1, 1, "LoginPage");
	loginpage.enterTheUsername(username);
	loginpage.enterThePassword(password);		
	loginpage.signinButtonClick();
	
	ManageNewsPage managenewspage=new ManageNewsPage(driver);	
	managenewspage.manageNewsMoreInfo();
	managenewspage.manageNewsNewButton();
	managenewspage.manageNewsAddText();
	managenewspage.manageNewsSave();
	managenewspage.isAlertDisplayed();
	
}
	
	
	

}

