package SeleniumTrainingSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _21_DynamicGoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
		driver.findElement(By.name("q")).sendKeys("Java");
		
		//Find Elements method used to reach the suggestion list box
		List <WebElement> list = driver.findElements(By.xpath("//ul[@role = 'listbox']//li/descendant::div[@class='jKWzZXdEJWi__suggestions-inner-container']"));
		System.out.println("Total Number of Google Suggestion is >> "+list.size());
		
		//to select the values from suggestion box
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+1 +") "+list.get(i).getText()); //output like 1) Javascript
			
			if(list.get(i).getText().contains("javascript tutorial")) {
				list.get(i).click();
				System.out.println(driver.getTitle());
				break;
				
			}
		}
	
		
		
		
		
		
		
	}

}
