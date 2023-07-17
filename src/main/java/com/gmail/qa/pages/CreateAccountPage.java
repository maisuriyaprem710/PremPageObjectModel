package com.gmail.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.qa.base.TestBase;

public class CreateAccountPage extends TestBase {
	
	
	@FindBy(id="firstName")
    WebElement firstName;
	
	@FindBy(id="lastName")
    WebElement lastName;
	
	@FindBy(xpath="//span[@class='VfPpkd-vQzf8d']")
    WebElement Nextbutton;
	
	
	@FindBy(xpath="//div[@jsname='B34EJ']")
    WebElement err;
	
	
	@FindBy(id="headingSubtext")
	WebElement heading;
	
	
	//Initializing the page objects
	
		public CreateAccountPage() throws IOException {
			PageFactory.initElements(driver, this);
			
		}
		
		
		//Actions:
		
		public String validateCreateAccountPagetitle() {
	    	return driver.getTitle();
	    }	
		
		
		public void Creatingaccount(String fn,String ln){
			firstName.sendKeys(fn);
			lastName.sendKeys(ln);
			Nextbutton.click();
		}
		
		
		public String err() {
			return err.getText();
		}
		
		
		public String GetHeading() {
			return heading.getText();
		}
		
		
		

}
