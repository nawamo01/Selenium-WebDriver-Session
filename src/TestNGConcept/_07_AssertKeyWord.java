package TestNGConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _07_AssertKeyWord {
	
	WebDriver driver;
	@BeforeMethod()
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	
	@Test
	public void titletest() {
		String title=driver.getTitle();
		Assert.assertEquals(title,"Google","title not matched");
		
		boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(b);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
}
