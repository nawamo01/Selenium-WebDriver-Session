package SeleniumTrainingSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _19_HandlingWebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Core Java Training//Drivers//chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
				
	/*	driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("nazmd8010@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Freecrm@01");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[3]")).click();
		Thread.sleep(3000);
		
		//Method 1:
		
		boolean flag = false;
		 
		for(int row=1; row<=3; row++) {
			for(int col=1; col<=3; col++) {
				String name = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+row+"]/td["+col+"]")).getText();
				Thread.sleep(2000);
				System.out.println(name);
				
				if(name.equals("test test1")) {
					System.out.println(row);
					col = col-1;
					Thread.sleep(500);
					System.out.println(col);
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+row+"]/td["+col+"]/div")).click();
					flag = true;
					break;
				}
				
			}
			
			if(flag==true) {
			break;
			}
			}

*/
		//Method 2: (Recommended Method)
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		driver.findElement(By.xpath("//td[@class ='sorting_1' and text() = 'Brenden Wagner']//parent::tr[@role='row']//td[@class=' select-checkbox']")).click();   //Customized Xpath created by own
		
	}

}
