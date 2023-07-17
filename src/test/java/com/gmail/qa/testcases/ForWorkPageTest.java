package com.gmail.qa.testcases;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gmail.qa.base.TestBase;
import com.gmail.qa.pages.ForWorkPage;
import com.gmail.qa.pages.HomePage;
import com.gmail.qa.pages.PricingPage;
import com.gmail.qa.util.TestUtil;

public class ForWorkPageTest extends TestBase {
	
	HomePage hp;
	ForWorkPage fp;
	PricingPage pp;
	
	public ForWorkPageTest() throws IOException {
		super();	
	}

	
	
	@BeforeMethod
	public void setUp() throws IOException{
		
		initialization();
		hp = new HomePage();
		fp = new ForWorkPage();
		pp = new PricingPage();
		hp.openForWorkpage();
	}
	
	@Test(priority = 1)
	public void ForWorkPageTitleTest() {
		String title = fp.validateForWorkPagetitle();
		Assert.assertEquals(title,TestUtil.ForWorkPage_title);
	}
	
	@Test(priority = 2)
	public void VerifyOpenPricingPageTest() throws IOException {
		pp = fp.OpenPricingPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
