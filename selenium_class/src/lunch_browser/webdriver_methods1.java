package lunch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_methods1 {
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
		         driver.get("https://www.flipkart.com/");
		
		//Wait/Pause
		         Thread.sleep(1000);
		         
		    //Close browser/to close current tab of browser
		         driver.close();
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
