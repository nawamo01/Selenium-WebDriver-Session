package TestNGConcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _01_TestNGBasics {

	/*
	 * Not required Main method() for test cases
	 * Annotation starts with @ symbol
	 * Annotation should have individual method
	 Sequence of Test cases
	 1 @BeforeSuite
	 2 @BeforeTest
	 3 @BeforeClass
	 4 @BeforeMethod
	 5 @Test
	 6 @AfterMethod
	 7 @AfterClass
	 8 @AfterTest
	 9 @AfterSuite ---- will generate reports as a output
	 */
	
	@BeforeSuite
	public void setproperty() {
		System.out.println("BeforeSuite- Set System Property");
	}
	
	@BeforeTest
	public void launchbrowser() {
		System.out.println("BeforeTest- LaunchBrowser");
	}
	
	
	@BeforeClass
	public void enterurl() {
		System.out.println("BeforeClass- EnterUrl");
	}
	
	
	@BeforeMethod
	public void login() {
		System.out.println("BeforeMethod- Login");
	}
	
	@Test
	public void gettitle() {
		System.out.println("Test1- Get Title");
	}
	
	@Test
	public void search() {
		System.out.println("Test2- Google Search");
	}
	
	@Test
	public void submit() {
		System.out.println("Test3- Google Submit");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AfterMethod- logout ");
	}
	
	@AfterClass
	public void closebrowser() {
		System.out.println("AfterClass- Close Browser");
	}
	
	@AfterTest
	public void deleteallcookies() {
		System.out.println("AfterTest- Delete All Cookies");
	}
	
	@AfterSuite
	public void generatereport() {
		System.out.println("AfterSuite- Generate Test Case Report");
	}
	
}
