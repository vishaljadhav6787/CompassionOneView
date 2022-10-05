package org.CompassionOneView.testCases;

import org.compassion.utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CompassionOneViewChangeAll extends BaseClass {
	
	@Parameters({"username","password","Email","firstname","lastname"})
	@Test(groups = {"All","ChangeAll"})
	public void changeAll (@Optional("GC_4") String username, @Optional("G33con0404") String password,@Optional("bettieheron1@gmail.com.invalid") String Email,
			@Optional("David") String firstname,@Optional("Jackson") String lastname) 
	
	{
		try {
		   System.out.println(">>>>>>>>>>>>>> START - CompassionOneViewChangeAll <<<<<<<<<<<<<<<<<<<<");
	        
		   Actions a=new Actions(driver);
	
		    By byUsername = By.id("login-username");
	        By byPassword = By.id("login-password");
	        By bySignInButton = By.id("login");
	        By manageSupporter = By.xpath("(//div[@class='size-md float-left heading'])[2]");
	        By referSupporterID = By.xpath("(//td[6])[1]");
	        By supporterID = By.id("supporter_id");
	        By searchButton = By.id("search");
	        By manage = By.xpath("//a[text()='Manage']");
	        By changeAll = By.xpath("(//div[@class='size-md float-left heading'])[5]");
	        By title = By.xpath("(//label[text()='TITLE']/following::select[1])");
	        By firstName = By.id("firstname");
	        By lastName = By.id("lastname");
	        By next=By.id("test1");//name
	        By addressLine1 = By.id("address1");
	        By town = By.id("town");
	        By country = By.id("county");
	        By postCode = By.id("postcode");
	        By reason = By.xpath("(//label[text()='REASON']/following::select[1])[1]");
	        By update = By.id("section1");//address
	        By nextButton = By.id("change_phone");//phone
	        By homePhone = By.id("homephone");
	        By mobilePhone = By.id("mobilephone");
	        By eMail = By.id("email");
	        By updateButton = By.name("update");//email
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
	        
	        Utilities.hardWait(5);
	        driver.findElement(changeAll).click();
	        
	        Utilities.hardWait(5);
	        selectDropDownValue(driver ,driver.findElement(title), "Mr");
	        	        
	        Utilities.hardWait(5);
	        driver.findElement(firstName).clear();
	        driver.findElement(firstName).sendKeys(firstname);
	        Utilities.hardWait(2);
	        driver.findElement(lastName).clear();
	        driver.findElement(lastName).sendKeys(lastname);
	       	        
	        Utilities.hardWait(4);
	        driver.findElement(next).click();
	        
	        Utilities.hardWait(5);
	        String confirmationmessage = driver.findElement(successfullyText).getText();
		    System.out.println(confirmationmessage);
	        	        
	        Utilities.hardWait(5);
	        driver.findElement(okButton).click();
	        
	        Utilities.hardWait(3);
	        driver.findElement(addressLine1).clear();
	        driver.findElement(addressLine1).sendKeys("10 Downing Street");
	        Utilities.hardWait(3);
	        driver.findElement(town).clear();
	        driver.findElement(town).sendKeys("London");
	        Utilities.hardWait(3);
	        driver.findElement(country).clear();
	        driver.findElement(country).sendKeys("England");
	        Utilities.hardWait(3);
	        driver.findElement(postCode).clear();
	        driver.findElement(postCode).sendKeys("SWIA 2AA");
	        
	        Utilities.hardWait(5);
	        selectDropDownValues(driver ,driver.findElement(reason), "Other");
	        
	        Utilities.hardWait(5);
	        driver.findElement(update).click();
	        
	        Utilities.hardWait(5);
	        String confirmMessage = driver.findElement(successfullyText).getText();
		    System.out.println(confirmMessage);
	        	        
	        Utilities.hardWait(5);
	        driver.findElement(okButton).click();
	        
	        Utilities.hardWait(3);
	        driver.findElement(homePhone).clear();
	        driver.findElement(homePhone).sendKeys("07700900999");
	        Utilities.hardWait(3);
	        driver.findElement(mobilePhone).clear();
	        driver.findElement(mobilePhone).sendKeys("07700900998");
	       
	        Utilities.hardWait(5);
	        driver.findElement(nextButton).click();
	        
	        Utilities.hardWait(5);
	        String successmessage = driver.findElement(successfullyText).getText();
		    System.out.println(successmessage);
	        	        
	        Utilities.hardWait(5);
	        driver.findElement(okButton).click();
	        
	        Utilities.hardWait(3);
	        driver.findElement(eMail).clear();
	        driver.findElement(eMail).sendKeys(Email);
	       
	        Utilities.hardWait(5);
	        driver.findElement(updateButton).click();
	        
	        Utilities.hardWait(5);
	        String successfullymessage = driver.findElement(successfullyText).getText();
		    System.out.println(successfullymessage);
	        	        
	        Utilities.hardWait(5);
	        driver.findElement(okButton).click();
	        
	        System.out.println(">>>>>>>>>> END - CompassionOneViewChangeAll <<<<<<<<<<<<<<<<<<<<");
	        
		 }   catch (Exception e) {
  			e.printStackTrace();
  			
  				}
  		}
		 public void selectDropDownValue(WebDriver driver ,WebElement element, String value) {
		    	element.click();
		    	driver.findElement(By.xpath("(//option[text()='"+value+"'][1])")).click();
		    }
		 public void selectDropDownValues(WebDriver driver ,WebElement element, String value) {
		    	element.click();
		    	driver.findElement(By.xpath("(//option[text()='"+value+"'][1])")).click();
		    }
}