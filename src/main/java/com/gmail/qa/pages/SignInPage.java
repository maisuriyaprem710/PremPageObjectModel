package com.gmail.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.qa.base.TestBase;

public class SignInPage extends TestBase {
	
	//Object Repository = page factory
	
	@FindBy(id="identifierId")
    WebElement username;
	
	@FindBy(xpath="//button[@jsname='Cuz2Ue']")
    WebElement Forgetemail;
	
	@FindBy(xpath="(//span[@class='VfPpkd-vQzf8d'])[3]")
    WebElement Createaccount;
	
	@FindBy(xpath="(//span[@jsname='V67aGc'])[2]")
    WebElement nextbutton;
	
	@FindBy(xpath = "//div[@class='o6cuMc Jj6Lae']")
	WebElement emptyusernameerr;
	
	@FindBy(xpath = "//div[@class='o6cuMc Jj6Lae']")
	WebElement specialcharusernameerr;
	
	//Initializing the page objects  
	
	public SignInPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	   //Actions:
	
	 public String validateSignInPagetitle() {
	    	return driver.getTitle();
	    }
	 public void Login(String ab) {
		 username.sendKeys(ab);
	 }
	 
	 public ForgetEmailPage openForgetemailpage() throws IOException {
		 Forgetemail.click();
		 return new ForgetEmailPage();
	    }
	 
	 public void opencreateaccountpage() {
		 Createaccount.click();
	    }
	
	 public void ClickNext() {
		 nextbutton.click();
	    }
	
	 public String emptyusernameerr() {
		 return emptyusernameerr.getText();
	 }
	 
	 public String specialcharusernameerr() {
		 return specialcharusernameerr.getText();
	 }
}
