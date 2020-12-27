package SeleniumTrainingSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.html.HTMLDataElement;



public class _20_a_HandlingCalendarbyJS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.airasia.com/en/gb");
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		String date = "01/11/2020";
		
		WebElement dateelement = driver.findElement(By.xpath("//input[@class='css-11aywtz r-141fyjm r-1m5ju6n r-1b43r93 r-majxgm r-1d7gupr r-1ny4l3l r-buy8e9 r-1j3t67a r-1jr0yug r-bnwqim' and @aria-label='Depart date']"));	
		changecolor("rgb(800,0,0)",dateelement,driver);
		
		selectdatebyjs(driver,dateelement,date);
		
		changecolor("rgb(0,800,0)",dateelement,driver);
		
		System.out.println("Program completed");
		
		
	
	}

	public static void selectdatebyjs(WebDriver driver, WebElement element, String dateval) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
		
	
	}
	
	//Changing color using JSE
	public static void changecolor(String color, WebElement element, WebDriver driver) {
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

        try {
            Thread.sleep(20);
        }  catch (InterruptedException e) {
        }
     }	

	
}
