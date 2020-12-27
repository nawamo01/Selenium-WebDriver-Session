package SeleniumTrainingSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_WebdriverBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.google.com");
		
	String title = driver.getTitle();
	
	System.out.println(title);
	
	if(title.equals("Google")){ 
		System.out.println("correct title");
	}
	else
	{
		System.out.println("Incorrect title");
	}
	}

	}


