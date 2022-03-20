package Rainbowtests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import core.propertyReader;

public class BaseTest {
	public String Browser = "" ;
	public WebDriver driver;
	public String baseUrl="https://web.openrainbow.com/rb/2.100.16/index.html#/login";
	String driverPath0="/Rainbowtest/src/main/resources/Driver/chromedriver.exe";
	String driverPath="/Rainbowtest/src/main/resources/Driver/geckodriver.exe";
	public String loginemail = "" ;
	public String loginpassword = "" ;	
	  
	@BeforeSuite
	public void launchBrowser() throws IOException {
		 Browser= getbrowser();
		  System.out.println("launching browser . . . ");
		//Setter and Getter Email & Pass
		    this.loginemail=this.getloginemail();
		    this.loginpassword=this.getloginpassword();
	      switch(Browser) {
	      case "chrome":
	    	  System.setProperty("webdriver.chrome.driver", driverPath0);
	    	  driver = new ChromeDriver();
	    	  driver.manage().window().maximize();  // maximize the browser window
	    	  //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);// Wait For Page To Load
	    	  driver.get(baseUrl); //open the application url	    	   
	    	  break;
	      case "firefox":
	    	  System.setProperty("webdriver.gecko.driver", driverPath);
	    	  driver = new FirefoxDriver();
	    	  driver.manage().window().maximize();  // maximize the browser window
	    	  //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);// Wait For Page To Load
	    	  driver.get(baseUrl); //open the application url
	    	  break;
	    	  }
	}	
	private String getbrowser() throws IOException {
	  	return  propertyReader.getPropertiesFile("Browser");
	}
	private String getloginpassword() throws IOException {
		// TODO Auto-generated method stub
		return propertyReader.getPropertiesFile("password");
	}
	private String getloginemail() throws IOException {
		// TODO Auto-generated method stub
		return propertyReader.getPropertiesFile("email");
	}
}
