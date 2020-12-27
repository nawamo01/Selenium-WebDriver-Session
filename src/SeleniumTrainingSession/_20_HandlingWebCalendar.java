package SeleniumTrainingSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _20_HandlingWebCalendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@type='submit' and text() = 'Ok']")).click();
		driver.findElement(By.xpath("//input[@class='ng-tns-c12-5 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).clear();
		driver.findElement(By.xpath("//input[@class='ng-tns-c12-5 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).sendKeys("10-11-2020");
		
		
	}

}
