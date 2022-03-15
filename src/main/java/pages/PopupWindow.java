package pages;

import org.openqa.selenium.WebDriver;

import core.Locators;

public class PopupWindow extends BasePage {

	public PopupWindow(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void closewindow(){
		clickelement(Locators.Close_BTN);
	}
}
