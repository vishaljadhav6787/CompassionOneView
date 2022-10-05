package org.CompassionOneView.testCases;

import org.compassion.utilities.Utilities;
import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CompassionOneViewLogin extends BaseClass{
	
		
	@Parameters({"username","password"})
	@Test (groups = {"All","Login"})
	public void loginTest(@Optional("GC_4") String username, @Optional("G33con0404") String password) {
		try {
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
		}   catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
		}
	}
	}
	 

