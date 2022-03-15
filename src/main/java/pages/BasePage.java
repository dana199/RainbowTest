package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	public WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickelement(By locator) {
		driver.findElement(locator).click();	
	}
	public void setFieldtext(By locator, String text) {
		WebElement element = driver.findElement(locator);
		element.clear();
		element.sendKeys(text);
	}
	public String getFieldtext(By locator) {
		return driver.findElement(locator).getText();
	}
}
