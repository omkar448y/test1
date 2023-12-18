package pop_up11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99 {

	public static void main(String[] args) throws InterruptedException 
	{
		//to call setprperty method
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//to open application
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		//to enter text
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Omkar");
		
		//to click on submmit button
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		
		//to focus alert popup
		
	Alert alt=	driver.switchTo().alert();
	//alt.accept();
	//alt.accept();
//	alt.dismiss();
	
	String n1=alt.getText();
	System.out.println(n1);
	
	
	
	
		
	}
}
