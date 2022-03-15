package logintest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import core.propertyReader;
import pages.LoginPage;

public class LoginTest {
	public String Browser = "" ;
	public static WebDriver driver;
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
	      case"chrome":
	    	  System.setProperty("webdriver.chrome.driver", driverPath0);
	    	  driver = new ChromeDriver();
	    	  driver.manage().window().maximize();  // maximize the browser window
	    	  driver.get(baseUrl); //open the application url
	    	  break;
	      case "firefox":
	    	  System.setProperty("webdriver.gecko.driver", driverPath);
	    	  driver = new FirefoxDriver();
	    	  driver.manage().window().maximize();  // maximize the browser window
	    	  driver.get(baseUrl); //open the application url
	    	  break;
	    	  }
	}

	private String getbrowser() throws IOException {
		return  propertyReader.getPropertiesFile("Browser");
	}

	private String getloginemail() throws IOException {
		// TODO Auto-generated method stub
		return propertyReader.getPropertiesFile("email");
	}
	private String getloginpassword() throws IOException {
		return propertyReader.getPropertiesFile("password");		
	}
	@BeforeTest
	public void logintest() {
		LoginPage loginp = new LoginPage(driver);
		loginp.login(loginemail, loginpassword);		
	}
}
