package org.CompassionOneView.testCases;

import java.time.Duration;

import org.compassion.config.PropertiesFile;
import org.compassion.utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	//public String baseURL="https://oneview.cukdev.co.uk/";
	//public String username="GC_4";
	//public String password="G33con0404";
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String dev;
	
	@Parameters({"env"})
	@BeforeMethod(groups = {"All", "Login", "NewRegistration"})
	public void setup (@Optional("dev") String env) {
		try {
			
			Reporter.log("************************ Browser Session Started ************************", true);
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();

//		To Handle Chrome Browser Crashes in server
			options.addArguments("--no-sandbox");
//			options.addArguments("--headless"); //should be enabled for Jenkins
			options.addArguments("--disable-dev-shm-usage"); //should be enabled for Jenkins
			options.addArguments("--window-size=1920x1080"); //should be enabled for Jenkinss
//			System.out.println("Baseclass:35" + Objects.isNull(driver));
			driver = new ChromeDriver(options);
//			System.out.println("Baseclass:38" + Objects.isNull(driver));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			driver.manage().window().maximize();
			System.out.println("Print the Environment: " + env);
			
			if(env.equals("dev")) {
				String devurl = PropertiesFile.Devurl();
				driver.navigate().to(devurl);
			} 
		}
	 catch(Exception e) 
	{
    	System.out.println(e.getMessage());
    	System.out.println(e.getStackTrace());
	}
    	
	}
	@AfterMethod(groups = {"All", "Login", "NewRegistration"})
	
	public void tearDown() {
	    Utilities.hardWait(5);
		driver.quit();
		
		Reporter.log("************************ Browser Session End ************************", true);
	}
}
