package com.gmail.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gmail.qa.base.TestBase;
import com.gmail.qa.pages.CreateAccountPage;
import com.gmail.qa.pages.ForWorkPage;
import com.gmail.qa.pages.HomePage;
import com.gmail.qa.pages.SignInPage;
import com.gmail.qa.util.TestUtil;

public class HomePageTest extends TestBase  {
	
	HomePage hp;
	ForWorkPage wp;
	SignInPage sp;
	CreateAccountPage cp;
	
	
	public HomePageTest() throws IOException {
		super();	
	}
	
	
	@BeforeMethod
	public void setUp() throws IOException{
		
		initialization();
		hp = new HomePage();
		wp = new ForWorkPage();
		sp = new SignInPage();
		cp = new CreateAccountPage();
	}
	
	
	@Test(priority = 1)
	public void HomePageTitleTest() {
		String title = hp.validateHomePagetitle();
		Assert.assertEquals(title,TestUtil.HomePage_title);
	}
	
	@Test(priority = 2)
	public void HomePageLogoTest() {
		boolean flag = hp.validateimg();
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3)
	public void VerifyForWorkpageTest() throws IOException {
		wp = hp.openForWorkpage() ;    
	}
	
	@Test(priority = 4)
	public void VerifySigninPageTest() throws IOException {
		sp = hp.openSigninPage();
		      
	}
	
	@Test(priority = 5)
	public void VerifycresteanaccountPageTest() throws IOException {
		cp = hp.opencresteanaccountPage();
			      
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
