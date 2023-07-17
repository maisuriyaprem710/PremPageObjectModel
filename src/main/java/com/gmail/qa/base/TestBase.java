package com.gmail.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.gmail.qa.util.TestUtil;
import com.gmail.qa.util.WebEventListener;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	
	
	public TestBase() throws IOException {
		
		
		FileInputStream fi = new FileInputStream("C:\\QA\\SeleniumWorkSpace\\ABacisPageObject\\src\\main\\java\\com\\gmail\\qa\\config\\config.properties");
		prop = new Properties();
		prop.load(fi);
	}
	
	public static void initialization() throws IOException {
		
		
		
		String BrowserName = prop.getProperty("browser");
		
		if(BrowserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe\\");
			 driver = new FirefoxDriver();
				
		}
		else if (BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe\\");
			 driver = new ChromeDriver();
			
		}
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicite_wait,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		}
		
		
		
		
	

}
