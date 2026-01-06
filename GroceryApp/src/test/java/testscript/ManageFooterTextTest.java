package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base{
	
	@Test
	
	public void isUserAbleToAddManageFooterText() throws IOException
	{
		LoginPage loginpage=new LoginPage(driver);
		//String username="admin";
		//String password="admin";
				
		String username = ExcelUtility.readStringData(1, 0, "LoginPage");
		String password = ExcelUtility.readStringData(1, 1, "LoginPage");
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);		
		loginpage.signinButtonClick();
		
		ManageFooterTextPage footertext=new ManageFooterTextPage();
		footertext.manageFooterTextMoreInfo();
		footertext.addIcon();
		footertext.addressField();
		footertext.updateButton();
		
	}

}
