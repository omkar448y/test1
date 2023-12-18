package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText1 {
	public static void main(String[] args) 
	{
		 // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		  
		  
		  //Create object of chromedriver class and provide reference of  Webdriver interface
		                    
		            WebDriver driver=new ChromeDriver();
		  
		       driver.get("https://www.facebook.com/");
		       
		       //to get the text
		       String text=driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		  
		       	System.out.println(text);
		
		       	
	}
	
	

}
