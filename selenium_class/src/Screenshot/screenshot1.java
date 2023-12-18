package Screenshot;


import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot1 {
	public static void main(String[] args) throws InterruptedException, IOException 
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
		           
		           
		       //Take Screenshot  
	   File  Src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);    
		          System.out.println(Src); 
		          
		        //Create object of File
		   File dest=new File("C:\\Users\\Omkar\\OneDrive\\Desktop\\screenshot\\s1.jpg");
		        
		 //Copy screenshot to destination folder
		     FileHandler.copy(Src, dest);       
		          
		         
	}
	
	
	
	
	
	
}
