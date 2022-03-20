package Rainbowtests;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import core.Locators;
import junit.framework.Assert;
import pages.LoginPage;

public class LoginTest extends BaseTest {	
	private String Invalid_Email = "123@dd";
	private String Invalid_pass = "invalidpass";

  @Test
	public void User_Can_login_Successfully() 
    {	
        LoginPage loginp = new LoginPage(driver);
		loginp.login(loginemail, loginpassword);
		loginp.clickelement(Locators.Close_BTN);
		Assert.assertTrue(loginp.AvatarAppearance());
		System.out.println(loginp.AvatarAppearance());
		System.out.println("Test Passed\n");
	 } 
	
   @Test
   public void User_Cant_login_with_Invalid_Email()
   {   
	    LoginPage loginp = new LoginPage(driver);
	    loginp.login(Invalid_Email,loginpassword);
	    Assert.assertTrue(loginp.ValidateAccountError());
	    System.out.println(loginp.ValidateAccountError());
		System.out.println("Test Passed\n");
   }
 
   @Test
   public void User_Cant_login_with_Invalid_pass() {
	   LoginPage loginp = new LoginPage(driver);
	   loginp.login(loginemail,Invalid_pass);
	   Assert.assertTrue(loginp.ValidatepasswordError());
   }
   
   @Test
   public void User_Cant_login_with_Invalid_Email_and_Invalid_pass() {
	   LoginPage loginp = new LoginPage(driver);
	   loginp.login(Invalid_Email,Invalid_pass);
	   Assert.assertTrue(loginp.ValidateAccountError());
   }
   
	}

