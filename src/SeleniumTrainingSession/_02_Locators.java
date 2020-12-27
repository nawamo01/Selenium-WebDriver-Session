package SeleniumTrainingSession;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class _02_Locators {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fmn%2Flanding%2F17369456031%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
	//Locator Types
	//1. ID Locator - Highly Recommended
				
		driver.findElement(By.id("ap_customer_name")).sendKeys("STesting");
		
	// 2. Xpath Locator - Recommended (but don't use the xpath if it has "div"
	// example - html/body/div[1]/div[5]/div[2]/a - reason because the textbox (property) can be moved to other division by developer then this xpath will not work
		driver.findElement(By.xpath("//*[@id=\"ap_phone_number\"]")).sendKeys("0041254854");
		
	// 3. Name Locator
		driver.findElement(By.name("secondaryLoginClaim")).sendKeys("abcsftest@gmail.com");
		
	// 4. Linktext Locator - It is only for links in webpage
		
		//driver.findElement(By.linkText("sign in")).click();
		
	// 5. CSS Selector Locator -  Syntax is #id - example #ap_password
		driver.findElement(By.cssSelector("#ap_password")).sendKeys("Password@01");
		
	//6. Partial LinkText - Not useful - click the links using partial text
		
		//driver.findElement(By.partialLinkText("how do i log in")).click();
		
	// 7. ClassName Locator - Not Useful - Due to class name is duplicated in webpage
		
		//driver.findElement(By.className("a-input-text a-span12 auth-required-field auth-require-fields-match auth-require-password-validation")).sendKeys("Password@01");
		
		
	//### Important ## How to select values from dropdown - need to create Select class 
		Select select = new Select(driver.findElement(By.id("auth-country-picker")));
		select.selectByVisibleText("GY +592");
		
	// Button click example
		driver.findElement(By.id("continue")).click();
		
		
		
	}

}
