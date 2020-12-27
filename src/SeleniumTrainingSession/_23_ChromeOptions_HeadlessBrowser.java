package SeleniumTrainingSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _23_ChromeOptions_HeadlessBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		
		/*Chrome Options is used for Headless browser
		 * Widow Size and Headless arguments is mandatory
		 */
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		//Calling Chrome options function in ChromeDriver method 
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
	
		driver.navigate().to("https://freecrm.co.in");
		System.out.println(driver.getTitle());
		
		System.out.println("Program Completed");
	}

}
