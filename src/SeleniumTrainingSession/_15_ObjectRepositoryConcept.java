package SeleniumTrainingSession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class _15_ObjectRepositoryConcept {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {

		//Object Repository - Properties, FileInputStream and load methods has been included to use object repository 
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\Core Java Training\\SeleniumSession\\Selenium2020\\src\\SeleniumTrainingSession\\objrepository.properties");
		prop.load(ip);

		//selecting browser using object repository
		//Key "browser" is stored in object repository 
		
		String Browser = prop.getProperty("browser");
		if(Browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
			driver = new ChromeDriver();	
		}
		else if(Browser.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "D://Core Java Training//Drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		
		//Launching Url
		String url = prop.getProperty("url");
		driver.get(url);
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("name_xpath"))).sendKeys(prop.getProperty("name"));
		driver.findElement(By.xpath(prop.getProperty("mobile_xpath"))).sendKeys(prop.getProperty("mobile"));
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
		
		
		Thread.sleep(2000);
		//selecting dropdown
		Select select = new Select(driver.findElement(By.xpath(prop.getProperty("mobilecode_xpath"))));
		select.selectByVisibleText(prop.getProperty("mobilecode"));
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
