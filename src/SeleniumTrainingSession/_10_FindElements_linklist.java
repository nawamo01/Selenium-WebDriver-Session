package SeleniumTrainingSession;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class _10_FindElements_linklist {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// List the number of links
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of Links in Facebook Homepath is: "+linklist.size());
		
		
		//List all the link names
		
		for(int i = 0; i<linklist.size(); i++){
		String Linktext = linklist.get(i).getText();
		System.out.println(i+Linktext);
			
		}
		

	}

}
