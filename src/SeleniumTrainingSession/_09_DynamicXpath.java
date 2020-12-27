package SeleniumTrainingSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _09_DynamicXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		
		
		//Standard Xpath copied from inspect element
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@yahoo.com");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		
		//#1 Type: Customized Xpath for input tags
		//Syntax: xpath("//HTMLTagname[@Title = 'value']")
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("abc@gmail.com");
		
	    //#2 Type Customized Xpath for links tags
		//All the links will be html tagged as <a>
		
		//The below functions are used for Dynamic ID for the webelement - Interview Questions

		// 1. Contains functions - Highly recommended
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		
		
		//2. Starts-with function
		//driver.findElement(By.xpath("//a[starts-with(text(),'Forgotten')]")).click();
		
		
		//3. Ends-with function
		//driver.findElement(By.xpath("//a[ends-with(text(),'password?')]")).click();
		
		
		System.out.println("completed");
	}

}
