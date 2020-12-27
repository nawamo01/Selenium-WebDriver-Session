package TestNGConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _02_GoogleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test(priority=2)
	public void googlelogotest() {
		boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println("Google Logo is Displayed >>"+b);
	}
	
	@Test(priority=1)
	public void googletitletest() {
		String title = driver.getTitle();
		System.out.println("The Page Title >>"+title);
	}
	
	@Test(priority=3)
	public void Googlemaillink() {
		boolean b1 = driver.findElement(By.linkText("mail")).isDisplayed();
		System.out.println("Mail is displayed  >>"+b1);
			
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
		
	}
	
	
}
