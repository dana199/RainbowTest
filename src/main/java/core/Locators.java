package core;

import org.openqa.selenium.By;

public class Locators {
	 public static final By EMAIL_FIELD = By.id("username");
	 public static final By Continue_BTN = By.xpath("//button[starts-with(@role,'button')]");
	 public static final By PASSWORD_FIELD = By.id("authPwd");
	 public static final By CONNECT_BTN =  By.xpath("//button[starts-with(@role,'button')]");
	 public static final By Close_BTN = By.xpath("/html/body/div[1]/popups[2]/div/whatsnew/userwindow/userwindow-header/div/button/svg-img/svg");
}
