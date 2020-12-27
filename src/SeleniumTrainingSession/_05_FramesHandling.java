package SeleniumTrainingSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FramesHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
			
		driver.get("https://ui.cogmento.com/");
		
		// Managing webpage using driver.manage()
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.name("email")).sendKeys("nazmd8010@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Freecrm@2020");
		
		//Dynamic Xpath created by own
		driver.findElement(By.xpath("//div[@Class ='ui fluid large blue submit button']")).click();
		
		Thread.sleep(3000);
		
		//Dynamic Xpath created by own
		driver.findElement(By.xpath("//a[@href ='/contacts']")).click();
		
		Thread.sleep(3000);
		
		//Dynamic Xpath created by own
		driver.findElement(By.xpath("//a[@href = '/calendar']")).click();
		
		Thread.sleep(3000);
		
		//Dynamic Xpath created by own
		driver.findElement(By.xpath("//a[@href='/home']")).click();
		
		
		driver.get("https://www.quackit.com/html/examples/frames/");
		Thread.sleep(3000);
		
		//driver.switchTo().frame("Multiframe");   // removed this line because frame is no longer available on this website
		
		driver.findElement(By.xpath("//a[@title = 'code.whitehatjr.com/Free+Trial/Book+Now']")).click();
		
		driver.switchTo().defaultContent(); // Returning to main web page (default page)
		System.out.println("program complete");
	}

}
