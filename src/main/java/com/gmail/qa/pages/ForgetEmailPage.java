package com.gmail.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.qa.base.TestBase;

public class ForgetEmailPage extends TestBase {
	
	//Object Repository = page factory

	
	@FindBy(id="recoveryIdentifierId")
    WebElement username;
	
	//VfPpkd-vQzf8d
	@FindBy(className="VfPpkd-vQzf8d")
	WebElement nextbutton;
	
	
	
	
	//Initializing the page objects  
	
		public ForgetEmailPage() throws IOException {
			PageFactory.initElements(driver, this);
			
		}
		
		
		//Actions:
		
		 public void enterusername(String ab) {
			 username.sendKeys(ab);
		 }
		 
		 public void ClickNext() {
			 nextbutton.click();
		    }
		
		
		
		
		
}
