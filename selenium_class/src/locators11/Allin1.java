package locators11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Allin1 
{
	
	
	public static void main(String args[]) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");		
		
		  
	WebDriver driver=new ChromeDriver();  ///heap area
		driver=new FirefoxDriver();
		driver.get("https://kite.zerodha.com/");
		
		String n1=driver.getTitle();
		System.out.println(n1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("omkaryadav");
		driver.manage().window().maximize();
		
		   Thread.sleep(5000);       
	       driver.quit();
	}
	
	
	

}