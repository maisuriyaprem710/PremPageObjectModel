package com.gmail.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	

	//Object Repository = page factory
	
	@FindBy(linkText="For work")
    WebElement Forwork;
	
	@FindBy(linkText="Sign in")
    WebElement Signin;
	
	@FindBy(linkText="Create an account")
    WebElement Createaccount;
	
	@FindBy(xpath="(//img[@decoding='async'])[1]")
	WebElement logo;
	
	//Initializing the page objects 
	
public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}

    //Actions:

    public String validateHomePagetitle() {
    	return driver.getTitle();
    }
		
    public boolean validateimg() {
    	return logo.isDisplayed();
    }
    
    public ForWorkPage openForWorkpage() throws IOException {
    	Forwork.click();
    	return new ForWorkPage();
    }
    
    public SignInPage openSigninPage() throws IOException {
    	Signin.click();
    	return new SignInPage();
    }
    
    public CreateAccountPage opencresteanaccountPage() throws IOException {
    	Createaccount.click();
    	return new CreateAccountPage();
    }
    
}
