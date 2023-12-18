package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_contains_by_using_text1 
{public static void main(String[] args) throws InterruptedException 
{
	 // Step-I: Set path of chromedriver.exe file
	  //Parameter-I: Name of the browser
	  //Parameter-II: Path of chromedriver.exe file
	  System.setProperty("webdriver.chrome.driver", 
			  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
	  
	  
	  //Create object of chromedriver class and provide reference of  Webdriver interface
	                    
	            WebDriver driver=new ChromeDriver();
	  
	       driver.get("https://www.facebook.com/");
	       
	       //click on forgotton password link
	       driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
	       
}


}
