package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_division {
	public static void main(String[] args) throws InterruptedException
	  {

		  // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		  
		  
		  //Create object of chromedriver class and provide reference of  Webdriver interface             
		            WebDriver driver=new ChromeDriver();
		   
		  
		  driver.get("https://www.flipkart.com/");
		  
		  //wait
		  Thread.sleep(2000);
		  
		  //enter mobile no/email
		  driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc@123");
		  
		//enter password
		  driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("xyz");
		  
		  //click on login button  
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		  
	  }
	
}
