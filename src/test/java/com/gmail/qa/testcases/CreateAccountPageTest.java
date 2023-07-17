package com.gmail.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gmail.qa.base.TestBase;
import com.gmail.qa.pages.CreateAccountPage;
import com.gmail.qa.pages.HomePage;
import com.gmail.qa.util.TestUtil;


public class CreateAccountPageTest extends TestBase {
	
	HomePage hp;
	CreateAccountPage cp;
	
	public CreateAccountPageTest() throws IOException {
		super();	
	}
	
	
	@BeforeMethod
	public void setUp() throws IOException{
		
		initialization();
		hp = new HomePage();
		cp = new CreateAccountPage();
		hp.opencresteanaccountPage();
	}
	
	@Test(priority = 1)
	public void CreateAccountPageTitleTest() {
		String title = cp.validateCreateAccountPagetitle();
		Assert.assertEquals(title, TestUtil.CreateAccountPage_title);
	}
	
	@Test(priority = 2)
	public void CreatingAccountwithoutfirstnameTest() {
		cp.Creatingaccount(TestUtil.emptyfirstname, TestUtil.lastname);
		String actualerr = cp.err();
		Assert.assertEquals(actualerr,TestUtil.CreateAcwofirstnameerr);
	}
	
	@Test(priority = 3)
	public void CreatingAccountwithnumbersTest() {
		cp.Creatingaccount(TestUtil.numberasfisrtname, TestUtil.lastname);
		String actualerr = cp.err();
		Assert.assertEquals(actualerr, TestUtil.CreateAcwnumbererr);
	}
	
	@Test(priority = 4)
	public void HeadingTest() {
		String actual = cp.GetHeading();
		Assert.assertEquals(actual, TestUtil.heading);
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
