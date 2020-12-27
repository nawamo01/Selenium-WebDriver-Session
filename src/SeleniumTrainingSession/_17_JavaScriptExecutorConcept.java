package SeleniumTrainingSession;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class _17_JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement loginbtn = driver.findElement(By.name("login"));
		WebElement signupbtn = driver.findElement(By.id("u_0_2"));
		
		changecolor("rgb(0,0,80)",signupbtn,driver);
		
		
		flash(loginbtn,driver);
		
		drawborder(loginbtn, driver); //marking the bug area
		
		// taking snapshot
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File ("D:\\Core Java Training\\SeleniumSession\\Selenium2020\\src\\SeleniumTrainingSession\\ss.png"));
		
		
		alertjs("Enjoy the facebook web",driver);
	
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		System.out.println(gettitlejs(driver));
		
		refreshbyjs(driver);
		
		scrollbyjs(driver); //scroll to end
		
		WebElement terms = driver.findElement(By.linkText("Terms"));
		scrollIntoView(terms,driver);
		
		//Click element by Js
		clickbyjs(loginbtn,driver);
	
		//Get Inner text
		String text = innertextjs(driver);
		System.out.println(text);
		
		System.out.println("program completed");
	}
	
////////////////////////////////////////////////////////////////////////////////////
	
	//Methods using JavascriptExecutor
///////////////////////////////////////////////////////////////////////////////////
	
	
	//Changing color using JSE
	public static void changecolor(String color, WebElement element, WebDriver driver) {
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

        try {
            Thread.sleep(20);
        }  catch (InterruptedException e) {
        }
     }	


	
	
	//Flash the objects using JSexecutor
	public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor  = element.getCssValue("backgroundColor");
        for (int i = 0; i <  10; i++) {
            changecolor("rgb(0,200,0)", element,driver);	//changecolor is a userdefined method created by own
            changecolor(bgcolor, element,driver);
        }
        
	}

	//To draw a border using JSexecutor
	
	public static void drawborder(WebElement element,WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border = '3px solid red'",element);
	}
	
	
	//Generating alerts using jsexecutor
	
	public static void alertjs(String msg, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+msg+"')");
	}

	//get title by jsexecutor
	
	public static String gettitlejs(WebDriver driver) {
	
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;	
	}
		
	// click by jsexecutor
	
	public static void clickbyjs(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);	
	}
	
	
	//Refreshbyjs
	public static void refreshbyjs(WebDriver driver) {
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("history.go[0]");
	} 	
	
	// scroll to the end
	public static void scrollbyjs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

	//scroll to particular element
	public static void scrollIntoView(WebElement element, WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
	
	//get all innertext
	public static String innertextjs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pagetext =js.executeScript("return document.documentElement.innerText;").toString();
		return pagetext;
		
	}
	
	}
