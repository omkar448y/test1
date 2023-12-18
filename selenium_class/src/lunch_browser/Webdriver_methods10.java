package lunch_browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods10 {
	public static void main(String[] args) throws InterruptedException 
	{
		  // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		  
		  
		  //Create object of chromedriver class and provide reference of  Webdriver interface             
		            WebDriver driver=new ChromeDriver();
		            
		            
		            driver.get("https://www.google.com/");
		            
		       //To change/set position of browser
		            Point P1=new Point(500,400);
		            
		        driver.manage().window().setPosition(P1);  
		         
		      
		            
	}
	
	
	
}
