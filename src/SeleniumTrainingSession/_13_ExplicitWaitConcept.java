package SeleniumTrainingSession;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _13_ExplicitWaitConcept {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");

		
		// Explicit Wait  -  Means Selenium code is waiting for the specific element to be enabled/loaded in the webpage
		// Explicit Wait required separate function to perform the action (example clickon Function)
		
		clickon(driver,driver.findElement(By.name("btnK")),20);
		
		
		System.out.println("Program Completed");
	}

	public static void clickon(WebDriver driver, WebElement locator, int timeout) {
	
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
	
}
