package SeleniumWeeklyTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\Core Java Training\\SeleniumSession\\Selenium2020\\src\\SeleniumTrainingSession\\objrepository.properties");
		prop.load(ip);

		String Browser = prop.getProperty("browser");
		
		if(Browser.equals("chrome")) {
			
		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		else if(Browser.equals("FF")){
		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//Chromedriver.exe");
		driver = new ChromeDriver();
		}
		String url= prop.getProperty("url");
		driver.get(url);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys("Rainbow dash song");
		driver.findElement(By.xpath("//input[@name = 'btnK']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href = 'https://www.youtube.com/watch?v=IqN9R45JHuQ']")).click();
		
		System.out.println(driver.getTitle());
		//Select select = new Select(driver.findElement(By.xpath(prop.getProperty("mobilecode_xpath"))));
		//select.selectByVisibleText(prop.getProperty("mobilecode"));
		
		
	}

}
