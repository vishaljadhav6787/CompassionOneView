package Com.CompassionOneView.testCases;

import java.time.Duration;

import org.compassion.utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public String baseURL="https://oneview.cukdev.co.uk/";
	public String username="GC_4";
	public String password="G33con0404";
	public WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		//System.setProperty("webdiver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  //  driver=new ChromeDriver();
	    driver.get(baseURL);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
	    
	}

	@AfterClass
	public void tearDown() {
	    Utilities.hardWait(5);
		driver.quit();
	}
}
