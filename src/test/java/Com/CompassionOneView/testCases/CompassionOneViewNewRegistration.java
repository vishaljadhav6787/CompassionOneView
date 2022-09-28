package Com.CompassionOneView.testCases;

import org.compassion.utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CompassionOneViewNewRegistration extends BaseClass {
	

	
	@Test
	public void newRegistration() {
		
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
	        By email=By.id("email");
	        By search=By.id("search");
	        By eMailText=By.xpath("(//input[@class='nice-input'])");
	        By registration=By.xpath("//button[text()='Register']");
	        

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
	        driver.findElement(eMailText).sendKeys("jackson123@gmail.com");
	        
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
	        
	        driver.findElement(firstName).sendKeys("David");
	        driver.findElement(surName).sendKeys("Jackson");
	        driver.findElement(user_name).sendKeys("David Jackson");
	        driver.findElement(email).sendKeys("jackson123@gmail.com");
	        
	        Utilities.hardWait(4);
	        driver.findElement(search).click();
		    
	        System.out.println(">>>>>>>>>>>>>>> END - CompassionWebsitenewRegistration <<<<<<<<<<<<<<<<<<<<");
	
	
	}

}
