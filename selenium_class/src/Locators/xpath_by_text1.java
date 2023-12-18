package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_text1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe" );
		  
		  
		  //Create object of chromedriver class and provide reference of  Webdriver interface
		                    
		            WebDriver driver=new ChromeDriver();
		  
		       driver.get("https://www.facebook.com/");
		       
		       // enter UN
		        driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("xyz");
		        
		                 //wait
		            Thread.sleep(1000);
		
		              //Enter Password
		        driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("abc");
		          
		       
		     //click on login button
		       driver.findElement(By.xpath("//button[text()='Log In']")).click();
		       
		       
		       
		       
	}
	
}
