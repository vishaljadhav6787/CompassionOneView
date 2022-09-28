package Com.CompassionOneView.testCases;

import org.compassion.utilities.Utilities;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CompassionOneViewLogin extends BaseClass{
	
	public String username="GC_4";
	public String password="G33con0404";
	@Test
	public void loginTest() {
		
		   System.out.println(">>>>>>>>>>>>>> START - CompassionWebsiteLogin <<<<<<<<<<<<<<<<<<<<");
	        

	        By byUsername = By.id("login-username");
	        By byPassword = By.id("login-password");
	        By bySignInButton = By.id("login");
	        

	        Utilities.hardWait(3);
	        driver.findElement(byUsername).sendKeys(username);
	        driver.findElement(byPassword).sendKeys(password);
	        
	        Utilities.hardWait(3);
	        driver.findElement(bySignInButton).click();

	        System.out.println(">>>>>>>> END - CompassionWebsiteLogin <<<<<<<<<<<<<<<<<<<<");
	
	
	}
}
	 

