package com.gmail.qa.util;


import java.io.IOException;




import com.gmail.qa.base.TestBase;


public class TestUtil extends TestBase {
	
	
	
	public TestUtil() throws IOException {
		super();
	}

	public static long page_load_timeout = 20;
	public static long implicite_wait = 10;
	
	
	static Xls_Reader d = new Xls_Reader("C:\\QA\\SeleniumWorkSpace\\ABacisPageObject\\src\\main\\java\\com\\gmail\\qa\\data\\Book1.xlsx");
	public static String HomePage_title = d.getCellData("title", 0, 2);
	public static String SigninPage_title = d.getCellData("title", 1, 2);
	public static String CreateAccountPage_title = d.getCellData("title", 2, 2);
	public static String ForWorkPage_title = d.getCellData("title", 3, 2);
	
	public static String loginwousernameerr = d.getCellData("error", 0, 2);
	public static String loginwspecialcharerr = d.getCellData("error", 1, 2);
	public static String CreateAcwofirstnameerr = d.getCellData("error", 2, 2);
	public static String CreateAcwnumbererr = d.getCellData("error", 3, 2);
	
	public static String specialcharusername = d.getCellData("Sheet1", 0, 2);
	public static String lastname = d.getCellData("Sheet1", 2, 2);
	public static String emptyfirstname = d.getCellData("Sheet1", 1, 2);
	public static String numberasfisrtname = d.getCellData("Sheet1", 1, 3);
	public static String heading = d.getCellData("Sheet1", 3, 2);
	
	
	
	
	/*public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}*/
	
	
	
}
