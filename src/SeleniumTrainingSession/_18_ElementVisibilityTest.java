package SeleniumTrainingSession;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class _18_ElementVisibilityTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://app.testproject.io/signup/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	// input to the general fields	
		driver.findElement(By.id("first-name")).sendKeys("John Tomas");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Pray4me@01");
		
	//Validating IsEnabled() , IsSelected(), IsDisplayed() methods
		
		boolean b1 =driver.findElement(By.id("tp-sign-up")).isDisplayed();
		System.out.println("Is Submit button is displayed  >>"+b1);    // result is true
		
		boolean b2= driver.findElement(By.id("tp-sign-up")).isEnabled();
		System.out.println("Is Submit button is enabled  >>"+b2);		// result is false
		
		boolean b3 = driver.findElement(By.xpath("//input[@id='eula' and @name = 'eula' and @type = 'checkbox']")).isSelected(); //output is false
		System.out.println("Is Agree check box is selected  >>"+b3);	// result is false
				
		driver.findElement(By.xpath("//span[contains(text(), 'End User')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text() = 'I agree']")).click();
		Thread.sleep(2000);
		System.out.println("Agree check box is selected by selenium");		
		boolean b4 = driver.findElement(By.xpath("//input[@id='eula']")).isSelected(); 
		System.out.println("Is Agree check box is selected  >>"+b4);		// result is true
		
		boolean b5= driver.findElement(By.id("tp-sign-up")).isEnabled();	
		System.out.println("Is Submit button is enabled  >>"+b5);			// result is true
		
		
			
	}

	
}
