package Rainbowtests;

import org.testng.annotations.Test;
import junit.framework.Assert;
import pages.LoginPage;

public class LoginTest extends BaseTest {
   @Test
	public void logintest() {	   	
		LoginPage loginp = new LoginPage(driver);
		loginp.login(loginemail, loginpassword);
		Assert.assertTrue(loginp.AvatarAppearance());
		System.out.println(loginp.AvatarAppearance());
		
		//String exp_title= "Rainbow by Alcatel-Lucent Enterprise"; 	   
	    //String Curr_window_title=driver.getTitle();
		//assertEquals(Curr_window_title,exp_title);
        //System.out.println("AssertEquals Test Passed\n");

	 } 
	}
