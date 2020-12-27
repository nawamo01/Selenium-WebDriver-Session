package TestNGConcept;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _04_TestNGFeatures {
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
	
	@Test(priority=1, groups="HomePageTest")
	public void TitleTest() {
		System.out.println(driver.getTitle());
	}
	
	@Test(priority=2, groups="HomePageTest")
	public void logotest() {
		Boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(priority=3, groups="SearchboxTest")
	public void searchbox() {
		boolean b1= driver.findElement(By.name("q")).isEnabled();
		System.out.println(b1);
	}
	
	@Test(priority=4, groups="SearchboxTest")
	public void searchboxentry() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("java");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
	}
	
	
	
	
}
