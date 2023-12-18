package lunch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Method8 {

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
		          
		            //To maximize the browser
		            driver.manage().window().maximize();
		            
		            Thread.sleep(3000);
		            
		          //To minimize the browser 
		          driver.manage().window().minimize();  
		            
		      
		            
	}
	
	
	
	
}
