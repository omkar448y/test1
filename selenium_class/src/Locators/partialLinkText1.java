package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText1 {
	public static void main(String[] args) 
	{
		 // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		  
		  
		  //Create object of chromedriver class and provide reference of  Webdriver interface
		                    
		            WebDriver driver=new ChromeDriver();
		  
		       driver.get("file:///C:/Users/samsung/Desktop/Automation/html%20coding/FBlinkText.html");
		       
		       driver.manage().window().maximize();
		       
		       //click on Facebook link
		       driver.findElement(By.partialLinkText("face")).click();
	
		   
	}
	
}
