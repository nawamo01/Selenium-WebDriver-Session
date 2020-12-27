package SeleniumTrainingSession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class _16_HtmlUnitDriverConcept {

	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {

				Properties prop = new Properties();
				FileInputStream ip = new FileInputStream("D:\\Core Java Training\\SeleniumSession\\Selenium2020\\src\\SeleniumTrainingSession\\objrepository.properties");
				prop.load(ip);
				
				/*
				Launching FireFox browser:
			 	-------------------------
				System.setProperty("webdriver.gecko.driver", "D://Core Java Training//Drivers//geckodriver.exe");
				driver = new FirefoxDriver();
				
				Launching Chrome browser:
				------------------------ 
				System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
				driver = new ChromeDriver();
				*/
				
				/*
				 HEADLESS BROWSER - GHOST BROWSER - Concept- by Not Launching any browser
				*/
				driver = new HtmlUnitDriver();
				
				driver.get("https://www.google.com");
				System.out.println("First Webpage > "+driver.getTitle());
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@name = 'q']")).sendKeys("Rainbow dash song");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name = 'btnK']")).click();
				
				System.out.println("Second Webpage >" +driver.getTitle());
				Thread.sleep(2000);
				
				driver.navigate().to("https://www.amazon.in");;
				Thread.sleep(5000);				
				System.out.println("Third Page >" +driver.getTitle());
			}

		}


