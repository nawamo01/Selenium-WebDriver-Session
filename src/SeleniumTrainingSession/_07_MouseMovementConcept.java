package SeleniumTrainingSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _07_MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// To use mouse mover, we need to use Actions object
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();  //.build().Perform() needs to be included by default while using Actions Object
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("MyFlexiPlan")).click();
		
		System.out.println("Program Completed");
	}

}
