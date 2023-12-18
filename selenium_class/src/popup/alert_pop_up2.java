package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_pop_up2 {
	public static void main(String[] args) throws InterruptedException
	  {

		  // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		  
		  
		  //Create object of chromedriver class and provide reference of  Webdriver interface             
		            WebDriver driver=new ChromeDriver();
		   
		  
		  driver.get("https://demo.guru99.com/test/delete_customer.php");
		  
		  //wait
		  Thread.sleep(2000);
		  
		  //enter Customer Id
		  driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc");
		  
		  
		  //click on submit button
		  driver.findElement(By.xpath("//input[@name='submit']")).click();
		  
		  //shift to alert pop-up
		  Alert alt=driver.switchTo().alert();
		  
		//wait
		  Thread.sleep(2000);
		  
		  //click on cancel button
		    alt.dismiss();
		  
		  
		  
		  
	  }
	
	
	
	
}
