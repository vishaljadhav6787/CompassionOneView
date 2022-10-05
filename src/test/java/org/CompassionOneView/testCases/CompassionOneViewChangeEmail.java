package org.CompassionOneView.testCases;

import org.compassion.utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CompassionOneViewChangeEmail extends BaseClass{

	@Parameters({"username","password","Email"})
	@Test(groups = {"All","ChangeEmail"})
	public void changeEmail (@Optional("GC_4") String username, @Optional("G33con0404") String password,@Optional("bettieheron1@gmail.com.invalid") String Email ) {
		try {
		   System.out.println(">>>>>>>>>>>>>> START - CompassionOneViewChangeEmail <<<<<<<<<<<<<<<<<<<<");
	        
		   Actions a=new Actions(driver);
	
		    By byUsername = By.id("login-username");
	        By byPassword = By.id("login-password");
	        By bySignInButton = By.id("login");
	        By manageSupporter = By.xpath("(//div[@class='size-md float-left heading'])[2]");
	        By referSupporterID = By.xpath("(//td[6])[1]");
	        By supporterID = By.id("supporter_id");
	        By searchButton = By.id("search");
	        By manage = By.xpath("//a[text()='Manage']");
	        By changeEmail = By.xpath("(//div[@class='size-md float-left heading'])[4]");
	        By eMail = By.id("email");
	        By update = By.name("update");
	        By successfullyText = By.xpath("/html/body/div[3]/h2");
	        By okButton = By.xpath("//button[text()='OK']");
		   

	        Utilities.hardWait(3);
	        driver.findElement(byUsername).sendKeys(username);
	        driver.findElement(byPassword).sendKeys(password);
	        
	        Utilities.hardWait(3);
	        driver.findElement(bySignInButton).click();
	        
	        Utilities.hardWait(5);
	        driver.findElement(manageSupporter).click();
	        
	        Utilities.hardWait(5);
	        String supporter_ID = driver.findElement(referSupporterID).getText();
	        
	        Utilities.hardWait(10);
	        WebElement e = driver.findElement(supporterID);
	        a.moveToElement(e);
	        a.click();
	        
	        Utilities.hardWait(5);
	        a.sendKeys(supporter_ID).build().perform();
	        Utilities.hardWait(4);
	        
	        Utilities.hardWait(3);
	        driver.findElement(searchButton).click();
	        
	        Utilities.hardWait(5);
	        driver.findElement(manage).click();
	        
	        Utilities.hardWait(4);
	        driver.findElement(changeEmail).click();
	        
	        Utilities.hardWait(3);
	        driver.findElement(eMail).clear();
	        driver.findElement(eMail).sendKeys(Email);
	       
	        Utilities.hardWait(5);
	        driver.findElement(update).click();
	        
	        Utilities.hardWait(5);
	        String confirmationmessage = driver.findElement(successfullyText).getText();
		    System.out.println(confirmationmessage);
	        	        
	        Utilities.hardWait(5);
	        driver.findElement(okButton).click();
	        
	        System.out.println(">>>>>>>> END - CompassionOneViewChangeEmail <<<<<<<<<<<<<<<<<<<<");
	        
	     		 }   catch (Exception e) {
	     			e.printStackTrace();
	     			
	     				}
	     		}
	        
}
