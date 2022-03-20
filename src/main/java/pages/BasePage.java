package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core.Locators;


public class BasePage {
	public WebDriver driver;
	@SuppressWarnings("unused")
	private boolean element_Appearance;
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickelement(By locator) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(locator).click();	
	}
	public void setFieldtext(By locator, String text) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement element = driver.findElement(locator);
		element.clear();
		element.sendKeys(text);
	}
	public String getFieldtext(By locator) {
		return driver.findElement(locator).getText();
	}
	public boolean getelement(By Locator) {
		element_Appearance = false;
		WebElement element = driver.findElement(Locator);
		return element_Appearance = element.isDisplayed();
	}
	public boolean AvatarAppearance() {
		return (getelement(Locators.AVATAR_USR));
	}
	public boolean ValidateAccountError() {
		return (getelement(Locators.Unkown_error_please_contact_your_adminstrator));		
	}
	public boolean ValidatepasswordError() {
		return (getelement(Locators.Invalid_username_or_password));		
	}
}
