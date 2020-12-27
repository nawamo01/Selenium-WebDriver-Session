package SeleniumTrainingSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _08_DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Actions Object need to use for drag&drop/ mousemover methods
		 
		Actions action = new Actions(driver);
		driver.switchTo().frame(0);
		
		//normal xpath used
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
		.release()
		.build().perform();
		
		Thread.sleep(5000);
		
		
		//Dynamic xpath used created by own
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.switchTo().frame(0);     //the site is having one frame so default index value is 0
		action.clickAndHold(driver.findElement(By.xpath("//div[@id ='draggable']")))
		.moveToElement(driver.findElement(By.xpath("//div[@id ='droppable']")))
		.release()
		.build().perform();
		
		
	System.out.println("Program Completed");

	}

}
