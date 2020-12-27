package SeleniumTrainingSession;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class _14_Windows_Popup_Handling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("http://popuptest.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Multi-PopUp Test")).click();
		Thread.sleep(5000);
		
		String parent = driver.getWindowHandle();
		
		Set <String> handler = driver.getWindowHandles();
		Iterator <String> it = handler.iterator();
	
		while(it.hasNext()) {
			String child = it.next();
			if(!parent.equals(child)) {
				
				System.out.println(driver.switchTo().window(child).getCurrentUrl()+" > "+child);
				
			}
			
		}
					
			System.out.println(driver.switchTo().window(parent).getCurrentUrl()+" > "+parent);
			driver.quit();
}
}