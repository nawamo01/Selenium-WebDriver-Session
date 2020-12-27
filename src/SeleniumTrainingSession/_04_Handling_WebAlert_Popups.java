package SeleniumTrainingSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class _04_Handling_WebAlert_Popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Thread.sleep(30000);
		
		// Xpath: /html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2] - we cannot use this
		driver.findElement(By.name("proceed")).click();
		
		// Wait 5 seconds for webpage to load Completely
		Thread.sleep(5000); 
		
		//We cannot inspect the popups in the webpage since it has separate window
		//We have to use Alert & Switch To option to handle this situation
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
	
		//Validate the text
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct Message");
		}
		else
		{
			System.out.println("Incorrect Message");
		}
		
		
		alert.accept(); 		 // Click to OK button
		
		//alert.dismiss();		 // Click to Cancel button  (cancel button is not available on this page)
		
		
		driver.findElement(By.id("login1")).sendKeys("abc@rediffmail.com");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		
		String text1 = alert1.getText();
		
		if(text1.equals("Please enter the password")) {
			System.out.println("Correct Popup Message");
		}
		else
		{
			System.out.println("Incorrect Popup Message");
		}
	Thread.sleep(5000);
	alert1.accept();
	}

}
