package popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_pop_up {
	public static void main(String[] args) throws InterruptedException
	  {

		  // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		  		  
		  //Create object of chromedriver class and provide reference of  Webdriver interface             
		            WebDriver driver=new ChromeDriver(); 
		  
		  driver.get("https://skpatro.github.io/demo/links/");
		  
		  //click on new tab button
		  driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		  
		  //wait
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  
		        Set<String> IDs=driver.getWindowHandles();
		        
		        ArrayList<String> al=new ArrayList<String>(IDs);
		        
		        //to get main page ID
		             String MainpageID=al.get(0);
		             System.out.println(MainpageID);
		             
		         //To get window pop-up ID
		              String  ChildwindowID=al.get(1);
		              System.out.println(ChildwindowID);
		  
		 
		  //shift focus of selenium on window pop-up
		  driver.switchTo().window(ChildwindowID);
		   
		  //click on training link
		  driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		  
		  
		  //shift focus of selenium from window pop-up to main page
		  driver.switchTo().window(MainpageID);
		  
	  }
		  
		
}
