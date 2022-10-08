package org.CompassionOneView.testCases;

import org.compassion.utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CompassionOneViewChangeName extends BaseClass {
	

	@Parameters({"username","password","firstname","surname","SupporterId"})
	@Test(groups = {"All","ChangeName"})
	public void changeName (@Optional("GC_4") String username, @Optional("G33con0404") String password, @Optional("David") String firstname,
			                @Optional("Jackson") String surname, @Optional("709401") String SupporterId) {
		try {
		   System.out.println(">>>>>>>>>>>>>> START - CompassionOneViewChangeName <<<<<<<<<<<<<<<<<<<<");
	        
		   Actions a=new Actions(driver);

		    By byUsername = By.id("login-username");
	        By byPassword = By.id("login-password");
	        By bySignInButton = By.id("login");
	        By manageSupporter = By.xpath("(//div[@class='size-md float-left heading'])[2]");
	        By referSupporterID = By.xpath("(//td[6])[1]");
	        By supporterID = By.id("supporter_id");
	        By searchButton = By.id("search");
	        By manage = By.xpath("//a[text()='Manage']");
	        By changeName = By.xpath("(//div[@class='size-md float-left heading'])[1]");
	        By title = By.xpath("(//label[text()='TITLE']/following::select[1])");
	        By firstName = By.id("firstname");
	        By lastName = By.id("lastname");
	        By update = By.id("test1");
	        By successfullyText = By.xpath("/html/body/div[3]/h2");
	        By okButton = By.xpath("//button[text()='OK']");

		   

	        Utilities.hardWait(3);
	        driver.findElement(byUsername).sendKeys(username);
	        driver.findElement(byPassword).sendKeys(password);
	        
	        Utilities.hardWait(3);
	        driver.findElement(bySignInButton).click();
	        
	        Utilities.hardWait(5);
	        driver.findElement(manageSupporter).click();
	        
	        Utilities.hardWait(3);
	        driver.findElement(supporterID).clear();
	        driver.findElement(supporterID).sendKeys(SupporterId);
	        
	      /*  Utilities.hardWait(5);
	        String supporter_ID = driver.findElement(referSupporterID).getText();
	        System.out.println(supporter_ID);
	        Utilities.hardWait(10);
	        WebElement e = driver.findElement(supporterID);
	        a.moveToElement(e);
	        a.click();
	        
	        Utilities.hardWait(5);
	        a.sendKeys(supporter_ID).build().perform();
	        Utilities.hardWait(4);
	      */  
	        Utilities.hardWait(3);
	        driver.findElement(searchButton).click();
	        
	        Utilities.hardWait(5);
	        driver.findElement(manage).click();
	        
	        Utilities.hardWait(4);
	        driver.findElement(changeName).click();
	        
	        Utilities.hardWait(5);
	        selectDropDownValue(driver ,driver.findElement(title), "Mr");
	        	        
	        Utilities.hardWait(5);
	        driver.findElement(firstName).clear();
	        driver.findElement(firstName).sendKeys(firstname);
	        Utilities.hardWait(2);
	        driver.findElement(lastName).clear();
	        driver.findElement(lastName).sendKeys(surname);
	       	        
	        Utilities.hardWait(4);
	        driver.findElement(update).click();
	        
	        Utilities.hardWait(5);
	        String confirmationmessage = driver.findElement(successfullyText).getText();
		    System.out.println(confirmationmessage);
	        	        
	        Utilities.hardWait(5);
	        driver.findElement(okButton).click();
	        
	        System.out.println(">>>>>>>> END - CompassionOneViewChangeName <<<<<<<<<<<<<<<<<<<<");
	        
		 }   catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
				}
		}
		
		   
		 public void selectDropDownValue(WebDriver driver ,WebElement element, String value) {
		    	element.click();
		    	driver.findElement(By.xpath("(//option[text()='"+value+"'][1])")).click();
		    }
		   
		   
		   
		   
}
