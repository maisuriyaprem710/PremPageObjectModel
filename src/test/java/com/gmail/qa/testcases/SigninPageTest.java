package com.gmail.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gmail.qa.base.TestBase;
import com.gmail.qa.pages.ForgetEmailPage;
import com.gmail.qa.pages.HomePage;
import com.gmail.qa.pages.SignInPage;
import com.gmail.qa.util.TestUtil;

public class SigninPageTest extends TestBase {
	SignInPage sp;
	HomePage hp;
	ForgetEmailPage fp;

	public SigninPageTest() throws IOException {
		super();
		}
	
	
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		hp = new HomePage();
		fp = new ForgetEmailPage();
		sp = hp.openSigninPage();
	}
	
	
	@Test(priority = 1)
	public void validateSignInPagetitleTest() {
		String SignInPageTitle = sp.validateSignInPagetitle();
		Assert.assertEquals(SignInPageTitle,TestUtil.SigninPage_title);
	}
	
	@Test(priority = 2)
	public void LoginwithoutusernameTest() {
		sp.ClickNext();
		
		String actual = sp.emptyusernameerr();
		Assert.assertEquals(TestUtil.loginwousernameerr, actual);
	}
	
	@Test(priority = 3)
	public void LoginwithspecialcharusernameTest() {
		sp.Login(TestUtil.specialcharusername);
		sp.ClickNext();
		String actual = sp.specialcharusernameerr();
		Assert.assertEquals(TestUtil.loginwspecialcharerr, actual);
	}
	
	@Test(priority = 4)
	public void verifyForgetemailpage() throws IOException {
		fp = sp.openForgetemailpage();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
