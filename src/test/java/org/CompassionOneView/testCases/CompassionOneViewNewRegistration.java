package org.CompassionOneView.testCases;

import org.compassion.utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CompassionOneViewNewRegistration extends BaseClass {
	

	@Parameters({"username","password","firstname","surname","Email"})
	@Test(groups = {"All","ChangeAddress"})
	public void newRegistration (@Optional("GC_4") String username, @Optional("G33con0404") String password, @Optional("David") String firstname, @Optional("Jackson") String surname, @Optional("jackson123@gmail.com") String Email ) {
		try {
		   System.out.println(">>>>>>>>>>>>>> START - CompassionWebsitenewRegistration <<<<<<<<<<<<<<<<<<<<");
	        
		   Actions a=new Actions(driver);
	        By byUsername = By.id("login-username");
	        By byPassword = By.id("login-password");
	        By bySignInButton = By.id("login");
	        By manageWebAccount = By.xpath("(//div[@class='size-md float-left heading'])[3]");
	        By addNew = By.id("addnew");
	        By title = By.id("title");
	        By supporterId=By.id("supporterid");
	        By userName = By.id("username");
	        By generatePassword=By.xpath("//button[@class='btn btn-primary generate_pswd']");
	        By comPassword=By.id("confirmpassword");
	        By submit=By.id("section2");
	        By okButton=By.xpath("//button[text()='OK']");
	        By supporter_id=By.id("supporter_id");
	        By firstName=By.id("firstname");
	        By surName=By.id("surname");
	        By user_name=By.id("username");
	        By eMail=By.id("email");
	        By search=By.id("search");
	        By eMailText=By.xpath("(//input[@class='nice-input'])");
	        By registration=By.xpath("//button[text()='Register']");
	        By deleteAccount=By.xpath("//a[@class='delete glyph-icon tooltip-button icon-remove']");
	        By ConfirmDelete=By.xpath("//button[@class='confirm']");
	        

	        Utilities.hardWait(3);
	        driver.findElement(byUsername).sendKeys(username);
	        driver.findElement(byPassword).sendKeys(password);
	        
	        Utilities.hardWait(3);
	        driver.findElement(bySignInButton).click();
	        
	        Utilities.hardWait(3);
	        driver.findElement(manageWebAccount).click();
	        
	        Utilities.hardWait(3);
	        driver.findElement(addNew).click();
	        
	        Utilities.hardWait(5);
	        driver.findElement(eMailText).click();
	        driver.findElement(eMailText).sendKeys(Email);
	        
	        Utilities.hardWait(3);
	        driver.findElement(registration).click();
	        
	        Utilities.hardWait(5);
	        WebElement dropTitle=driver.findElement(title);
		    Select drpTitle=new Select(dropTitle);
		    drpTitle.selectByVisibleText("Mr");
		    
		    Utilities.hardWait(4);
	        String benificiary_ID = driver.findElement(supporterId).getAttribute("value");
		    
		    Utilities.hardWait(3);
	        driver.findElement(userName).sendKeys("David Jackson");
	        
	        Utilities.hardWait(3);
	        driver.findElement(generatePassword).click();
	        
	        Utilities.hardWait(3);
	        String copyPassword = driver.findElement(comPassword).getAttribute("value");
	        System.out.println(copyPassword);
	        
	        Utilities.hardWait(6);
	        driver.findElement(submit).click();
	        
	        Utilities.hardWait(6);
	        driver.findElement(okButton).click();
	        
	        WebElement e = driver.findElement(supporter_id);
	        a.moveToElement(e);
	        a.click();
	        
	        Utilities.hardWait(4);
	        a.sendKeys(benificiary_ID).build().perform();
	        Utilities.hardWait(4);
	        
	        driver.findElement(firstName).sendKeys(firstname);
	        driver.findElement(surName).sendKeys(surname);
	        driver.findElement(user_name).sendKeys("David Jackson");
	        driver.findElement(eMail).sendKeys(Email);
	        
	        Utilities.hardWait(4);
	        driver.findElement(search).click();
	        
	        Utilities.hardWait(5);
	        driver.findElement(deleteAccount).click();
	        
	        Utilities.hardWait(5);
	        driver.findElement(ConfirmDelete).click();
		    
	        System.out.println(">>>>>>>>>>>>>>> END - CompassionWebsitenewRegistration <<<<<<<<<<<<<<<<<<<<");
		}   catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
