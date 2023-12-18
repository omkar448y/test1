package lunch_browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method9 {
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

		            //To set the size of the browser
		            Dimension D1=new Dimension(400,700);
		            
		            driver.manage().window().setSize(D1);
		          
		         
		      
		            
	}

}
