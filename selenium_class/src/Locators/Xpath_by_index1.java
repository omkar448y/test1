package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_index1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		  
		  
		  //Create object of chromedriver class and provide reference of  Webdriver interface
		                    
		            WebDriver driver=new ChromeDriver();
		  
		       driver.get("https://www.facebook.com/");
		       
		     //Click on create new account button
		     driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		     
		     //wait
		     Thread.sleep(2000);
		     
		     //enter mobile no or email address
		     driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9876543210");
		       
		       
	}
	
	
}
