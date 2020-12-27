package TestNGConcept_DataProvider;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetData {

	static WebDriver driver;
	
	@BeforeMethod
	public static void setup(){
		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fmn%2Flanding%2F17369456031%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");	
	}
	
	@DataProvider
	public Iterator<Object[]> GetTestData(){
		ArrayList<Object[]> testdata = TestUtil.getdatafromexcel();
		return testdata.iterator();
	}
	
	
	@Test
	public void getdata(String name, String mobile, String email, String password){
		driver.findElement(By.id("ap_customer_name")).clear();
		driver.findElement(By.id("ap_customer_name")).sendKeys(name);
		
		driver.findElement(By.xpath("//*[@id=\"ap_phone_number\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"ap_phone_number\"]")).sendKeys(mobile);
		
		driver.findElement(By.name("secondaryLoginClaim")).clear();
		driver.findElement(By.name("secondaryLoginClaim")).sendKeys(email);
		
		driver.findElement(By.cssSelector("#ap_password")).clear();
		driver.findElement(By.cssSelector("#ap_password")).sendKeys(password);


	}
	
	
	
	
}
