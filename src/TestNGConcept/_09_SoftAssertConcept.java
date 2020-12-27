package TestNGConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _09_SoftAssertConcept {
	
	static WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void googleSoftAsserttest() {
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(driver.getTitle(),"Google123");
		softAssert.assertAll();
		
		
	}
	
	@Test
	public void googleAsserttest() {
		
		Assert.assertEquals(driver.getTitle(),"Google","Title is not matched");
	}
	
	
	
}
