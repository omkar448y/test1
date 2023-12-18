package lunch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navaigate_method1 {
	public static void main(String[] args) throws InterruptedException 
	{
		  // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		  
		  
		  //Create object of chromedriver class and provide reference of  Webdriver interface             
		            WebDriver driver=new ChromeDriver();
		  
		// To enter URL on the browser/To open an application
		           driver.navigate().to("https://www.flipkart.com/");
		            
		       //wait
		        Thread.sleep(2000);
		        
		     // To enter URL on the browser/To open an application    
		     driver.navigate().to("https://www.google.com/");  
		     
		        //wait
		        Thread.sleep(2000);
		        //To move backward
		      driver.navigate().back(); 
		      
		      //wait
		        Thread.sleep(2000);
		        //to move forword
		        driver.navigate().forward();
		        
		        //wait
		        Thread.sleep(2000);
		        //to refresh webpage
		        driver.navigate().refresh();
		        
		        //wait
		        Thread.sleep(2000);
		        //To close browser
		        driver.close();
		        
		        
		        
		        
		        
		        
		      
		     
	}
	
	
	
	

}
