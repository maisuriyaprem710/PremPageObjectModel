package com.gmail.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmail.qa.base.TestBase;

public class ForWorkPage extends TestBase {

	//Object Repository = page factory
	

	
	@FindBy(linkText="Pricing")
    WebElement Pricing;
	
	
	
	
	//Initializing the page objects
	
	public ForWorkPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions:
	
	public String validateForWorkPagetitle() {
    	return driver.getTitle();
    }
	
	
	
	public PricingPage OpenPricingPage() throws IOException {
		Pricing.click();
		return new PricingPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
