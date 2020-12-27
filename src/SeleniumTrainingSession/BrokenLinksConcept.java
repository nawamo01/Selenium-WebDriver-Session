package SeleniumTrainingSession;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksConcept {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		
		//1. get all links
		
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("full links -->" + linklist.size());
		
		//2. iterate linklist: exclude all links and images where "href" attribute does not have any values or tagname start with javascript
		
		List <WebElement> activelinks = new ArrayList<WebElement>();
		
		for(int i=0; i<linklist.size(); i++) {
			
			if(linklist.get(i).getAttribute("href")!=null && (! linklist.get(i).getAttribute("href").contains("javascript:"))) {
				
				activelinks.add(linklist.get(i));
			}
		}
		
		//get only the active links
		
		System.out.println("active links -->" + activelinks.size());
		
		
		/*3. check the href url using "HttpURLConnection" API
		Error Codes:
		200 - Ok
		404 - Not found
		400 - bad request
		500 - Internal error
		*/
		for(int j=0; j<activelinks.size();j++){
			HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href")+"--->"+response);
		}
		
	}

}
