package SeleniumTrainingSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_ImplicitWait {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);  // Dynamic wait for page loaded completely
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   // Dynamic wait for all web element loaded completed
		
		
		System.out.println("Program Completed");
		

	}

}
