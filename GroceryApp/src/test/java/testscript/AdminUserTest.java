package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base{

@Test
	
	public void adminUserInformations() throws IOException
	{
		String username = ExcelUtility.readStringData(1, 0, "LoginPage");
		String password = ExcelUtility.readStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);		
		loginpage.signinButtonClick();
		
		AdminUserPage adminuser=new AdminUserPage(driver);
		adminuser.adminUserMoreInfo();
		adminuser.newAdminUserAdd();
		adminuser.enterUsername();
		adminuser.enterPassword();
		adminuser.enterUserType();
		
	}
	

}

