package core;

import org.openqa.selenium.By;

public class Locators {
	 public static final By EMAIL_FIELD = By.id("username");
	 public static final By Continue_BTN = By.xpath("//button[starts-with(@role,'button')]");
	 public static final By PASSWORD_FIELD = By.xpath("//*[@id=\"authPwd\"]");
	 public static final By CONNECT_BTN =  By.xpath("//button[starts-with(@role,'button')]");
	 public static final By Close_BTN = By.xpath("/html/body/div[1]/popups[2]/div/whatsnew/userwindow/userwindow-footer/square-button/button");
	 public static final By AVATAR_USR = By.xpath("//*[@id=\"userAvatar\"]");
	 public static final By Unkown_error_please_contact_your_adminstrator = By.cssSelector(".authWindowContent__information > div:nth-child(1)");
	 public static final By Invalid_username_or_password =By.xpath("/html/body/div[1]/authentication-component/authentication-window/div/div/main/authenticationwindowcontent/h2/div");
}
