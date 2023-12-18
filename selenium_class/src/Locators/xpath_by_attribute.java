package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_attribute 
{public static void main(String[] args) 
{
	 // Step-I: Set path of chromedriver.exe file
	  //Parameter-I: Name of the browser
	  //Parameter-II: Path of chromedriver.exe file
	  System.setProperty("webdriver.chrome.driver", 
			  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe" );
	  
	  
	  //Create object of chromedriver class and provide reference of  Webdriver interface
	                    
	            WebDriver driver=new ChromeDriver();
	  
	       driver.get("https://www.facebook.com/");
	       
	       //enter UN
	      driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Omkaryadav448@gmail.com"); 
	

}}
