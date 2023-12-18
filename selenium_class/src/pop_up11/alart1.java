package pop_up11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alart1
{
	public static void main(String[] args) throws InterruptedException 
	{
		//to call setproperty method present in systemclass and accept two parameter
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		
		//to create object of chromedriver classs and provide the refrence of webdriver interface
		WebDriver driver=new ChromeDriver();
		//to call get method present in webdriver interface
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//to provide wait 
		Thread.sleep(2000);
		//to enter the text into text filed 
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12346");
		//to click on sublmit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//to change selenium focuse main page to alert pop up
		
		Alert ma=driver.switchTo().alert();
		String p1=ma.getText();
		System.out.println(p1);
		Thread.sleep(2000);
		//to accept alert popuup
		ma.accept();
		//to dismiss poopup
		//ma.dismiss();
		//to accept
		ma.accept();
		
	}
	
	
	
	
	

}
