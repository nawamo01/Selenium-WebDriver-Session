package SeleniumTrainingSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _22_BootStrapDropdown {
	
	/* Difference between normal dropdown and Bootstrap dropdown
	 * Normal dropdown will have tagname with Select --> hence we can use Select object reference variable in selenium
	 * Bootstarp dropdown will not have tagname with select, the tagname would be anything (div,buttons,li,ul..etc)
	 * So we cannot use the Select object reference variable in selenium
	 * We can use Findelements & customized Xpath to select the dropdown value
	*/
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class = 'multiselect dropdown-toggle btn btn-default']")).click();
		Thread.sleep(3000);
		List <WebElement> list = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
		 System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			
		System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("Angular")){
				list.get(i).click();
				break;
				}
		
	}
System.out.println("Program completed");
}
}