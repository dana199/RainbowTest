package pages;

import org.openqa.selenium.WebDriver;

import core.Locators;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    public void login(String loginemail,String loginpassword) {
    	setFieldtext(Locators.EMAIL_FIELD, loginemail);
    	clickelement(Locators.Continue_BTN);
    	setFieldtext(Locators.PASSWORD_FIELD,loginpassword);
    	clickelement(Locators.CONNECT_BTN);
    }
}
