package SeleniumTrainingSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Handling_Fileupload_Popups {

	public static void main(String[] args) throws InterruptedException {
		// File uploading option on webpage will open the windows explorer to select the file to upload. 
		// Selenium cannot handle the windows explorer directly so this is an alternative option
		
		System.setProperty("webdriver.chrome.driver","D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		Thread.sleep(5000);
		driver.findElement(By.name("userfile")).sendKeys("C:\\Users\\Mohamed\\Desktop\\test.txt");
		System.out.println("Upload done");

	}

}
